package org.openmrs.module.isanteplusreports.healthqual.builder;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j2html.tags.ContainerTag;
import org.apache.commons.lang3.builder.Builder;

import static j2html.TagCreator.div;
import static j2html.TagCreator.table;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.tr;

public class HealthQualHtmlTableBuilder implements Builder<String> {
	
	private static final int ROWS = 7;
	
	private static final ContainerTag MALE_LABEL = th("M").withClass("label");
	
	private static final ContainerTag FEMALE_LABEL = th("F").withClass("label");
	
	private static final ContainerTag TOTAL_LABEL = th("Tot").withClass("label");
	
	private static final String PERCENTAGE_STRING_FORMAT = "###.0";
	
	private int numberOfIndicatorsInOneTable = 3; // if there are too many indicators the table will be splitted
	
	private ContainerTag[] rows;
	
	private List<Object> reportData;
	
	private String clinicDepartment;
	
	private String clinic;
	
	@Override
	public String build() {
		ContainerTag tables = div();
		Iterator<Object> iterator = getReportData().iterator();
		while (iterator.hasNext()) {
			tables.with(buildOneTable(iterator));
			setRows(null); // clear already built table
		}
		
		return tables.render();
	}
	
	private ContainerTag buildOneTable(Iterator<Object> iterator) {
		buildClinicInfoTable();
		buildLegend();
		buildPatientsInfo();
		
		for (int i = 0; i < numberOfIndicatorsInOneTable && iterator.hasNext(); ++i) {
			buildIndicator(iterator.next());
		}
		
		return table().with(getRows());
	}
	
	private void buildClinicInfoTable() {
		fillEmptyRow(getRows()[0], 2);
		fillEmptyRow(getRows()[1], 2);
		
		ContainerTag labels = getRows()[2];
		ContainerTag data = getRows()[3];
		
		labels.with(th("Dept.").withClass("label"), th("Clinic").withClass("label"));
		
		data.with(td("A").attr("rowspan", "3"), td("B").attr("rowspan", "3"));
		
	}
	
	private void buildLegend() {
		fillEmptyRow(getRows()[0], 1);
		fillEmptyRow(getRows()[1], 1);
		
		getRows()[2].with(th("Type").withClass("label"));
		getRows()[3].with(td("Adult").withClass("label"));
		getRows()[4].with(td("Ped").withClass("label"));
		getRows()[5].with(td("Total").withClass("label").withClass("total"));
	}
	
	private void buildPatientsInfo() {
		fillEmptyRow(getRows()[0], 3);
		
		getRows()[1].with(th("Patients actifs").attr("colspan", "3").withClass("label"));
		
		buildIndicatorSummary(createSummaryArray(11, 22, 33, 44));
	}
	
	private void buildIndicator(Object data) {
		getRows()[0].with(td("<Indicator Name>").attr("colspan", "9").withClass("indicatorLabel"));
		getRows()[1].with(td("<Nominator>").attr("colspan", "3").withClass("label"), td("<Denominator>")
		        .attr("colspan", "3").withClass("label"), td("%").attr("colspan", "3").withClass("label"));
		
		Integer[][] nominator = createSummaryArray(11, 22, 33, 44);
		buildIndicatorSummary(nominator); // Nominator
		
		Integer[][] denominator = createSummaryArray(33, 44, 55, 66);
		buildIndicatorSummary(denominator); // Denominator
		
		buildIndicatorSummary(createPercentageArray(nominator, denominator)); // Percentage
	}
	
	private <T> void buildIndicatorSummary(T[][] data) {
		getRows()[2].with(MALE_LABEL, FEMALE_LABEL, TOTAL_LABEL);
		
		final int ROW_BASE = 3;
		final int SIZE = 3;
		for (int i = 0; i < SIZE; ++i) {
			for (int j = 0; j < SIZE; ++j) {
				getRows()[ROW_BASE + i].with(td(data[i][j].toString()));
			}
		}
	}
	
	private Integer[][] createSummaryArray(Integer adulteMales, Integer adulteFemales, Integer pediatricMales,
	        Integer pediatricFemales) {
		
		Integer totalMales = adulteMales + pediatricMales;
		Integer totalFemales = adulteFemales + adulteFemales;
		Integer totalAdulte = adulteMales + adulteFemales;
		Integer totalPediatric = pediatricMales + pediatricFemales;
		Integer total = totalAdulte + totalPediatric;
		
		return new Integer[][] { { adulteMales, adulteFemales, totalAdulte },
		        { pediatricMales, pediatricFemales, totalPediatric }, { totalMales, totalFemales, total } };
	}
	
	private String[][] createPercentageArray(Integer[][] dividend, Integer[][] factor) {
		DecimalFormat df = new DecimalFormat(PERCENTAGE_STRING_FORMAT);
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		final int SIZE = 3;
		String result[][] = new String[SIZE][];
		for (int i = 0; i < SIZE; ++i) {
			result[i] = new String[SIZE];
			for (int j = 0; j < SIZE; ++j) {
				result[i][j] = df.format(100.0f * dividend[i][j] / factor[i][j]);
			}
		}
		return result;
	}
	
	// filling by empty <td>
	private void fillEmptyRow(ContainerTag row, Integer length) {
		row.with(td().attr("colspan", length.toString()));
	}
	
	public String getClinic() {
		return clinic;
	}
	
	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	
	public String getClinicDepartment() {
		return clinicDepartment;
	}
	
	public void setClinicDepartment(String clinicDepartment) {
		this.clinicDepartment = clinicDepartment;
	}
	
	public ContainerTag[] getRows() {
		if (rows == null) {
			rows = new ContainerTag[ROWS];
			for (int i = 0; i < ROWS; ++i) {
				rows[i] = tr();
			}
		}
		return rows;
	}
	
	public void setRows(ContainerTag[] rows) {
		this.rows = rows;
	}
	
	public List<Object> getReportData() {
		if (reportData == null) {
			reportData = new LinkedList<Object>();
		}
		return reportData;
	}
	
	public void addReportData(Object i) {
		getReportData().add(i);
	}
	
	public void setReportData(List<Object> reportData) {
		this.reportData = reportData;
	}
	
	public int getNumberOfIndicatorsInOneTable() {
		return numberOfIndicatorsInOneTable;
	}
	
	public void setNumberOfIndicatorsInOneTable(int numberOfIndicatorsInOneTable) {
		this.numberOfIndicatorsInOneTable = numberOfIndicatorsInOneTable;
	}
}
package org.openmrs.module.isanteplusreports.reporting.reports;

import java.util.Arrays;
import java.util.List;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;
import org.openmrs.module.isanteplusreports.library.indicator.NutritionReportIndicatorLibrary;
import org.openmrs.module.isanteplusreports.reporting.utils.ColumnParameters;
import org.openmrs.module.isanteplusreports.reporting.utils.EmrReportingUtils;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.common.MessageUtil;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;

public class NutritionIndicatorReport {
    
    private static final String NUTRITION_INDICATOR_REPORT_UUID = "071f3dbe-98dd-453a-9110-3fad0d10dff8";
    private static final String IND_PARAMS = "startDate=${startDate},endDate=${endDate},location=${location}";

    public static void registerReport() {     
        
        CohortIndicatorDataSetDefinition dsd = reportDataSetDefinition();

        IsantePlusReportsUtil.registerIndicatorReportsWithStartAndEndDateParams(
            "isanteplusreports.nutrition_indicator_report",
            MessageUtil.translate("isanteplusreports.nutrition_indicator_report"),
            NUTRITION_INDICATOR_REPORT_UUID,
            dsd);

    }
    
    private static CohortIndicatorDataSetDefinition reportDataSetDefinition() {
        CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();

        dsd.setName("isanteplusreports.nutrition_indicator_report");
        dsd.setDescription(MessageUtil.translate("isanteplusreports.nutrition_indicator_report"));

        ColumnParameters col = new ColumnParameters("1", "", "");

        List<ColumnParameters> allColumns = Arrays.asList(col);
        
        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_weighed", 
            MessageUtil.translate("isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_weighed"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWeighedCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("01"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_height_or_length_measured",
            MessageUtil.translate(
                "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_height_or_length_measured"),
            ReportUtils.map(NutritionReportIndicatorLibrary
                    .totalNumberOfChildrenAged6MonthsTo59MonthsOldWithHeightOrLengthMeasuredCohort(),
                IND_PARAMS),
            allColumns,
            Arrays.asList("02"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_mam", 
            MessageUtil.translate("isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_mam"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWithMamCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("03"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_sam", 
            MessageUtil.translate("isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_sam"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWithSamCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("04"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.children_aged_6_months_to_59_months_old_with_mam", 
            MessageUtil.translate("isanteplusreports.children_aged_6_months_to_59_months_old_with_mam"),
            ReportUtils.map(NutritionReportIndicatorLibrary.childrenAged6MonthsTo59MonthsOldWithMamCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("05"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.children_aged_6_months_to_59_months_old_with_sam", 
            MessageUtil.translate("isanteplusreports.children_aged_6_months_to_59_months_old_with_sam"),
            ReportUtils.map(NutritionReportIndicatorLibrary.childrenAged6MonthsTo59MonthsOldWithSamCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("06"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_5_to_19_years_old_overweight", 
            MessageUtil.translate("isanteplusreports.total_number_of_children_aged_5_to_19_years_old_overweight"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfChildrenAged5To19YearsOldOverweightCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("07"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_5_to_19_years_old_obese", 
            MessageUtil.translate("isanteplusreports.total_number_of_children_aged_5_to_19_years_old_obese"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfChildrenAged5To19YearsOldObeseCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("08"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness", 
            MessageUtil.translate("isanteplusreports.total_number_of_underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfUnderweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("09"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness", 
            MessageUtil.translate("isanteplusreports.total_number_of_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfChildrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("10"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.overweight_children_aged_5_to_19_years_old", 
            MessageUtil.translate("isanteplusreports.overweight_children_aged_5_to_19_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.overweightChildrenAged5To19YearsOldCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("11"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.obese_children_aged_5_to_19_years_old", 
            MessageUtil.translate("isanteplusreports.obese_children_aged_5_to_19_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.obeseChildrenAged5To19YearsOldCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("12"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness", 
            MessageUtil.translate("isanteplusreports.underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness"),
            ReportUtils.map(NutritionReportIndicatorLibrary.underweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("13"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness", 
            MessageUtil.translate("isanteplusreports.children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness"),
            ReportUtils.map(NutritionReportIndicatorLibrary.childrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("14"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight", 
            MessageUtil.translate("isanteplusreports.total_number_of_people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfPeopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("15"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_overweight_people_aged_gte_20_years_old", 
            MessageUtil.translate("isanteplusreports.total_number_of_overweight_people_aged_gte_20_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfOverweightPeopleAgedGte20YearsOldCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("16"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_obese_people_aged_gte_20_years_old", 
            MessageUtil.translate("isanteplusreports.total_number_of_obese_people_aged_gte_20_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfObesePeopleAgedGte20YearsOldCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("17"));

        EmrReportingUtils.addRow(dsd, "isanteplusreports.total_number_of_underweight_people_aged_gte_20_years_old",
            MessageUtil.translate("isanteplusreports.total_number_of_underweight_people_aged_gte_20_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfUnderweightPeopleAgedGte20YearsOldCohort(),
                IND_PARAMS),
            allColumns, Arrays.asList("18"));
        
        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight", 
            MessageUtil.translate("isanteplusreports.people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight"),
            ReportUtils.map(NutritionReportIndicatorLibrary.peopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("19"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.overweight_people_gte_20_years_old", 
            MessageUtil.translate("isanteplusreports.overweight_people_gte_20_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.overweightPeopleGte20YearsOldCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("20"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.obese_people_aged_gte_20_years_old", 
            MessageUtil.translate("isanteplusreports.obese_people_aged_gte_20_years_old"),
            ReportUtils.map(NutritionReportIndicatorLibrary.obesePeopleAgedGte20YearsOldCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("21"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.people_aged_gte_20_years_old_who_are_underweight", 
            MessageUtil.translate("isanteplusreports.people_aged_gte_20_years_old_who_are_underweight"),
            ReportUtils.map(NutritionReportIndicatorLibrary.peopleAgedGte20YearsOldWhoAreUnderweightCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("22"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_pregnant_women_with_a_muac_lte_210_mm", 
            MessageUtil.translate("isanteplusreports.total_number_of_pregnant_women_with_a_muac_lte_210_mm"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfPregnantWomenWithAMuacLte210MmCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("23"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.total_number_of_pregnant_women_with_a_muac_gte_230_mm", 
            MessageUtil.translate("isanteplusreports.total_number_of_pregnant_women_with_a_muac_gte_230_mm"),
            ReportUtils.map(NutritionReportIndicatorLibrary.totalNumberOfPregnantWomenWithAMuacGte230MmCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("24"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.pregnant_women_with_a_muac_lte_210_mm", 
            MessageUtil.translate("isanteplusreports.pregnant_women_with_a_muac_lte_210_mm"),
            ReportUtils.map(NutritionReportIndicatorLibrary.pregnantWomenWithAMuacLte210MmCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("25"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.pregnant_women_with_a_muac_gte_230_mm", 
            MessageUtil.translate("isanteplusreports.pregnant_women_with_a_muac_gte_230_mm"),
            ReportUtils.map(NutritionReportIndicatorLibrary.pregnantWomenWithAMuacGte230MmCohort(), IND_PARAMS),
            allColumns,
            Arrays.asList("26"));

        return dsd;
    }
        
}
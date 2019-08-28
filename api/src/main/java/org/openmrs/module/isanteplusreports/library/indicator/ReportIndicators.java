package org.openmrs.module.isanteplusreports.library.indicator;

import static org.openmrs.module.isanteplusreports.reporting.utils.EmrReportingUtils.cohortIndicator;
import static org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils.map;

import org.openmrs.module.isanteplusreports.library.cohort.ReportCohort;
import org.openmrs.module.reporting.indicator.CohortIndicator;

public class ReportIndicators {

	public static CohortIndicator vlIndicator(String sql) {
		return cohortIndicator("# VL Patients",
				map(ReportCohort.vlCohort(sql), "startDate=${startDate},endDate=${endDate},location=${location}"));
	}

    public static CohortIndicator patientsWithRespiratorySymptomsIndicator(String sql) {
        return cohortIndicator("# Patients with respiratory symptoms",
                map(ReportCohort.patientsWithRespiratorySymptomsCohort(sql), "startDate=${startDate},endDate=${endDate},location=${location}"));
    }

    public static CohortIndicator patientsWithSputumOrdered(String sql) {
        return cohortIndicator("# Patients with sputum ordered",
                map(ReportCohort.patientsWithSputumOrderedCohort(sql), "startDate=${startDate},endDate=${endDate},location=${location}"));
    }
}

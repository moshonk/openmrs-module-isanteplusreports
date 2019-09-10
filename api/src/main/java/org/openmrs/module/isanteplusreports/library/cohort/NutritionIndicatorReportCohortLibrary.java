package org.openmrs.module.isanteplusreports.library.cohort;

import java.util.Date;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.isanteplusreports.util.IsantePlusReportsConstants;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.common.MessageUtil;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

public class NutritionIndicatorReportCohortLibrary implements IsanteIndicatorReportCohortLibrary {
    
    private static final Parameter LOCATION = new Parameter("location", "Location", Date.class);
    
    private static final Parameter END_DATE = new Parameter("endDate", "End Date", Date.class);
    
    private static final Parameter START_DATE = new Parameter("startDate", "Start Date", Date.class);
    
    private static final String COHORT_PARAMS = "startDate=${startDate},endDate=${endDate},location=${location}";
    
    public static SqlCohortDefinition sqlCohortDefinition(String sqlResourceName, String cohortDefinitionName) {
        String sql = IsantePlusReportsUtil
                .getStringFromResource(IsantePlusReportsConstants.NUTRITION_INDICATORS_RESOURCE_PATH + sqlResourceName);
        
        SqlCohortDefinition definition = IsantePlusReportsUtil.sqlCohortDefinition(sql, cohortDefinitionName,
            MessageUtil.translate(cohortDefinitionName));
        
        return definition;
    }
    
    /**
     * @should not return null object
     */
    public static CompositionCohortDefinition compositionCohortDefinition(String cohortDefinitionName) {
        CompositionCohortDefinition cd = new CompositionCohortDefinition();
        cd.setName(cohortDefinitionName);
        cd.addParameter(START_DATE);
        cd.addParameter(END_DATE);
        cd.addParameter(LOCATION);
        
        return cd;
    }
    
    /**
     * @should return correct count
     */
    public static CohortDefinition childrenAged5To19Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenAged5To19.sql",
            "isanteplusreports.children_aged_5_to_19");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition childrenAged6MTo59MCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenAged5MTo59M.sql",
            "isanteplusreports.children_aged_6m_to_59m");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsAged20AndOverCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsAged20AndOver.sql",
            "isanteplusreports.patients_aged_20_and_over");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWhoAreObeseCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWhoAreObese.sql",
            "isanteplusreports.patients_who_are_obese");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWhoAreOverweightCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWhoAreOverweight.sql",
            "isanteplusreports.patients_who_are_overweight");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWhoAreUnderweightCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWhoAreUnderweight.sql",
            "isanteplusreports.patients_who_are_underweight");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithWeightMeasuredCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWithWeightMeasured.sql",
            "isanteplusreports.patients_with_weight_measured");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition childrenWithMamCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenWithMam.sql",
            "isanteplusreports.children_with_mam");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithMuacGte230Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWithMuacGte230.sql",
            "isanteplusreports.patients_with_muac_gte_230");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithMuacLte210Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWithMuacLte210.sql",
            "isanteplusreports.patients_with_muac_lte_210");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithNormalWeightCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWithNormalWeight.sql",
            "isanteplusreports.patients_with_normal_weight");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition childrenWithSamCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenWithSam.sql",
            "isanteplusreports.children_with_sam");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition childrenWithSevereThinnessCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenWithSevereThinness.sql",
            "isanteplusreports.children_with_severe_thinness");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition childrenWithThinnessCohort() {
    
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenWithThinness.sql",
            "isanteplusreports.children_with_thinness");
    
        return cohortDefinition;
    }
    
    public static CohortDefinition patientVisitsCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientVisits.sql", "isanteplusreports.patient_visits");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition pregnantWomenCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PregnantWomen.sql", "isanteplusreports.pregnant_women");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithMuacRecordedCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWithMuacRecorded.sql",
            "isanteplusreports.patients_with_muac_recorded");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition childrenWhoAreOverweightCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenWhoAreOverweight.sql",
            "isanteplusreports.children_who_are_overweight");
        
        return cohortDefinition;
    }

    public static CohortDefinition childrenWhoAreObeseCohort() {
    
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("ChildrenWhoAreObese.sql",
            "isanteplusreports.children_who_are_obese");
    
        return cohortDefinition;
    }
    
    public static CohortDefinition pregnantWomenWithMuacMeasuredCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PregnantWomenWithMuacMeasured.sql",
            "isanteplusreports.pregnant_women_with_muac_measured");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithHeightMeasuredCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition("PatientsWithHeightMeasured.sql",
            "isanteplusreports.patients_with_height_measured");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged6MonthsTo59MonthsOldWithMamCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_mam");
        
        cd.addSearch("children6mTo59m", ReportUtils.map(childrenAged6MTo59MCohort(), COHORT_PARAMS));
        cd.addSearch("mam", ReportUtils.map(childrenWithMamCohort(), COHORT_PARAMS));
        cd.setCompositionString("children6mTo59m AND mam");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged6MonthsTo59MonthsOldWithSamCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_sam");

        cd.addSearch("children6mTo59m", ReportUtils.map(childrenAged6MTo59MCohort(), COHORT_PARAMS));
        cd.addSearch("sam", ReportUtils.map(childrenWithSamCohort(), COHORT_PARAMS));
        cd.setCompositionString("children6mTo59m AND sam");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged5To19YearsOldOverweightCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_children_aged_5_to_19_years_old_overweight");

        cd.addSearch("children5To19", ReportUtils.map(childrenAged5To19Cohort(), COHORT_PARAMS));
        cd.addSearch("overweight", ReportUtils.map(childrenWhoAreOverweightCohort(), COHORT_PARAMS));
        cd.setCompositionString("children5To19 AND overweight");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness");

        cd.addSearch("children5To19", ReportUtils.map(childrenAged5To19Cohort(), COHORT_PARAMS));
        cd.addSearch("severelyThin", ReportUtils.map(childrenWithSevereThinnessCohort(), COHORT_PARAMS));
        cd.setCompositionString("children5To19 AND severelyThin");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfOverweightChildrenAged5To19YearsOldCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_overweight_children_aged_5_to_19_years_old");

        cd.addSearch("children5To19", ReportUtils.map(childrenAged5To19Cohort(), COHORT_PARAMS));
        cd.addSearch("overweight", ReportUtils.map(childrenWhoAreOverweightCohort(), COHORT_PARAMS));
        cd.setCompositionString("children5To19 AND overweight");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfObeseChildrenAged5To19YearsCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_obese_children_aged_5_to_19_years");

        cd.addSearch("children5To19", ReportUtils.map(childrenAged5To19Cohort(), COHORT_PARAMS));
        cd.addSearch("obese", ReportUtils.map(childrenWhoAreObeseCohort(), COHORT_PARAMS));
        cd.setCompositionString("children5To19 AND overweight");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfUnderweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness");

        cd.addSearch("children5To19", ReportUtils.map(childrenAged5To19Cohort(), COHORT_PARAMS));
        cd.addSearch("thin", ReportUtils.map(childrenWithThinnessCohort(), COHORT_PARAMS));
        cd.setCompositionString("children5To19 AND thin");
        
        return cd;
    }
        
    public static CohortDefinition totalNumberOfPeopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight");

        cd.addSearch("adults", ReportUtils.map(patientsAged20AndOverCohort(), COHORT_PARAMS));
        cd.addSearch("normal", ReportUtils.map(patientsWithNormalWeightCohort(), COHORT_PARAMS));
        cd.setCompositionString("adults AND normal");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfOverweightPeopleAgedGte20YearsOldCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_overweight_people_aged_gte20_years_old");

        cd.addSearch("adults", ReportUtils.map(patientsAged20AndOverCohort(), COHORT_PARAMS));
        cd.addSearch("overweight", ReportUtils.map(patientsWhoAreOverweightCohort(), COHORT_PARAMS));
        cd.setCompositionString("adults AND overweight");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfObesePeopleAgedGte20YearsOldCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_obese_people_aged_gte_20_years_old");

        cd.addSearch("adults", ReportUtils.map(patientsAged20AndOverCohort(), COHORT_PARAMS));
        cd.addSearch("obese", ReportUtils.map(patientsWhoAreObeseCohort(), COHORT_PARAMS));
        cd.setCompositionString("adults AND obese");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfUnderweightPeopleAgedGte20YearsOldCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_underweight_people_aged_gte_20_years_old");
        
        cd.addSearch("adults", ReportUtils.map(patientsAged20AndOverCohort(), COHORT_PARAMS));
        cd.addSearch("underweight", ReportUtils.map(patientsWhoAreUnderweightCohort(), COHORT_PARAMS));
        cd.setCompositionString("adults AND underweight");
        
        return cd;
    }
        
    public static CohortDefinition totalNumberOfOverweightPeopleGte20YearsOldCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_overweight_people_gte_20_years_old");

        cd.addSearch("adults", ReportUtils.map(patientsAged20AndOverCohort(), COHORT_PARAMS));
        cd.addSearch("overweight", ReportUtils.map(patientsWhoAreOverweightCohort(), COHORT_PARAMS));
        cd.setCompositionString("adults AND overweight");
        
        return cd;
    }
            
    public static CohortDefinition totalNumberOfPregnantWomenWithAMuacLte210MmCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_pregnant_women_with_a_muac_lte_210_mm");

        cd.addSearch("pregnant", ReportUtils.map(pregnantWomenCohort(), COHORT_PARAMS));
        cd.addSearch("muaclte210", ReportUtils.map(patientsWithMuacLte210Cohort(), COHORT_PARAMS));
        cd.setCompositionString("pregnant AND muaclte210");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfPregnantWomenWithAMuacGte230MmCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.total_number_of_pregnant_women_with_a_muac_gte_230_mm");

        cd.addSearch("pregnant", ReportUtils.map(pregnantWomenCohort(), COHORT_PARAMS));
        cd.addSearch("muacgte230", ReportUtils.map(patientsWithMuacGte230Cohort(), COHORT_PARAMS));
        cd.setCompositionString("pregnant AND muacgte230");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged6MonthsTo59MonthsOldWeighedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_weighed");
        
        cd.addSearch("children6mTo59m", ReportUtils.map(childrenAged6MTo59MCohort(), COHORT_PARAMS));
        cd.addSearch("weightmeasured", ReportUtils.map(patientsWithWeightMeasuredCohort(), COHORT_PARAMS));
        cd.setCompositionString("children6mTo59m AND weightmeasured");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged6MonthsTo59MonthsOldWithWeightAndHeightReportedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_weight_and_height_reported");
        
        cd.addSearch("children6mTo59m", ReportUtils.map(childrenAged6MTo59MCohort(), COHORT_PARAMS));
        cd.addSearch("weightmeasured", ReportUtils.map(patientsWithWeightMeasuredCohort(), COHORT_PARAMS));
        cd.addSearch("heightmeasured", ReportUtils.map(patientsWithHeightMeasuredCohort(), COHORT_PARAMS));
        cd.setCompositionString("children6mTo59m AND weightmeasured AND heightmeasured");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged5To19YearsOldWithWeightAndHeightReportedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_children_aged_5_to_19_years_old_with_weight_and_height_reported");
        
        cd.addSearch("children5To19", ReportUtils.map(childrenAged5To19Cohort(), COHORT_PARAMS));
        cd.addSearch("weightmeasured", ReportUtils.map(patientsWithWeightMeasuredCohort(), COHORT_PARAMS));
        cd.addSearch("heightmeasured", ReportUtils.map(patientsWithHeightMeasuredCohort(), COHORT_PARAMS));
        cd.setCompositionString("children5To19 AND weightmeasured AND heightmeasured");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfPeopleAgedGte20YearsOldWithWeightAndHeightReportedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_people_aged_gte_20_years_old_with_weight_and_height_reported");
        
        cd.addSearch("adults", ReportUtils.map(patientsAged20AndOverCohort(), COHORT_PARAMS));
        cd.addSearch("weightmeasured", ReportUtils.map(patientsWithWeightMeasuredCohort(), COHORT_PARAMS));
        cd.addSearch("heightmeasured", ReportUtils.map(patientsWithHeightMeasuredCohort(), COHORT_PARAMS));
        cd.setCompositionString("adults AND weightmeasured AND heightmeasured");
        
        return cd;
    }
    
    public static CohortDefinition totalNumberOfChildrenAged6MonthsTo59MonthsOldWithHeightOrLengthMeasuredCohort() {
    
        CompositionCohortDefinition cd = compositionCohortDefinition(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_height_or_length_measured");
        
        cd.addSearch("children6mTo59m", ReportUtils.map(childrenAged6MTo59MCohort(), COHORT_PARAMS));
        cd.addSearch("heightmeasured", ReportUtils.map(patientsWithHeightMeasuredCohort(), COHORT_PARAMS));
        cd.setCompositionString("children6mTo59m AND heightmeasured");
    
        return cd;
    }
    
}

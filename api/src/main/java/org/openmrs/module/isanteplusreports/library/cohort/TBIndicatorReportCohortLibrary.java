package org.openmrs.module.isanteplusreports.library.cohort;

import java.util.Date;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;
import org.openmrs.module.isanteplusreports.util.IsantePlusReportsConstants;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;
import org.openmrs.module.reporting.common.MessageUtil;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

public class TBIndicatorReportCohortLibrary {
    
    private static final Parameter LOCATION = new Parameter("location", "Location", Date.class);
    private static final Parameter END_DATE = new Parameter("endDate", "End Date", Date.class);
    private static final Parameter START_DATE = new Parameter("startDate", "Start Date", Date.class);
    private static final String COHORT_PARAMS = "startDate=${startDate},endDate=${endDate},location=${location}";

    private static SqlCohortDefinition sqlCohortDefinition(String sqlResourceName, String cohortDefinitionName) {
        String sql = IsantePlusReportsUtil.getStringFromResource(
            IsantePlusReportsConstants.TB_INDICATORS_RESOURCE_PATH + sqlResourceName );

        SqlCohortDefinition definition = IsantePlusReportsUtil.sqlCohortDefinition(
            sql,
            cohortDefinitionName,
            MessageUtil.translate(cohortDefinitionName));

        return definition;
    }
    
    private static CompositionCohortDefinition compositionCohortDefinition(String cohortDefinitionName) {

        CompositionCohortDefinition cd = new CompositionCohortDefinition();
        cd.setName(cohortDefinitionName);
        cd.addParameter(START_DATE);
        cd.addParameter(END_DATE);
        cd.addParameter(LOCATION);

        return cd;
    }

    public static CohortDefinition patientsWithRespiratorySymptomsCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithRespiratorySymptoms.sql", 
            "isanteplusreports.patients_with_respiratory_symptoms");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithSputumOrderedCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumOrdered.sql", 
            "isanteplusreports.patients_with_sputum_ordered");
        
        return cohortDefinition;
    }

    public static CohortDefinition patientsWithExtraPulmonaryTbCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithExtraPulmonaryTB.sql", 
            "isanteplusreports.patients_with_extrapulmonary_tb");
        
        return cohortDefinition;
    }    

    public static CohortDefinition patientsWithNewTbDiagnosisCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithNewTBDiagnosis.sql", 
            "isanteplusreports.patients_with_new_tb_diagnosis");
        
        return cohortDefinition;
    }

    public static CohortDefinition patientsWithPulmonaryTbCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithPulmonaryTB.sql", 
            "isanteplusreports.patients_with_pulmonary_tb");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithSputumNegativeResultCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumNegativeResult.sql", 
            "isanteplusreports.patients_with_sputum_negative_result");
        
        return cohortDefinition;
    }    

    public static CohortDefinition patientsWithSputumPositiveResultCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumPositiveResult.sql", 
            "isanteplusreports.patients_with_sputum_positive_result");
        
        return cohortDefinition;
    }

    public static CohortDefinition adultPatientsCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "AdultPatients.sql", 
            "isanteplusreports.adult_patients");
        
        return cohortDefinition;
    }

    public static CohortDefinition paedPatientsCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PaedPatients.sql", 
            "isanteplusreports.paed_patients");
        
        return cohortDefinition;
    }

    public static CohortDefinition patientsInTbTreatmentCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsInTBTreatment.sql", 
            "isanteplusreports.patients_in_tb_treatment");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition PatientsWhoStartedTbTreatment() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoStartedTbTreatment.sql", 
            "isanteplusreports.patients_who_started_tb_treatment");
        
        return cohortDefinition;
    }
    
    public static CohortDefinition patientsWithSputumResultAtMonth0Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumResultAtMonth0.sql",
            "isanteplusreports.patients_with_sputum_result_at_month0");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWithSputumResultAtMonth2Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumResultAtMonth2.sql",
            "isanteplusreports.patients_with_sputum_result_at_month2");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWithSputumResultAtMonth3Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumResultAtMonth3.sql",
            "isanteplusreports.patients_with_sputum_result_at_month3");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWithSputumResultAtEndCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumResultAtEnd.sql", 
            "isanteplusreports.patients_with_sputum_result_at_end");
        
        return cohortDefinition;
    }
 
    public static CohortDefinition patientsWithSputumResultAtMonth5Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithSputumResultAtMonth5.sql",
            "isanteplusreports.patients_with_sputum_result_at_month5");
        
        return cohortDefinition;
    } 
    
    public static CohortDefinition patientsWithASputumPositiveResultAtMonth0Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithASputumPositiveResultAtMonth0.sql",
            "isanteplusreports.patients_with_a_sputum_positive_result_at_month0");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWithASputumNegativeResultAtMonth0Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithASputumNegativeResultAtMonth0.sql",
            "isanteplusreports.patients_with_a_sputum_negative_result_at_month0");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWithASputumNegativeResultAtMonth2Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithASputumNegativeResultAtMonth2.sql",
            "isanteplusreports.patients_with_a_sputum_negative_result_at_month2");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWithASputumNegativeResultAtMonth3Cohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithASputumNegativeResultAtMonth3.sql",
            "isanteplusreports.patients_with_a_sputum_negative_result_at_month3");
        
        return cohortDefinition;
    } 

    public static CohortDefinition curedTbPatientsCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "CuredTbPatients.sql",
            "isanteplusreports.cured_tb_patients");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoCompletedTbTreatmentCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoCompletedTbTreatment.sql",
            "isanteplusreports.patients_who_completed_tb_treatment");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoFailedTbTreatmentCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoFailedTbTreatment.sql",
            "isanteplusreports.patients_who_failed_tb_treatment");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoDidNotFinishTbTreatmentCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoDidNotFinishTbTreatment.sql",
            "isanteplusreports.patients_who_did_not_finish_tb_treatment");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoDiedCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoDied.sql",
            "isanteplusreports.patients_who_died");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoTransferredOutCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoTransferredOut.sql",
            "isanteplusreports.patients_who_transferred_out");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoTestedForHivCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoTestedForHiv.sql",
            "isanteplusreports.patients_who_tested_for_hiv");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoTestedHivPositiveCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoTestedHivPositive.sql",
            "isanteplusreports.patients_who_tested_hiv_positive");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsReceivingCotrimoxazoleProphylaxisCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsReceivingCotrimoxazoleProphylaxis.sql",
            "isanteplusreports.patients_receiving_cotrimoxazole_prophylaxis");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsWhoAreOnArvCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWhoAreOnArv.sql",
            "isanteplusreports.patients_who_are_on_arv");
        
        return cohortDefinition;
    } 

    public static CohortDefinition allVisitsCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "AllVisits.sql",
            "isanteplusreports.all_visits");
        
        return cohortDefinition;
    } 

    public static CohortDefinition patientsAgedLessThan60MCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsAgedLessThan60M.sql",
            "isanteplusreports.patients_aged_less_than_60m");
        
        return cohortDefinition;
    } 
    
    public static CohortDefinition patientsWithTbMeningitisCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithTbMeningitis.sql", 
            "isanteplusreports.patients_with_tb_meningitis");
        
        return cohortDefinition;
    }
 
     

    public static CohortDefinition patientsWithRespiratorySymptomsAndSputumOrderedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_respiratory_symptoms_and_sputum_ordered");
        cd.addSearch("withRespiratorySymptoms", ReportUtils.map(patientsWithRespiratorySymptomsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumOrdered", ReportUtils.map(patientsWithRespiratorySymptomsCohort(), COHORT_PARAMS));
        cd.setCompositionString("withRespiratorySymptoms AND withSputumOrdered");
        
        return cd;
    }
    
    public static CohortDefinition patientsWithRespiratorySymptomsAndSputumPositiveResultCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_respiratory_symptoms_and_sputum_positive_result");
        cd.addSearch("withRespiratorySymptoms", ReportUtils.map(patientsWithRespiratorySymptomsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumPositive", ReportUtils.map(patientsWithSputumPositiveResultCohort(), COHORT_PARAMS));
        cd.setCompositionString("withRespiratorySymptoms AND withSputumPositive");
        
        return cd;
    }
    
    public static CohortDefinition patientsWithRespiratorySymptomsAndSputumResultCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_respiratory_symptoms_and_sputum_result");
        cd.addSearch("withRespiratorySymptoms", ReportUtils.map(patientsWithRespiratorySymptomsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumPositive", ReportUtils.map(patientsWithSputumPositiveResultCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumNegative", ReportUtils.map(patientsWithSputumNegativeResultCohort(), COHORT_PARAMS));
        cd.setCompositionString("withRespiratorySymptoms AND (withSputumPositive OR withSputumNegative)");
        
        return cd;
    }
    
    public static CohortDefinition newAdultPulmonaryTbPatientsCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_adult_pulmonary_tb_patients");
        cd.addSearch("adultPatients", ReportUtils.map(adultPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withNewTbDiagnosis", ReportUtils.map(patientsWithNewTbDiagnosisCohort(), COHORT_PARAMS));
        cd.addSearch("withPulmonaryTbClassification", ReportUtils.map(patientsWithPulmonaryTbCohort(), COHORT_PARAMS));
        cd.setCompositionString("adultPatients AND withNewTbDiagnosis AND withPulmonaryTbClassification");
        
        return cd;
    }
    
    public static CohortDefinition newAdultPulmonaryTbPatientsWithSputumPositiveResultCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_adult_pulmonary_tb_patients_with_sputum_positive");
        cd.addSearch("newAdultPulmonaryTbPatients", ReportUtils.map(newAdultPulmonaryTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumPositiveResult", ReportUtils.map(patientsWithSputumPositiveResultCohort(), COHORT_PARAMS));
        cd.setCompositionString("newAdultPulmonaryTbPatients AND withSputumPositiveResult");
        
        return cd;
    }

    public static CohortDefinition newChildPulmonaryTbPatientsCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_child_pulmonary_tb_patients");
        cd.addSearch("paedPatients", ReportUtils.map(paedPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withNewTbDiagnosis", ReportUtils.map(patientsWithNewTbDiagnosisCohort(), COHORT_PARAMS));
        cd.addSearch("withPulmonaryTbClassification", ReportUtils.map(patientsWithPulmonaryTbCohort(), COHORT_PARAMS));
        cd.setCompositionString("paedPatients AND withNewTbDiagnosis AND withPulmonaryTbClassification");
        
        return cd;
    }
    
    public static CohortDefinition newChildPulmonaryTbPatientsWithSputumPositiveResultCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_child_pulmonary_tb_patients_with_sputum_positive");
        cd.addSearch("newChildPulmonaryTbPatients", ReportUtils.map(newChildPulmonaryTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumPositiveResult", ReportUtils.map(patientsWithSputumPositiveResultCohort(), COHORT_PARAMS));
        cd.setCompositionString("newChildPulmonaryTbPatients AND withSputumPositiveResult");
        
        return cd;
    }
    
    public static CohortDefinition newAdultPulmonaryTbPatientsWithSputumNegativeResultCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_adult_pulmonary_tb_patients_with_negative_sputum");
        cd.addSearch("newAdultPulmonaryTbPatients", ReportUtils.map(newAdultPulmonaryTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumNegativeResult", ReportUtils.map(patientsWithSputumNegativeResultCohort(), COHORT_PARAMS));
        cd.setCompositionString("newAdultPulmonaryTbPatients AND withSputumNegativeResult");
        
        return cd;
    }

    public static CohortDefinition newChildPulmonaryTbPatientsWithSputumNegativeResultCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_child_pulmonary_tb_patients_with_negative_sputum");
        cd.addSearch("newChildPulmonaryTbPatients", ReportUtils.map(newChildPulmonaryTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumNegativeResult", ReportUtils.map(patientsWithSputumNegativeResultCohort(), COHORT_PARAMS));
        cd.setCompositionString("newChildPulmonaryTbPatients AND withSputumNegativeResult");
        
        return cd;
    }

    public static CohortDefinition newAdultTbPatientsCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_adult_tb_patients");
        cd.addSearch("adultPatients", ReportUtils.map(adultPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withNewTbDiagnosis", ReportUtils.map(patientsWithNewTbDiagnosisCohort(), COHORT_PARAMS));
        cd.addSearch("allTbCases", ReportUtils.map(allTbCasesCohort(), COHORT_PARAMS));
        cd.setCompositionString("adultPatients AND withNewTbDiagnosis AND allTbCases");
        
        return cd;
    }
    
    public static CohortDefinition newAdultExtraPulmonaryTbPatientsCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_adult_extrapulmonary_tb_patients");
        cd.addSearch("newAdultTbPatients", ReportUtils.map(newAdultTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withExtraPulmonaryTbClassification", ReportUtils.map(patientsWithExtraPulmonaryTbCohort(), COHORT_PARAMS));
        cd.setCompositionString("newAdultTbPatients AND withExtraPulmonaryTbClassification");
        
        return cd;
    }

    public static CohortDefinition newChildTbPatientsCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_child_tb_patients");
        cd.addSearch("paedPatients", ReportUtils.map(paedPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withNewTbDiagnosis", ReportUtils.map(patientsWithNewTbDiagnosisCohort(), COHORT_PARAMS));
        cd.addSearch("allTbCases", ReportUtils.map(allTbCasesCohort(), COHORT_PARAMS));
        cd.setCompositionString("paedPatients AND withNewTbDiagnosis AND allTbCases");
        
        return cd;
    }
    
    public static CohortDefinition newChildExtraPulmonaryTbPatientsCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_child_extrapulmonary_tb_patients");
        cd.addSearch("newChildTbPatients", ReportUtils.map(newChildTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("withExtraPulmonaryTbClassification", ReportUtils.map(patientsWithExtraPulmonaryTbCohort(), COHORT_PARAMS));
        cd.setCompositionString("newChildTbPatients AND withExtraPulmonaryTbClassification");
        
        return cd;
    }
    
    public static CohortDefinition allTbCasesCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_child_extrapulmonary_tb_patients");
        cd.addSearch("withPulmonaryTbClassification", ReportUtils.map(patientsWithPulmonaryTbCohort(), COHORT_PARAMS));
        cd.addSearch("withExtraPulmonaryTbClassification", ReportUtils.map(patientsWithExtraPulmonaryTbCohort(), COHORT_PARAMS));
        cd.setCompositionString("withPulmonaryTbClassification OR withExtraPulmonaryTbClassification");
        
        return cd;
    }

    public static CohortDefinition patientsInTreatmentWithAPositiveSputumOnMonth0Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_in_treatment_with_a_positive_sputum_on_month_0");

        cd.addSearch("inTBTreatment", ReportUtils.map(patientsInTbTreatmentCohort(), COHORT_PARAMS));
        cd.addSearch("positiveSputumMonth0", ReportUtils.map(patientsWithASputumPositiveResultAtMonth0Cohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatment AND positiveSputumMonth0");
        
        return cd;
    }
    
    
    public static CohortDefinition tbPatientsInTreatmentWhoReceivedASputumTestOnMonth3Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_in_treatment_who_received_a_sputum_test_(tpm)_on_month_3");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("receivedSputumMonth3", ReportUtils.map(patientsWithSputumResultAtMonth3Cohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND receivedSputumMonth3");
        
        return cd;
    }

    
    public static CohortDefinition tbPatientsInTreatmentWhoReceivedASputumTestOnMonth2Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_in_treatment_who_received_a_sputum_test_on_month_2");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("receivedSputumMonth2", ReportUtils.map(patientsWithSputumResultAtMonth2Cohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND receivedSputumMonth2");
        
        return cd;
    }

    public static CohortDefinition tbPatientsInTreatmentWhoConvertedFromPositiveSputumOnMonth0ToNegativeOnMonth2Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_in_treatment_who_converted_from_positive_sputum_on_month_0_to_negative_on_month_2");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("negativeSputumMonth2", ReportUtils.map(patientsWithASputumNegativeResultAtMonth2Cohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND negativeSputumMonth2");
        
        return cd;
    }

    public static CohortDefinition tbPatientsInTreatmentWhoConvertedFromAPositiveSputumOnMonth0ToNegativeOnMonth3Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_in_treatment_who_converted_from_a_positive_sputum_on_month_0_to_negative_on_month_3");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("negativeSputumMonth3", ReportUtils.map(patientsWithASputumNegativeResultAtMonth3Cohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND negativeSputumMonth3");
        
        return cd;
    }
    

    public static CohortDefinition cureRateCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.cure_rate");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("cured", ReportUtils.map(curedTbPatientsCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND cured");
        
        return cd;
    }
    
    public static CohortDefinition patientsWhoWereSputumPositiveAndFinishedTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_who_were_sputum_positive_and_finished_treatment");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("finishedTreatment", ReportUtils.map(patientsWhoCompletedTbTreatmentCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND finishedTreatment");
        
        return cd;
    }   

    public static CohortDefinition patientsWhoAreSputumNegativeAndOnTreatmentCohort() {

        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_who_are_sputum_negative_and_on_treatment");

        cd.addSearch("inTBTreatment", ReportUtils.map(patientsInTbTreatmentCohort(), COHORT_PARAMS));
        cd.addSearch("negativeSputumMonth0", ReportUtils.map(patientsWithASputumNegativeResultAtMonth0Cohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatment AND negativeSputumMonth0");
        
        return cd;
    }
     
    
    public static CohortDefinition patientsWhoWereSputumNegativeAndFinishedTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_who_were_sputum_negative_and_finished_treatment");

        cd.addSearch("inTBTreatmentAndNegativeSputumMonth0", ReportUtils.map(patientsWhoAreSputumNegativeAndOnTreatmentCohort(), COHORT_PARAMS));
        cd.addSearch("finishedTreatment", ReportUtils.map(patientsWhoCompletedTbTreatmentCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndNegativeSputumMonth0 AND finishedTreatment");
        
        return cd;
    }
    
    public static CohortDefinition patientsWhoWereInitiallySputumPositiveAndCuredOrFinishedTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_who_were_initially_sputum_positive_and_cured_or_finished_treatment");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("cured", ReportUtils.map(curedTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("finishedTreatment", ReportUtils.map(patientsWhoCompletedTbTreatmentCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND (cured OR finishedTreatment)");
        
        return cd;
    }    

    public static CohortDefinition patientsInitiallySputumPositiveWhoFailedTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_initially_sputum_positive_who_failed_treatment");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("failedTreatment", ReportUtils.map(patientsWhoFailedTbTreatmentCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND failedTreatment");
        
        return cd;
    }
 

    public static CohortDefinition patientsWithInitialSputumPositiveWhoDidNotFinishTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_initial_sputum_positive_who_did_not_finish_treatment");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("didNotFinishTreatment", ReportUtils.map(patientsWhoDidNotFinishTbTreatmentCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND didNotFinishTreatment");
        
        return cd;
    }

    public static CohortDefinition patientsWithInitialSputumPositiveAndOnTreatmentWhoDiedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_initial_sputum_positive_and_on_treatment_who_died");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("died", ReportUtils.map(patientsWhoDiedCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND died");
        
        return cd;
    }
     
    public static CohortDefinition patientsWithInitialSputumPositiveWhoTransferredTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_initial_sputum_positive_who_transferred_treatment");

        cd.addSearch("inTBTreatmentAndPositiveSputumMonth0", ReportUtils.map(patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("transferred", ReportUtils.map(patientsWhoTransferredOutCohort(), COHORT_PARAMS));
        cd.setCompositionString("inTBTreatmentAndPositiveSputumMonth0 AND transferred");
        
        return cd;
    }

    public static CohortDefinition tbPatientsTestedForHivCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_tested_for_hiv");

        cd.addSearch("tbPatients", ReportUtils.map(allTbCasesCohort(), COHORT_PARAMS));
        cd.addSearch("testedHiv", ReportUtils.map(patientsWhoTestedForHivCohort(), COHORT_PARAMS));
        cd.setCompositionString("tbPatients AND testedHiv");
        
        return cd;
    }
     
    public static CohortDefinition tbPatientsWhoTestedPositiveForHivCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_who_tested_positive_for_hiv");

        cd.addSearch("tbPatients", ReportUtils.map(allTbCasesCohort(), COHORT_PARAMS));
        cd.addSearch("testedHivPositive", ReportUtils.map(patientsWhoTestedHivPositiveCohort(), COHORT_PARAMS));
        cd.setCompositionString("tbPatients AND testedHivPositive");
        
        return cd;
    }
     
 

    public static CohortDefinition tbPatientsCoinfectedWithHivBeingTreatedWithCotrimoxazoleProphylaxisCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_coinfected_with_hiv_being_treated_with_cotrimoxazole_prophylaxis");

        cd.addSearch("tbPatientsCoinfected", ReportUtils.map(tbPatientsWhoTestedPositiveForHivCohort(), COHORT_PARAMS));
        cd.addSearch("withCtx", ReportUtils.map(patientsReceivingCotrimoxazoleProphylaxisCohort(), COHORT_PARAMS));
        cd.setCompositionString("tbPatientsCoinfected AND withCtx");
        
        return cd;
    }
  

public static CohortDefinition tbPatientsCoInfectedWithHivOnArvsCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_co-infected_with_hiv_on_arvs");

        cd.addSearch("tbPatientsCoinfected", ReportUtils.map(tbPatientsWhoTestedPositiveForHivCohort(), COHORT_PARAMS));
        cd.addSearch("onArv", ReportUtils.map(patientsWhoAreOnArvCohort(), COHORT_PARAMS));
        cd.setCompositionString("tbPatientsCoinfected AND onArv");
        
        return cd;
    }
 

    public static CohortDefinition newTbCasesAmongVisitsInIsanteInAGivenTimePeriodCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.new_tb_cases_among_visits_in_isante_in_a_given_time_period");

        cd.addSearch("newAdultTBCases", ReportUtils.map(newAdultTbPatientsCohort(), COHORT_PARAMS));
        cd.addSearch("newChildTbCases", ReportUtils.map(newChildTbPatientsCohort(), COHORT_PARAMS));
        cd.setCompositionString("newAdultTBCases OR newChildTbCases");
        
        return cd;
    }
 
    public static CohortDefinition childrenAgedLessThan60MonthsWithTbMeningitisInAGivenTimeCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.children_aged_less_than_60_months_with_tb_meningitis_in_a_given_time");

        cd.addSearch("childrenAgedLT60", ReportUtils.map(patientsAgedLessThan60MCohort(), COHORT_PARAMS));
        cd.addSearch("withTbMeningitis", ReportUtils.map(patientsWithTbMeningitisCohort(), COHORT_PARAMS));
        cd.setCompositionString("childrenAgedLT60 AND withTbMeningitis");
        
        return cd;
    }
 
    public static CohortDefinition childrenAgedLessThan60MonthsWithAVisitInAGivenTimePeriodCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.children_aged_less_than_60_months_with_a_visit_in_a_given_time_period");

        cd.addSearch("childrenAgedLT60", ReportUtils.map(patientsAgedLessThan60MCohort(), COHORT_PARAMS));
        cd.addSearch("allVisits", ReportUtils.map(allVisitsCohort(), COHORT_PARAMS));
        cd.setCompositionString("childrenAgedLT60 AND allVisits");
        
        return cd;
    } 

    public static CohortDefinition tbPatientsWhoNeverHadAFollowUpSputumTestCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_who_never_had_a_follow_up_sputum_test");

        cd.addSearch("allTbPatients", ReportUtils.map(allTbCasesCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResultAtMonth0", ReportUtils.map(patientsWithSputumResultAtMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("withSputumTestDone", ReportUtils.map(patientsWithSputumOrderedCohort(), COHORT_PARAMS));
        cd.setCompositionString("allTbPatients AND NOT withSputumTestDone");
        
        return cd;
    }
  
    public static CohortDefinition patientsEvaluatedForSputumInMonth0ButNotInMonth2Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2");

        cd.addSearch("withSputumResultAtMonth0", ReportUtils.map(patientsWithSputumResultAtMonth0Cohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResultAtMonth2", ReportUtils.map(patientsWithSputumResultAtMonth2Cohort(), COHORT_PARAMS));
        cd.setCompositionString("withSputumResultAtMonth0 AND NOT withSputumResultAtMonth2");
        
        return cd;
    }
     
    public static CohortDefinition patientsEvaluatedForSputumInMonth2ButNotInMonth3Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_evaluated_for_sputum_in_month_2_but_not_in_month_3");

        cd.addSearch("withSputumResultAtMonth2", ReportUtils.map(patientsWithSputumResultAtMonth2Cohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResultAtMonth3", ReportUtils.map(patientsWithSputumResultAtMonth3Cohort(), COHORT_PARAMS));
        cd.setCompositionString("withSputumResultAtMonth2 AND NOT withSputumResultAtMonth3");
        
        return cd;
    } 

    public static CohortDefinition patientsEvaluatedForSputumInMonth3ButNotInMonth5Cohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_evaluated_for_sputum_in_month_3_but_not_in_month_5");

        cd.addSearch("withSputumResultAtMonth3", ReportUtils.map(patientsWithSputumResultAtMonth3Cohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResultAtMonth5", ReportUtils.map(patientsWithSputumResultAtMonth5Cohort(), COHORT_PARAMS));
        cd.setCompositionString("withSputumResultAtMonth3 AND NOT withSputumResultAtMonth5");
        
        return cd;
    } 

    public static CohortDefinition patientsEvaluatedForSputumInMonth3ButNotAtTheEndOfTreatmentCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_evaluated_for_sputum_in_month_3_but_not_at_the_end_of_treatment");

        cd.addSearch("withSputumResultAtMonth3", ReportUtils.map(patientsWithSputumResultAtMonth3Cohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResultAtEnd", ReportUtils.map(patientsWithSputumResultAtEndCohort(), COHORT_PARAMS));
        cd.setCompositionString("withSputumResultAtMonth3 AND NOT withSputumResultAtEnd");
        
        return cd;
    }


    public static CohortDefinition patientsWithXrayDoneCohort() {
        
        SqlCohortDefinition cohortDefinition = sqlCohortDefinition(
            "PatientsWithXrayDone.sql", 
            "isanteplusreports.patients_with_xray_done");
        
        return cohortDefinition;
    }
     
    public static CohortDefinition tbPatientsWhoHaveNotHadAnXrayDoneCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.tb_patients_who_have_not_had_an_xray_done");

        cd.addSearch("allTbPatients", ReportUtils.map(allTbCasesCohort(), COHORT_PARAMS));
        cd.addSearch("withXRayDone", ReportUtils.map(patientsWithXrayDoneCohort(), COHORT_PARAMS));
        cd.setCompositionString("allTbPatients AND NOT withXRayDone");
        
        return cd;
    }    

    public static CohortDefinition patientsWithRespiratorySymptomsWhoDidNotCompleteASeriesOf3SputumCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_respiratory_symptoms_who_did_not_complete_a_series_of_3_sputum");

        cd.addSearch("withRespiratorySymptoms", ReportUtils.map(patientsWithRespiratorySymptomsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResultAtMonth3", ReportUtils.map(patientsWithSputumResultAtMonth3Cohort(), COHORT_PARAMS));
        cd.setCompositionString("withRespiratorySymptoms AND NOT withSputumResultAtMonth3");
        
        return cd;
    }
     
    public static CohortDefinition patientsWithRespiratorySymptomsWhoNeverHadASputumResultedCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_with_respiratory_symptoms_who_never_had_a_sputum_resulted");

        cd.addSearch("withRespiratorySymptoms", ReportUtils.map(patientsWithRespiratorySymptomsCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResult", ReportUtils.map(patientsWithSputumResultAtMonth0Cohort(), COHORT_PARAMS));
        cd.setCompositionString("withRespiratorySymptoms AND NOT withSputumResult");
        
        return cd;
    }
 
    public static CohortDefinition patientsForWhomTheDiagnosisOfPulmonaryTbWasDoneWithoutASputumCohort() {
        
        CompositionCohortDefinition cd = compositionCohortDefinition("isanteplusreports.patients_for_whom_the_diagnosis_of_pulmonary_tb_was_done_without_a_sputum");

        cd.addSearch("withPulmonaryTb", ReportUtils.map(patientsWithPulmonaryTbCohort(), COHORT_PARAMS));
        cd.addSearch("withSputumResult", ReportUtils.map(patientsWithSputumResultAtMonth0Cohort(), COHORT_PARAMS));
        cd.setCompositionString("withPulmonaryTb AND NOT withSputumResult");
        
        return cd;
    }
 
}

package org.openmrs.module.isanteplusreports.library.indicator;

import org.openmrs.module.isanteplusreports.library.cohort.TBIndicatorReportCohortLibrary;
import org.openmrs.module.isanteplusreports.reporting.utils.EmrReportingUtils;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;

public class TbReportIndicatorLibrary {
    private static final String IND_PARAMS = "startDate=${startDate},endDate=${endDate},location=${location}";

    public static CohortIndicator patientsWithRepiratorySymptomsAndSputumOrdered() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.patients_with_respiratory_symptoms_and_sputum_ordered",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumOrderedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsCohort(), IND_PARAMS));
    }    

    public static CohortIndicator patientsWithRespiratorySymptomsAndSputumPositiveResult() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.patients_with_respiratory_symptoms_and_sputum_positive",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumPositiveResultCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumResultCohort(), IND_PARAMS));
    }

    public static CohortIndicator newAdultPulmonaryPulmonaryTBPatientsWithSputumPositiveResult() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.new_adult_pulmonary_tb_patients_with_sputum_positive",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newAdultPulmonaryTbPatientsWithSputumPositiveResultCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.newAdultPulmonaryTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator newChildPulmonaryPulmonaryTBPatientsWithSputumPositiveResult() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.new_child_pulmonary_tb_patients_with_sputum_positive",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newChildPulmonaryTbPatientsWithSputumPositiveResultCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.newChildPulmonaryTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator newAdultPulmonaryTBPatientsWithSputumNegativeResult() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.new_adult_pulmonary_tb_patients_with_sputum_negative_result",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newAdultPulmonaryTbPatientsWithSputumNegativeResultCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.newAdultPulmonaryTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator newChildPulmonaryTBPatientsWithSputumNegativeResult() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.new_child_pulmonary_tb_patients_with_sputum_negative_result",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newChildPulmonaryTbPatientsWithSputumNegativeResultCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.newChildPulmonaryTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator newAdultExtraPulmonaryTBPatients() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.new_adult_extrapulmonary_tb_patients",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newAdultExtraPulmonaryTbPatientsCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.newAdultTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator newChildExtraPulmonaryTBPatients() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplus.new_child_extrapulmonary_tb_patients",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newChildExtraPulmonaryTbPatientsCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.newChildTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsInTreatmentWhoReceivedASputumTestOnMonth2() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_in_treatment_who_received_a_sputum_test_on_month_2",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsInTreatmentWhoReceivedASputumTestOnMonth2Cohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithSputumResultAtMonth0Cohort(), IND_PARAMS));
    }
 
    public static CohortIndicator evaluationRateAt3RdMonth() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.evaluation_rate_at_3rd_month",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithSputumResultAtMonth3Cohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithSputumResultAtMonth0Cohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsInTreatmentWhoConvertedFromPositiveSputumOnMonth0ToNegativeOnMonth2() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_in_treatment_who_converted_from_positive_sputum_on_month_0_to_negative_on_month_2",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsInTreatmentWhoConvertedFromPositiveSputumOnMonth0ToNegativeOnMonth2Cohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsInTreatmentWhoConvertedFromAPositiveSputumOnMonth0ToNegativeOnMonth3() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_in_treatment_who_converted_from_a_positive_sputum_on_month_0_to_negative_on_month_3",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsInTreatmentWhoConvertedFromAPositiveSputumOnMonth0ToNegativeOnMonth3Cohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }
 
    public static CohortIndicator cureRate() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.cure_rate",
           ReportUtils.map(TBIndicatorReportCohortLibrary.curedTbPatientsCohort(), IND_PARAMS),
           ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }
 
   public static CohortIndicator rateOfTreatmentCompletionSputumPositive() {
       return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.rate_of_treatment_completion_sputum_positive",
           ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoWereSputumPositiveAndFinishedTreatmentCohort(), IND_PARAMS),
           ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
   }
   
   public static CohortIndicator rateOfTreatmentCompletionSputumNegative() {
       return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.rate_of_treatment_completion_sputum_negative",
           ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoWereSputumNegativeAndFinishedTreatmentCohort(), IND_PARAMS),
           ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoAreSputumNegativeAndOnTreatmentCohort(), IND_PARAMS));
   }
   
   public static CohortIndicator successRateSputumPostive() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.success_rate_(sputum_postive)",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoWereInitiallySputumPositiveAndCuredOrFinishedTreatmentCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
   }

    public static CohortIndicator failureRate() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.failure_rate",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInitiallySputumPositiveWhoFailedTreatmentCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }
 
    public static CohortIndicator dropoutRate() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.dropout_rate",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithInitialSputumPositiveWhoDidNotFinishTreatmentCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }
 
    public static CohortIndicator deathRateAmongThoseWithSputumPositiveOnTreatment() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.death_rate_among_those_with_sputum_positive_on_treatment",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithInitialSputumPositiveAndOnTreatmentWhoDiedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }
 
    public static CohortIndicator transferRate() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.transfer_rate",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithInitialSputumPositiveWhoTransferredTreatmentCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsTestedForHiv() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_tested_for_hiv",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsTestedForHivCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.allTbCasesCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator tbPatientsWhoTestedPositiveForHiv() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_who_tested_positive_for_hiv",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsWhoTestedPositiveForHivCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsTestedForHivCohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsCoinfectedWithHivBeingTreatedWithCotrimoxazoleProphylaxis() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_coinfected_with_hiv_being_treated_with_cotrimoxazole_prophylaxis",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsCoinfectedWithHivBeingTreatedWithCotrimoxazoleProphylaxisCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsWhoTestedPositiveForHivCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator tbPatientsCoInfectedWithHivOnArvs() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_patients_co-infected_with_hiv_on_arvs",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsCoInfectedWithHivOnArvsCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsTestedForHivCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator newTbCasesAmongVisitsInIsanteInAGivenTimePeriod() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.new_tb_cases_among_visits_in_isante_in_a_given_time_period",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newTbCasesAmongVisitsInIsanteInAGivenTimePeriodCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.allVisitsCohort(), IND_PARAMS));
    }

    public static CohortIndicator newPositiveSputumAmongVisitsInIsanteInAGivenTimePeriod() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.new_positive_sputum_among_visits_in_isante_in_a_given_time_period",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newTbCasesAmongVisitsInIsanteInAGivenTimePeriodCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.allVisitsCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator tbMeningitisInThePopulationAgedLessThan60MonthsOld() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.tb_meningitis_in_the_population_<_60_months_old",
            ReportUtils.map(TBIndicatorReportCohortLibrary.childrenAgedLessThan60MonthsWithTbMeningitisInAGivenTimeCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.childrenAgedLessThan60MonthsWithAVisitInAGivenTimePeriodCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator deathsAmongThoseWithTb() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.deaths_among_those_with_tb",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoDiedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.allTbCasesCohort(), IND_PARAMS));
    }

    public static CohortIndicator newlyDiagnosedTbPatients() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.newly_diagnosed_tb_patients",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithNewTbDiagnosisCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator numberOfPatientsWhoStartedTheirTbTreatment() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_patients_who_started_their_tb_treatment",
            ReportUtils.map(TBIndicatorReportCohortLibrary.PatientsWhoStartedTbTreatment(), IND_PARAMS));
    }
    
    public static CohortIndicator patientsWhoCompletedTreatmentButDidNotMeetTheCriteriaForCureOrFailure() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_who_completed_treatment_but_did_not_meet_the_criteria_for_cure_or_failure",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoCompletedTbTreatmentCohort(), IND_PARAMS));
    }
    
    public static CohortIndicator allTbPatientsCured() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.all_tb_patients_cured",
            ReportUtils.map(TBIndicatorReportCohortLibrary.curedTbPatientsCohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsWhoNeverHadAFollowUpSputumTest() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.tb_patients_who_never_had_a_follow_up_sputum_test",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsWhoNeverHadAFollowUpSputumTestCohort(), IND_PARAMS));
    }

    public static CohortIndicator patientsEvaluatedForSputumInMonth0ButNotInMonth2() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsEvaluatedForSputumInMonth0ButNotInMonth2Cohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithSputumResultAtMonth0Cohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsWhoHaveNotHadAnXrayDone() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.tb_patients_who_have_not_had_an_xray_done",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsWhoHaveNotHadAnXrayDoneCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator patientsWhoHaveHadRespiratorySymptomsAndReceivedASputumTestOrdered() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_who_have_had_respiratory_symptoms_and_received_a_sputum_test_ordered",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumOrderedCohort(), IND_PARAMS));
    }

    public static CohortIndicator patientsWithSymptomsProblemsWhoDidNotCompleteASeriesOf3Sputum() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_with_symptoms_problems_who_did_not_complete_a_series_of_3_sputum",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsWhoDidNotCompleteASeriesOf3SputumCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator allPatientsWithRespiratorySymptomsWhoNeverHadASputumResulted() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.all_patients_with_respiratory_symptoms_who_never_had_a_sputum_resulted",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsWhoNeverHadASputumResultedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator patientsWithSputumPositiveResult() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_with_sputum_positive_result",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithSputumPositiveResultCohort(), IND_PARAMS));
    }

    public static CohortIndicator patientsForWhomTheDiagnosisOfPulmonaryTbWasDoneWithoutASputum() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_for_whom_the_diagnosis_of_pulmonary_tb_was_done_without_a_sputum",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsForWhomTheDiagnosisOfPulmonaryTbWasDoneWithoutASputumCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithPulmonaryTbCohort(), IND_PARAMS));
    }

    public static CohortIndicator tbPatientsWhoStartedTreatmentWithin30DaysOfBeingDiagnosed() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.tb_patients_who_started_treatment_within_30_days_of_being_diagnosed",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsWhoStartedTreatmentWithin30DaysOfBeingDiagnosedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.allTbCasesCohort(), IND_PARAMS));
    }

    public static CohortIndicator sputumPositiveTbPatientsOnTreatmentWithFollowUpSputumPerformed() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.sputum_positive_tb_patients_on_treatment_with_follow_up_sputum_performed",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsWithAPositiveSputumOnTreatmentWithFollowUpSputumPerformedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsInTreatmentWithAPositiveSputumOnMonth0Cohort(), IND_PARAMS));
    }

    public static CohortIndicator patientsWithRespiratorySymptomsWhoHadASputumResulted() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.patients_with_respiratory_symptoms_who_had_a_sputum_resulted",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumOrderedCohort(), IND_PARAMS),
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsCohort(), IND_PARAMS));
    }     

    public static CohortIndicator numberOfPatientsWithRespiratoryProblems() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_patients_with_respiratory_problems",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsCohort(), IND_PARAMS));
    }
 
     public static CohortIndicator numberOfPatientsWithRespiratoryProblemsWhoHadASputumDone() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_sputum_done_",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumOrderedCohort(), IND_PARAMS));
    }
 
     public static CohortIndicator numberOfPatientsWithRespiratoryProblemsWhoHadAPositiveSputum() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_positive_sputum",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumPositiveResultCohort(), IND_PARAMS));
    }
 
     public static CohortIndicator numberOfPatientsWithRespiratoryProblemsWhoHadANegativeSputum() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_negative_sputum",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithRespiratorySymptomsAndSputumNegativeResultCohort(), IND_PARAMS));
    }    

    public static CohortIndicator rateOfDetection() {
         return EmrReportingUtils.cohortIndicator(
             "isanteplusreports.rate_of_detection_",
             ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithASputumPositiveResultAtMonth0Cohort(), IND_PARAMS),
             ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithSputumResultAtMonth0Cohort(), IND_PARAMS));
    }
    
    public static CohortIndicator numberOfPulmonaryTbPatientsDiagnosed() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_pulmonary_tb_patients_diagnosed",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithPulmonaryTbCohort(), IND_PARAMS));
    }

    public static CohortIndicator numberOfPatientsDiagnosedWithExtrapulmonaryTb() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.number_of_patients_diagnosed_with_extrapulmonary_tb",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWithExtraPulmonaryTbCohort(), IND_PARAMS));
    }
 

    public static CohortIndicator numberOfTbCasesDiagnosed() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_tb_cases_diagnosed",
            ReportUtils.map(TBIndicatorReportCohortLibrary.allTbCasesCohort(), IND_PARAMS));
    }  

    public static CohortIndicator numberOfPatientsDiagnosedWithPulmonaryTbViaPositiveSputum() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.number_of_patients_diagnosed_with_pulmonary_tb_via_positive_sputum",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsDiagnosedWithPulmonaryTbViaPositiveSputumCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator numberOfPatientsDiagnosedWithPulmonaryTbWhoHaveANegativeSputum() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.number_of_patients_diagnosed_with_pulmonary_tb_who_have_a_negative_sputum",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsDiagnosedWithPulmonaryTbWhoHaveANegativeSputumCohort(), IND_PARAMS));
    } 

    public static CohortIndicator numberOfPulmonaryTbPatientsDiagnosedWithoutSputumBeingPerformed() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.number_of_pulmonary_tb_patients_diagnosed_without_sputum_being_performed",
            ReportUtils.map(TBIndicatorReportCohortLibrary.tbPatientsDiagnosedWithoutSputumBeingPerformedCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator numberOfNewTbPatientsOnTreatment() {
        return EmrReportingUtils.cohortIndicator(
           "isanteplusreports.number_of_new_tb_patients_on_treatment",
            ReportUtils.map(TBIndicatorReportCohortLibrary.newTbPatientsOnTreatmentCohort(), IND_PARAMS));
    }
 
    public static CohortIndicator numberOfPatientsWhoFailedTreatment() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_patients_who_failed_treatment",
            ReportUtils.map(TBIndicatorReportCohortLibrary.patientsWhoFailedTbTreatmentCohort(), IND_PARAMS));
    }

    public static CohortIndicator numberOfPulmonaryTbPatientsEnrolledForAtLeast6MonthsWithNoSputumVerification() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.number_of_pulmonary_tb_patients_enrolled_for_at_least_6_months_with_no_sputum_verification",
            ReportUtils.map(TBIndicatorReportCohortLibrary.pulmonaryTbPatientsEnrolledForAtLeast6MonthsWithNoSputumVerificationCohort(), IND_PARAMS));
    }
     
}

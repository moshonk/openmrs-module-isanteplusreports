package org.openmrs.module.isanteplusreports.reporting.reports;

import java.util.Arrays;
import java.util.List;

import org.openmrs.module.isanteplusreports.IsantePlusReportsUtil;
import org.openmrs.module.isanteplusreports.library.indicator.TbReportIndicatorLibrary;
import org.openmrs.module.isanteplusreports.reporting.utils.ColumnParameters;
import org.openmrs.module.isanteplusreports.reporting.utils.EmrReportingUtils;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.common.MessageUtil;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;

public class TBIndicatorReport {
    private static final String TB_INDICATOR_REPORT_UUID = "c657aa91-f3b7-4abf-a598-4dbaf7d50d96";
    private static final String IND_PARAMS = "startDate=${startDate},endDate=${endDate},location=${location}";

    public static void registerReport() {     
        
        CohortIndicatorDataSetDefinition dsd = tbDataSetDefinition();

        IsantePlusReportsUtil.registerIndicatorReportsWithStartAndEndDateParams(
            "isanteplusreports.tb_indicator_report",
            MessageUtil.translate("isanteplusreports.tb_indicator_report"),
            TB_INDICATOR_REPORT_UUID,
            dsd);

    }
    
    private static CohortIndicatorDataSetDefinition tbDataSetDefinition() {
        CohortIndicatorDataSetDefinition dsd = new CohortIndicatorDataSetDefinition();

        dsd.setName("isanteplusreports.tb_indicator_report");
        dsd.setDescription(MessageUtil.translate("isanteplusreports.tb_indicator_report"));

        ColumnParameters col = new ColumnParameters("1", "", "");

        List<ColumnParameters> allColumns = Arrays.asList(col);
        
        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_respiratory_symptoms_and_sputum_ordered", 
            MessageUtil.translate("isanteplusreports.patients_with_respiratory_symptoms_and_sputum_ordered"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithRepiratorySymptomsAndSputumOrdered(), IND_PARAMS),
            allColumns,
            Arrays.asList("01"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_respiratory_symptoms_and_sputum_positive_result", 
            MessageUtil.translate("isanteplusreports.patients_with_respiratory_symptoms_and_sputum_positive"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithRespiratorySymptomsAndSputumPositiveResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("02"));
        
        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_adult_pulmonary_tb_patients_with_sputum_positive_result", 
            MessageUtil.translate("isanteplusreports.new_adult_pulmonary_tb_patients_with_sputum_positive"),
            ReportUtils.map(TbReportIndicatorLibrary.newAdultPulmonaryPulmonaryTBPatientsWithSputumPositiveResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("03"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_child_pulmonary_tb_patients_with_sputum_positive", 
            MessageUtil.translate("isanteplusreports.new_child_pulmonary_tb_patients_with_sputum_positive"),
            ReportUtils.map(TbReportIndicatorLibrary.newChildPulmonaryPulmonaryTBPatientsWithSputumPositiveResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("04"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_adult_pulmonary_tb_patients_with_sputum_negative", 
            MessageUtil.translate("isanteplusreports.new_adult_pulmonary_tb_patients_with_sputum_negative"),
            ReportUtils.map(TbReportIndicatorLibrary.newAdultPulmonaryTBPatientsWithSputumNegativeResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("05"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_child_pulmonary_tb_patients_with_sputum_negative", 
            MessageUtil.translate("isanteplusreports.new_child_pulmonary_tb_patients_with_sputum_negative"),
            ReportUtils.map(TbReportIndicatorLibrary.newChildPulmonaryTBPatientsWithSputumNegativeResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("06"));
        
        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_adult_extrapulmonary_tb_patients", 
            MessageUtil.translate("isanteplusreports.new_adult_extrapulmonary_tb_patients"),
            ReportUtils.map(TbReportIndicatorLibrary.newAdultExtraPulmonaryTBPatients(), IND_PARAMS),
            allColumns,
            Arrays.asList("07"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_child_extrapulmonary_tb_patients", 
            MessageUtil.translate("isanteplusreports.new_child_extrapulmonary_tb_patients"),
            ReportUtils.map(TbReportIndicatorLibrary.newChildExtraPulmonaryTBPatients(), IND_PARAMS),
            allColumns,
            Arrays.asList("08"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_in_treatment_who_received_a_sputum_test_on_month_2", 
            MessageUtil.translate("isanteplusreports.tb_patients_in_treatment_who_received_a_sputum_test_on_month_2"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsInTreatmentWhoReceivedASputumTestOnMonth2(), IND_PARAMS),
            allColumns,
            Arrays.asList("09"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.evaluation_rate_at_3rd_month", 
            MessageUtil.translate("isanteplusreports.evaluation_rate_at_3rd_month"),
            ReportUtils.map(TbReportIndicatorLibrary.evaluationRateAt3RdMonth(), IND_PARAMS),
            allColumns,
            Arrays.asList("10"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_in_treatment_who_converted_from_positive_sputum_on_month_0_to_negative_on_month_2", 
            MessageUtil.translate("isanteplusreports.tb_patients_in_treatment_who_converted_from_positive_sputum_on_month_0_to_negative_on_month_2"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsInTreatmentWhoConvertedFromPositiveSputumOnMonth0ToNegativeOnMonth2(), IND_PARAMS),
            allColumns,
            Arrays.asList("11"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_in_treatment_who_converted_from_a_positive_sputum_on_month_0_to_negative_on_month_3", 
            MessageUtil.translate("isanteplusreports.tb_patients_in_treatment_who_converted_from_a_positive_sputum_on_month_0_to_negative_on_month_3"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsInTreatmentWhoConvertedFromAPositiveSputumOnMonth0ToNegativeOnMonth3(), IND_PARAMS),
            allColumns,
            Arrays.asList("12"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.cure_rate", 
            MessageUtil.translate("isanteplusreports.cure_rate"),
            ReportUtils.map(TbReportIndicatorLibrary.cureRate(), IND_PARAMS),
            allColumns,
            Arrays.asList("13"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.rate_of_treatment_completion_sputum_positive", 
            MessageUtil.translate("isanteplusreports.rate_of_treatment_completion_sputum_positive"),
            ReportUtils.map(TbReportIndicatorLibrary.rateOfTreatmentCompletionSputumPositive(), IND_PARAMS),
            allColumns,
            Arrays.asList("14"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.rate_of_treatment_completion_sputum_negative", 
            MessageUtil.translate("isanteplusreports.rate_of_treatment_completion_sputum_negative"),
            ReportUtils.map(TbReportIndicatorLibrary.rateOfTreatmentCompletionSputumNegative(), IND_PARAMS),
            allColumns,
            Arrays.asList("15"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.success_rate_(sputum_postive)", 
            MessageUtil.translate("isanteplusreports.success_rate_(sputum_postive)"),
            ReportUtils.map(TbReportIndicatorLibrary.successRateSputumPostive(), IND_PARAMS),
            allColumns,
            Arrays.asList("16"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.failure_rate", 
            MessageUtil.translate("isanteplusreports.failure_rate"),
            ReportUtils.map(TbReportIndicatorLibrary.failureRate(), IND_PARAMS),
            allColumns,
            Arrays.asList("17"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.dropout_rate", 
            MessageUtil.translate("isanteplusreports.dropout_rate"),
            ReportUtils.map(TbReportIndicatorLibrary.dropoutRate(), IND_PARAMS),
            allColumns,
            Arrays.asList("18"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.death_rate_among_those_with_sputum_positive_on_treatment", 
            MessageUtil.translate("isanteplusreports.death_rate_among_those_with_sputum_positive_on_treatment"),
            ReportUtils.map(TbReportIndicatorLibrary.deathRateAmongThoseWithSputumPositiveOnTreatment(), IND_PARAMS),
            allColumns,
            Arrays.asList("19"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.transfer_rate", 
            MessageUtil.translate("isanteplusreports.transfer_rate"),
            ReportUtils.map(TbReportIndicatorLibrary.transferRate(), IND_PARAMS),
            allColumns,
            Arrays.asList("20"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_tested_for_hiv", 
            MessageUtil.translate("isanteplusreports.tb_patients_tested_for_hiv"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsTestedForHiv(), IND_PARAMS),
            allColumns,
            Arrays.asList("21"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_who_tested_positive_for_hiv", 
            MessageUtil.translate("isanteplusreports.tb_patients_who_tested_positive_for_hiv"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsWhoTestedPositiveForHiv(), IND_PARAMS),
            allColumns,
            Arrays.asList("22"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_coinfected_with_hiv_being_treated_with_cotrimoxazole_prophylaxis", 
            MessageUtil.translate("isanteplusreports.tb_patients_coinfected_with_hiv_being_treated_with_cotrimoxazole_prophylaxis"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsCoinfectedWithHivBeingTreatedWithCotrimoxazoleProphylaxis(), IND_PARAMS),
            allColumns,
            Arrays.asList("23"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_co-infected_with_hiv_on_arvs", 
            MessageUtil.translate("isanteplusreports.tb_patients_co-infected_with_hiv_on_arvs"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsCoInfectedWithHivOnArvs(), IND_PARAMS),
            allColumns,
            Arrays.asList("24"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_tb_cases_among_visits_in_isante_in_a_given_time_period", 
            MessageUtil.translate("isanteplusreports.new_tb_cases_among_visits_in_isante_in_a_given_time_period"),
            ReportUtils.map(TbReportIndicatorLibrary.newTbCasesAmongVisitsInIsanteInAGivenTimePeriod(), IND_PARAMS),
            allColumns,
            Arrays.asList("25"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.new_positive_sputum_among_visits_in_isante_in_a_given_time_period", 
            MessageUtil.translate("isanteplusreports.new_positive_sputum_among_visits_in_isante_in_a_given_time_period"),
            ReportUtils.map(TbReportIndicatorLibrary.newPositiveSputumAmongVisitsInIsanteInAGivenTimePeriod(), IND_PARAMS),
            allColumns,
            Arrays.asList("26"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_meningitis_in_the_population_<_60_months_old", 
            MessageUtil.translate("isanteplusreports.tb_meningitis_in_the_population_<_60_months_old"),
            ReportUtils.map(TbReportIndicatorLibrary.tbMeningitisInThePopulationAgedLessThan60MonthsOld(), IND_PARAMS),
            allColumns,
            Arrays.asList("27"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.deaths_among_those_with_tb", 
            MessageUtil.translate("isanteplusreports.deaths_among_those_with_tb"),
            ReportUtils.map(TbReportIndicatorLibrary.deathsAmongThoseWithTb(), IND_PARAMS),
            allColumns,
            Arrays.asList("28"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.newly_diagnosed_tb_patients", 
            MessageUtil.translate("isanteplusreports.newly_diagnosed_tb_patients"),
            ReportUtils.map(TbReportIndicatorLibrary.newlyDiagnosedTbPatients(), IND_PARAMS),
            allColumns,
            Arrays.asList("30"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_who_started_their_tb_treatment", 
            MessageUtil.translate("isanteplusreports.number_of_patients_who_started_their_tb_treatment"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWhoStartedTheirTbTreatment(), IND_PARAMS),
            allColumns,
            Arrays.asList("31"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_who_completed_treatment_but_did_not_meet_the_criteria_for_cure_or_failure", 
            MessageUtil.translate("isanteplusreports.patients_who_completed_treatment_but_did_not_meet_the_criteria_for_cure_or_failure"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWhoCompletedTreatmentButDidNotMeetTheCriteriaForCureOrFailure(), IND_PARAMS),
            allColumns,
            Arrays.asList("32"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.all_tb_patients_cured", 
            MessageUtil.translate("isanteplusreports.all_tb_patients_cured"),
            ReportUtils.map(TbReportIndicatorLibrary.allTbPatientsCured(), IND_PARAMS),
            allColumns,
            Arrays.asList("33"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_who_never_had_a_follow_up_sputum_test", 
            MessageUtil.translate("isanteplusreports.tb_patients_who_never_had_a_follow_up_sputum_test"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsWhoNeverHadAFollowUpSputumTest(), IND_PARAMS),
            allColumns,
            Arrays.asList("34"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2", 
            MessageUtil.translate("isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsEvaluatedForSputumInMonth0ButNotInMonth2(), IND_PARAMS),
            allColumns,
            Arrays.asList("35"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2", 
            MessageUtil.translate("isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsEvaluatedForSputumInMonth0ButNotInMonth2(), IND_PARAMS),
            allColumns,
            Arrays.asList("36"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_who_have_not_had_an_xray_done", 
            MessageUtil.translate("isanteplusreports.tb_patients_who_have_not_had_an_xray_done"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsWhoHaveNotHadAnXrayDone(), IND_PARAMS),
            allColumns,
            Arrays.asList("37"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_who_have_had_respiratory_symptoms_and_received_a_sputum_test_ordered", 
            MessageUtil.translate("isanteplusreports.patients_who_have_had_respiratory_symptoms_and_received_a_sputum_test_ordered"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWhoHaveHadRespiratorySymptomsAndReceivedASputumTestOrdered(), IND_PARAMS),
            allColumns,
            Arrays.asList("38"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_symptoms_problems_who_did_not_complete_a_series_of_3_sputum", 
            MessageUtil.translate("isanteplusreports.patients_with_symptoms_problems_who_did_not_complete_a_series_of_3_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithSymptomsProblemsWhoDidNotCompleteASeriesOf3Sputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("39"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.all_patients_with_respiratory_symptoms_who_never_had_a_sputum_resulted", 
            MessageUtil.translate("isanteplusreports.all_patients_with_respiratory_symptoms_who_never_had_a_sputum_resulted"),
            ReportUtils.map(TbReportIndicatorLibrary.allPatientsWithRespiratorySymptomsWhoNeverHadASputumResulted(), IND_PARAMS),
            allColumns,
            Arrays.asList("40"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_sputum_positive_result", 
            MessageUtil.translate("isanteplusreports.patients_with_sputum_positive_result"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithSputumPositiveResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("41"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_for_whom_the_diagnosis_of_pulmonary_tb_was_done_without_a_sputum", 
            MessageUtil.translate("isanteplusreports.patients_for_whom_the_diagnosis_of_pulmonary_tb_was_done_without_a_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsForWhomTheDiagnosisOfPulmonaryTbWasDoneWithoutASputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("42"));

        EmrReportingUtils.addRow(dsd,
            "isanteplusreports.newly_diagnosed_tb_patients", 
            MessageUtil.translate("isanteplusreports.newly_diagnosed_tb_patients"),
            ReportUtils.map(TbReportIndicatorLibrary.newlyDiagnosedTbPatients(), IND_PARAMS),
            allColumns,
            Arrays.asList("30"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_who_started_their_tb_treatment", 
            MessageUtil.translate("isanteplusreports.number_of_patients_who_started_their_tb_treatment"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWhoStartedTheirTbTreatment(), IND_PARAMS),
            allColumns,
            Arrays.asList("31"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_who_completed_treatment_but_did_not_meet_the_criteria_for_cure_or_failure", 
            MessageUtil.translate("isanteplusreports.patients_who_completed_treatment_but_did_not_meet_the_criteria_for_cure_or_failure"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWhoCompletedTreatmentButDidNotMeetTheCriteriaForCureOrFailure(), IND_PARAMS),
            allColumns,
            Arrays.asList("32"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.all_tb_patients_cured", 
            MessageUtil.translate("isanteplusreports.all_tb_patients_cured"),
            ReportUtils.map(TbReportIndicatorLibrary.allTbPatientsCured(), IND_PARAMS),
            allColumns,
            Arrays.asList("33"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_who_never_had_a_follow_up_sputum_test", 
            MessageUtil.translate("isanteplusreports.tb_patients_who_never_had_a_follow_up_sputum_test"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsWhoNeverHadAFollowUpSputumTest(), IND_PARAMS),
            allColumns,
            Arrays.asList("34"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2", 
            MessageUtil.translate("isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsEvaluatedForSputumInMonth0ButNotInMonth2(), IND_PARAMS),
            allColumns,
            Arrays.asList("35"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2", 
            MessageUtil.translate("isanteplusreports.patients_evaluated_for_sputum_in_month_0_but_not_in_month_2"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsEvaluatedForSputumInMonth0ButNotInMonth2(), IND_PARAMS),
            allColumns,
            Arrays.asList("36"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_who_have_not_had_an_xray_done", 
            MessageUtil.translate("isanteplusreports.tb_patients_who_have_not_had_an_xray_done"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsWhoHaveNotHadAnXrayDone(), IND_PARAMS),
            allColumns,
            Arrays.asList("37"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_who_have_had_respiratory_symptoms_and_received_a_sputum_test_ordered", 
            MessageUtil.translate("isanteplusreports.patients_who_have_had_respiratory_symptoms_and_received_a_sputum_test_ordered"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWhoHaveHadRespiratorySymptomsAndReceivedASputumTestOrdered(), IND_PARAMS),
            allColumns,
            Arrays.asList("38"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_symptoms_problems_who_did_not_complete_a_series_of_3_sputum", 
            MessageUtil.translate("isanteplusreports.patients_with_symptoms_problems_who_did_not_complete_a_series_of_3_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithSymptomsProblemsWhoDidNotCompleteASeriesOf3Sputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("39"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.all_patients_with_respiratory_symptoms_who_never_had_a_sputum_resulted", 
            MessageUtil.translate("isanteplusreports.all_patients_with_respiratory_symptoms_who_never_had_a_sputum_resulted"),
            ReportUtils.map(TbReportIndicatorLibrary.allPatientsWithRespiratorySymptomsWhoNeverHadASputumResulted(), IND_PARAMS),
            allColumns,
            Arrays.asList("40"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_sputum_positive_result", 
            MessageUtil.translate("isanteplusreports.patients_with_sputum_positive_result"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithSputumPositiveResult(), IND_PARAMS),
            allColumns,
            Arrays.asList("41"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_for_whom_the_diagnosis_of_pulmonary_tb_was_done_without_a_sputum", 
            MessageUtil.translate("isanteplusreports.patients_for_whom_the_diagnosis_of_pulmonary_tb_was_done_without_a_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsForWhomTheDiagnosisOfPulmonaryTbWasDoneWithoutASputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("42"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.tb_patients_who_started_treatment_within_30_days_of_being_diagnosed", 
            MessageUtil.translate("isanteplusreports.tb_patients_who_started_treatment_within_30_days_of_being_diagnosed"),
            ReportUtils.map(TbReportIndicatorLibrary.tbPatientsWhoStartedTreatmentWithin30DaysOfBeingDiagnosed(), IND_PARAMS),
            allColumns,
            Arrays.asList("43"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.sputum_positive_tb_patients_on_treatment_with_follow_up_sputum_performed", 
            MessageUtil.translate("isanteplusreports.sputum_positive_tb_patients_on_treatment_with_follow_up_sputum_performed"),
            ReportUtils.map(TbReportIndicatorLibrary.sputumPositiveTbPatientsOnTreatmentWithFollowUpSputumPerformed(), IND_PARAMS),
            allColumns,
            Arrays.asList("44"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.patients_with_respiratory_symptoms_who_had_a_sputum_resulted", 
            MessageUtil.translate("isanteplusreports.patients_with_respiratory_symptoms_who_had_a_sputum_resulted"),
            ReportUtils.map(TbReportIndicatorLibrary.patientsWithRespiratorySymptomsWhoHadASputumResulted(), IND_PARAMS),
            allColumns,
            Arrays.asList("45"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_with_respiratory_problems", 
            MessageUtil.translate("isanteplusreports.number_of_patients_with_respiratory_problems"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWithRespiratoryProblems(), IND_PARAMS),
            allColumns,
            Arrays.asList("46"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_sputum_done_", 
            MessageUtil.translate("isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_sputum_done_"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWithRespiratoryProblemsWhoHadASputumDone(), IND_PARAMS),
            allColumns,
            Arrays.asList("47"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_positive_sputum", 
            MessageUtil.translate("isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_positive_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWithRespiratoryProblemsWhoHadAPositiveSputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("48"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_negative_sputum", 
            MessageUtil.translate("isanteplusreports.number_of_patients_with_respiratory_problems_who_had_a_negative_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWithRespiratoryProblemsWhoHadANegativeSputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("49"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.rate_of_detection_", 
            MessageUtil.translate("isanteplusreports.rate_of_detection_"),
            ReportUtils.map(TbReportIndicatorLibrary.rateOfDetection(), IND_PARAMS),
            allColumns,
            Arrays.asList("50"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_pulmonary_tb_patients_diagnosed", 
            MessageUtil.translate("isanteplusreports.number_of_pulmonary_tb_patients_diagnosed"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPulmonaryTbPatientsDiagnosed(), IND_PARAMS),
            allColumns,
            Arrays.asList("51"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_diagnosed_with_extrapulmonary_tb", 
            MessageUtil.translate("isanteplusreports.number_of_patients_diagnosed_with_extrapulmonary_tb"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsDiagnosedWithExtrapulmonaryTb(), IND_PARAMS),
            allColumns,
            Arrays.asList("52"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_tb_cases_diagnosed", 
            MessageUtil.translate("isanteplusreports.number_of_tb_cases_diagnosed"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfTbCasesDiagnosed(), IND_PARAMS),
            allColumns,
            Arrays.asList("53"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_diagnosed_with_pulmonary_tb_via_positive_sputum", 
            MessageUtil.translate("isanteplusreports.number_of_patients_diagnosed_with_pulmonary_tb_via_positive_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsDiagnosedWithPulmonaryTbViaPositiveSputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("54"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_diagnosed_with_pulmonary_tb_who_have_a_negative_sputum", 
            MessageUtil.translate("isanteplusreports.number_of_patients_diagnosed_with_pulmonary_tb_who_have_a_negative_sputum"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsDiagnosedWithPulmonaryTbWhoHaveANegativeSputum(), IND_PARAMS),
            allColumns,
            Arrays.asList("55"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_pulmonary_tb_patients_diagnosed_without_sputum_being_performed", 
            MessageUtil.translate("isanteplusreports.number_of_pulmonary_tb_patients_diagnosed_without_sputum_being_performed"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPulmonaryTbPatientsDiagnosedWithoutSputumBeingPerformed(), IND_PARAMS),
            allColumns,
            Arrays.asList("56"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_new_tb_patients_on_treatment", 
            MessageUtil.translate("isanteplusreports.number_of_new_tb_patients_on_treatment"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfNewTbPatientsOnTreatment(), IND_PARAMS),
            allColumns,
            Arrays.asList("57"));

/*
 *       EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_tb_patients_on_treatment_who_relapsed", 
            MessageUtil.translate("isanteplusreports.number_of_tb_patients_on_treatment_who_relapsed"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfTbPatientsOnTreatmentWhoRelapsed(), IND_PARAMS),
            allColumns,
            Arrays.asList("58"));
*/

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_tb_patients_not_receiving_treatment", 
            MessageUtil.translate("isanteplusreports.number_of_tb_patients_not_receiving_treatment"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfTbPatientsNotReceivingTreatment(), IND_PARAMS),
            allColumns,
            Arrays.asList("59"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_patients_who_failed_treatment", 
            MessageUtil.translate("isanteplusreports.number_of_patients_who_failed_treatment"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPatientsWhoFailedTreatment(), IND_PARAMS),
            allColumns,
            Arrays.asList("60"));

      EmrReportingUtils.addRow(dsd,
            "isanteplusreports.number_of_pulmonary_tb_patients_enrolled_for_at_least_6_months_with_no_sputum_verification", 
            MessageUtil.translate("isanteplusreports.number_of_pulmonary_tb_patients_enrolled_for_at_least_6_months_with_no_sputum_verification"),
            ReportUtils.map(TbReportIndicatorLibrary.numberOfPulmonaryTbPatientsEnrolledForAtLeast6MonthsWithNoSputumVerification(), IND_PARAMS),
            allColumns,
            Arrays.asList("61"));
        
        return dsd;
    }
        
}
package org.openmrs.module.isanteplusreports.library.indicator;

import org.openmrs.module.isanteplusreports.library.cohort.NutritionIndicatorReportCohortLibrary;
import org.openmrs.module.isanteplusreports.reporting.utils.EmrReportingUtils;
import org.openmrs.module.isanteplusreports.reporting.utils.ReportUtils;
import org.openmrs.module.reporting.indicator.CohortIndicator;

public class NutritionReportIndicatorLibrary {
    private static final String IND_PARAMS = "startDate=${startDate},endDate=${endDate},location=${location}";
    
    public static CohortIndicator totalNumberOfChildrenAged6MonthsTo59MonthsOldWeighedCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_weighed",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWeighedCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfChildrenAged6MonthsTo59MonthsOldWithMamCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_mam",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWithMamCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfChildrenAged6MonthsTo59MonthsOldWithSamCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_sam",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWithSamCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator childrenAged6MonthsTo59MonthsOldWithMamCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.children_aged_6_months_to_59_months_old_with_mam",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWithMamCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged6MonthsTo59MonthsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator childrenAged6MonthsTo59MonthsOldWithSamCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.children_aged_6_months_to_59_months_old_with_sam",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged6MonthsTo59MonthsOldWithSamCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged6MonthsTo59MonthsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfChildrenAged5To19YearsOldOverweightCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_children_aged_5_to_19_years_old_overweight", ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged5To19YearsOldOverweightCohort(), IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfChildrenAged5To19YearsOldObeseCohort() {
        return EmrReportingUtils.cohortIndicator("isanteplusreports.total_number_of_children_aged_5_to_19_years_old_obese",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfObeseChildrenAged5To19YearsCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfUnderweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary
                        .totalNumberOfUnderweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator totalNumberOfChildrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator overweightChildrenAged5To19YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.overweight_children_aged_5_to_19_years_old",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfChildrenAged5To19YearsOldOverweightCohort(),
                IND_PARAMS),
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary
                        .totalNumberOfChildrenAged5To19YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
    
    public static CohortIndicator obeseChildrenAged5To19YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.obese_children_aged_5_to_19_years_old",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfObeseChildrenAged5To19YearsCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged5To19YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator underweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.underweight_children_aged_5_to_19_years_old_with_bmi_for_age_indicating_thinness",
            ReportUtils.map(
                NutritionIndicatorReportCohortLibrary
                        .totalNumberOfUnderweightChildrenAged5To19YearsOldWithBmiForAgeIndicatingThinnessCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged5To19YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator childrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.children_aged_5_to_19_years_old_with_bmi_for_age_indicating_severe_thinness",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged5To19YearsOldWithBmiForAgeIndicatingSevereThinnessCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged5To19YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator totalNumberOfPeopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfPeopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator totalNumberOfOverweightPeopleAgedGte20YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_overweight_people_aged_gte_20_years_old",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfOverweightPeopleAgedGte20YearsOldCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator totalNumberOfObesePeopleAgedGte20YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_obese_people_aged_gte_20_years_old",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfObesePeopleAgedGte20YearsOldCohort(),
                IND_PARAMS));
    }

    public static CohortIndicator totalNumberOfUnderweightPeopleAgedGte20YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_underweight_people_aged_gte_20_years_old", ReportUtils.map(
                NutritionIndicatorReportCohortLibrary.totalNumberOfUnderweightPeopleAgedGte20YearsOldCohort(), IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfUnderweightPeopleAgedGte20YearsOldWhoAreUnderweightCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_underweight_people_aged_gte_20_years_old_who_are_underweight",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfUnderweightPeopleAgedGte20YearsOldCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator peopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.people_aged_gte_20_years_old_with_a_bmi_indicating_a_normal_weight",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfPeopleAgedGte20YearsOldWithABmiIndicatingANormalWeightCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfPeopleAgedGte20YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator overweightPeopleGte20YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.overweight_people_gte_20_years_old",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfOverweightPeopleGte20YearsOldCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfPeopleAgedGte20YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
    public static CohortIndicator obesePeopleAgedGte20YearsOldCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.obese_people_aged_gte_20_years_old",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfObesePeopleAgedGte20YearsOldCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfPeopleAgedGte20YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
 
    public static CohortIndicator peopleAgedGte20YearsOldWhoAreUnderweightCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.people_aged_gte_20_years_old_who_are_underweight",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfUnderweightPeopleAgedGte20YearsOldCohort(),
                IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfPeopleAgedGte20YearsOldWithWeightAndHeightReportedCohort(),
                IND_PARAMS));
    }
 
 
    public static CohortIndicator totalNumberOfPregnantWomenWithAMuacLte210MmCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_pregnant_women_with_a_muac_lte_210_mm",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfPregnantWomenWithAMuacLte210MmCohort(),
                IND_PARAMS));
    }
 
 
    public static CohortIndicator totalNumberOfPregnantWomenWithAMuacGte230MmCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_pregnant_women_with_a_muac_gte230_mm_",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfPregnantWomenWithAMuacGte230MmCohort(), IND_PARAMS));
    }
 
 
    public static CohortIndicator pregnantWomenWithAMuacLte210MmCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.pregnant_women_with_a_muac_lte_210_mm",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfPregnantWomenWithAMuacLte210MmCohort(), IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.pregnantWomenWithMuacMeasuredCohort(), IND_PARAMS));
    }
 
 
    public static CohortIndicator pregnantWomenWithAMuacGte230MmCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.pregnant_women_with_a_muac_gte_230_mm",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.totalNumberOfPregnantWomenWithAMuacGte230MmCohort(), IND_PARAMS),
            ReportUtils.map(NutritionIndicatorReportCohortLibrary.pregnantWomenWithMuacMeasuredCohort(), IND_PARAMS));
    }
    
    public static CohortIndicator totalNumberOfChildrenAged6MonthsTo59MonthsOldWithHeightOrLengthMeasuredCohort() {
        return EmrReportingUtils.cohortIndicator(
            "isanteplusreports.total_number_of_children_aged_6_months_to_59_months_old_with_height_or_length_measured",
            ReportUtils.map(NutritionIndicatorReportCohortLibrary
                    .totalNumberOfChildrenAged6MonthsTo59MonthsOldWithHeightOrLengthMeasuredCohort(),
                IND_PARAMS));
    }
    
}

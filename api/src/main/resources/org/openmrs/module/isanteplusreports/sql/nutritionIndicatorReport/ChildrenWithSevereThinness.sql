SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.bmi_for_age < -3 -- Severe thinness: BMI for age <-3SD
	AND voided = 0
SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	visit_date BETWEEN :startDate AND :endDate
	AND p.bmi_for_age BETWEEN -3 AND -2 -- Thinness: BMI for age <-2SD
	AND voided = 0
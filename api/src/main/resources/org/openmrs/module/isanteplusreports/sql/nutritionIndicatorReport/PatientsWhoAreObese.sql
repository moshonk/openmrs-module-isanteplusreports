SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.bmi > 30 -- Obesity: >+2SD
	AND voided = 0
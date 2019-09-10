SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.bmi BETWEEN 18.5 AND 24.99 -- Normal BMI
	AND voided = 0
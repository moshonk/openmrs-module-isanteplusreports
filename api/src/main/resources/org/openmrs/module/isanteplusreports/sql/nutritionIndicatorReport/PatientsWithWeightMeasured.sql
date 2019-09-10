SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.weight IS NOT NULL
	AND voided = 0
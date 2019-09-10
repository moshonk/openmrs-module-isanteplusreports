SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.age_at_visit_years BETWEEN 5 AND 19
	AND voided = 0
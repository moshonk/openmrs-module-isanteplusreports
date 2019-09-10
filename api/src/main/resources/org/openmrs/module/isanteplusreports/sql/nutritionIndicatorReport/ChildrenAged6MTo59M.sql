SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.age_at_visit_months BETWEEN 6 AND 59
	AND voided = 0
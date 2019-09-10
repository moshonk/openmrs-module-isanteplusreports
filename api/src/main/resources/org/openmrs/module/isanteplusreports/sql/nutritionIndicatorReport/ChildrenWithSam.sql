SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.weight_for_height < -3
	AND voided = 0
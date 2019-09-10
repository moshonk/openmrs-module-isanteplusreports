SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_ob_gyn p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND voided = 0
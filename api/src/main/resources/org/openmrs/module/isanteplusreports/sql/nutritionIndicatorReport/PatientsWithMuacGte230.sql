SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_ob_gyn p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.muac >= 230 
	AND voided = 0
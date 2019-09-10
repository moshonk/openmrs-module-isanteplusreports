SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_ob_gyn p
WHERE 
	visit_date BETWEEN :startDate AND :endDate
	AND p.muac IS NOT NULL
	AND voided = 0
SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
	AND visit_date >= :startDate
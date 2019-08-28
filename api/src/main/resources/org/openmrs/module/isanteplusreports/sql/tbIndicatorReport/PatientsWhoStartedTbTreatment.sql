SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	(
		DATE(p.tb_treatment_start_date) >= :startDate 
		AND DATE(p.tb_treatment_start_date) <= :endDate 
	)
	AND tb_medication_provided = 1
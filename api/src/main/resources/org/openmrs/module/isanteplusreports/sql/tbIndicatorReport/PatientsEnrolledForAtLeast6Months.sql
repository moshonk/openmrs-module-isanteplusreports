SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	(
		TIMESTAMPDIFF(MONTH,p.tb_treatment_start_date,:endDate) >= 6
	)
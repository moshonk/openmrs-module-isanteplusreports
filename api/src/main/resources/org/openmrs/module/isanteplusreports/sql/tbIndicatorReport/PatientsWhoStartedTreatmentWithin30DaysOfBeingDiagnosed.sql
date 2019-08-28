SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	(
		TIMESTAMPDIFF(DAY,
		(SELECT 
			MIN(visit_date) 
		FROM 
			isanteplus.patient_tb_diagnosis p1 
		WHERE 
			p1.patient_id = p.patient_id
			AND
			p1.tb_new_diag = 1),
		p.tb_treatment_start_date) BETWEEN 0 AND 30
	)

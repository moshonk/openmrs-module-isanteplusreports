SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location
	AND 
	(
		tb_started_treatment = 1 -- Started TB Treatment
		AND tb_medication_provided = 1 -- TB Medications provided
	)

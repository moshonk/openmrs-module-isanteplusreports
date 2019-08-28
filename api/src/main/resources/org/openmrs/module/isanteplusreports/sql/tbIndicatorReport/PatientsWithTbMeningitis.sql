SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location	
	AND
	(
		tb_extra_meningitis = 1 -- TB Meningitis
	)
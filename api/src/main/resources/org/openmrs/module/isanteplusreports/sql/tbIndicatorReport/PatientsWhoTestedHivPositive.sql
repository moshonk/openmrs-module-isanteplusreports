SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location	
	AND
	(
		tb_hiv_test_result = 4 -- Positive HIV result
	)
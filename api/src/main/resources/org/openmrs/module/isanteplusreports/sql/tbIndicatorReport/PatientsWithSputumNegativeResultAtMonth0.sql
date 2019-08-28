SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location	
	AND
	(
		tb_diag_sputum = 1 -- Diagnosis based on Sputum
		AND 
			(
				tb_test_result_mon_2 = 2 -- Negative sputum result at Month 2
			)
	)
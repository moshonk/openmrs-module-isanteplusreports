SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location
	AND 
	(
		tb_diag_xray = 1 -- Diagnosis based on XRay
		OR tb_diag_sputum = 1 -- Diagnosis based on Sputum
		OR tb_class_pulmonary = 1 --  Pulmonary TB Classification
		OR tb_test_result_mon_0 = 1 -- Positive sputum result at Month 0
	)
	AND
	(
		tb_class_extrapulmonary <> 1 -- Extra pulmonary TB
		AND tb_extra_mengitis <> 1 -- Meningitis TB
		AND tb_extra_genital <> 1 -- Genital TB
		AND tb_extra_pleural <> 1 -- Pleural TB
		AND tb_extra_miliary <> 1 -- Miliary TB
		AND tb_extra_gangliponic <> 1 -- Gangliponic TB
		AND tb_extra_intestinal <> 1 -- Intenstinal TB
		AND tb_extra_other <> 1 -- Other extra pulmonary TB
	)

SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	DATE(visit_date) <= :endDate
--	AND location_id = :location
	AND
	(
		cough_for_2wks_or_more = 1 -- Cough for more than 2 weeks
		OR dyspnea = 1 -- dyspnea
	)
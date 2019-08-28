SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient p
WHERE 
	TIMESTAMPDIFF(MONTH,p.birthdate,:endDate)<60
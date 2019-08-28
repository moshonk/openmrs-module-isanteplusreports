SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient p
WHERE 
	TIMESTAMPDIFF(YEAR,p.birthdate,:endDate)>=15
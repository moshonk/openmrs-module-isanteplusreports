SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	visit_date BETWEEN :startDate AND :endDate
	AND p.bmi_for_age > 2 -- Obese: >+2SD (equivalent to BMI 30 kg/m2
	AND voided = 0
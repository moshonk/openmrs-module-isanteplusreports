SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	visit_date BETWEEN :startDate AND :endDate
	AND p.bmi_for_age BETWEEN 1 AND 2 -- Overweight: >+1SD (equivalent to BMI 25 kg/m2
	AND voided = 0
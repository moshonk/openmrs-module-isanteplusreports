SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_nutrition p
WHERE 
	p.visit_date BETWEEN :startDate AND :endDate
	AND p.bmi BETWEEN 25 AND 29 -- Overweight: >+1SD (equivalent to BMI 25 kg/m2
	AND voided = 0
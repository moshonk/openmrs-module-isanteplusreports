SELECT 
	DISTINCT patient_id 
FROM 
	isanteplus.patient_tb_diagnosis p
WHERE 
	visit_date <= :endDate
--	AND location_id = :location
	AND
	(
		tb_class_extrapulmonary = 1 -- Extra pulmonary tb classification
		OR tb_extra_mengitis = 1 -- Meningitis TB
		OR tb_extra_genital = 1 -- Genital TB
		OR tb_extra_pleural = 1 -- Pleural TB
		OR tb_extra_miliary = 1 -- Miliary TB
		OR tb_extra_gangliponic = 1 -- Gangliponic TB
		OR tb_extra_intestinal = 1 -- Intestinal TB
		OR tb_extra_other = 1 -- Other extrapulmonary TB
	)
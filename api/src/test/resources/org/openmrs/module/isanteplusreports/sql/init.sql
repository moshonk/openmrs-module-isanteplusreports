DROP TABLE IF EXISTS isanteplus.PATIENT_NUTRITION;

CREATE TABLE isanteplus.PATIENT_NUTRITION (
  patient_id int(11) NOT NULL,
  location_id int(11) NOT NULL,
  visit_id int(11) DEFAULT NULL,
  visit_date date DEFAULT NULL,
  encounter_id int(11) NOT NULL,
  encounter_type_id int(11) NOT NULL,
  age_at_visit_years int(11) DEFAULT NULL,
  age_at_visit_months int(11) DEFAULT NULL,
  weight double DEFAULT NULL,
  height double DEFAULT NULL,
  bmi double DEFAULT NULL,
  bmi_for_age int(11) DEFAULT NULL,
  weight_for_height int(11) DEFAULT NULL,
  edema tinyint(1) DEFAULT NULL,
  last_updated_date datetime DEFAULT NULL,
  voided tinyint(1) DEFAULT NULL,
  PRIMARY KEY (encounter_id,location_id)
);
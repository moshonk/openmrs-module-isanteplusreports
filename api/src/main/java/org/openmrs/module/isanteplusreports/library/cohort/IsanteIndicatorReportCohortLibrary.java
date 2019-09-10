package org.openmrs.module.isanteplusreports.library.cohort;

import org.openmrs.module.reporting.cohort.definition.CompositionCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.SqlCohortDefinition;

public interface IsanteIndicatorReportCohortLibrary {
    
    static SqlCohortDefinition sqlCohortDefinition(String sqlResourceName, String cohortDefinitionName) {
        return null;
    }
    
    static CompositionCohortDefinition compositionCohortDefinition(String cohortDefinitionName) {
        return null;
    }
    
}

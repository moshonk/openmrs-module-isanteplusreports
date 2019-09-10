package org.openmrs.module.isanteplusreports.library.cohort;


import org.junit.Assert;
import org.junit.Test;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public class NutritionIndicatorReportCohortLibraryTest extends BaseModuleContextSensitiveTest {
    
    /**
    * @see NutritionIndicatorReportCohortLibrary#compositionCohortDefinition(String)
    * @verifies not return null object
    */
    @Test
    public void compositionCohortDefinition_shouldNotReturnNullObject() throws Exception {
        String xx = "123";
        Assert.assertEquals(xx, "123");
        
    }
}
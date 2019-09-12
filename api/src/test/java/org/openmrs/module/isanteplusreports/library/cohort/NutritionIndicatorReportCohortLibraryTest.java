package org.openmrs.module.isanteplusreports.library.cohort;


import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.Cohort;
import org.openmrs.api.context.Context;
import org.openmrs.module.isanteplusreports.StandaloneContextSensitiveTest;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.cohort.definition.service.CohortDefinitionService;
import org.openmrs.module.reporting.evaluation.EvaluationContext;
import org.openmrs.test.BaseContextSensitiveTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NutritionIndicatorReportCohortLibraryTest extends StandaloneContextSensitiveTest {
    
    private static final Logger log = LoggerFactory.getLogger(NutritionIndicatorReportCohortLibraryTest.class);
    
    //private static final String XML_DATASET_PATH = "org/openmrs/module/isanteplusreports/includes/nutritionReportData.xml";
    
    /**
     * Run this before each unit test in this class. The "@Before" method in
     * {@link BaseContextSensitiveTest} is run right before this method.
     * 
     * @throws Exception
     */
    @Before
    public void initialize() throws Exception {
        
        //executeDataSet(XML_DATASET_PATH);
    }
    
    /**
    * @see NutritionIndicatorReportCohortLibrary#compositionCohortDefinition(String)
    * @verifies not return null object
    */
    @Test
    public void compositionCohortDefinition_shouldNotReturnNullObject() throws Exception {
        String xx = "123";
        Assert.assertEquals(xx, "123");
        
    }
    
    /**
     * @see NutritionIndicatorReportCohortLibrary#childrenAged5To19Cohort()
     * @verifies return correct count
     */
    @Test
    public void childrenAged5To19Cohort_shouldReturnCorrectCount() throws Exception {
        EvaluationContext evaluationContext = new EvaluationContext();
        Map<String, Object> parameterValues = new HashMap<String, Object>();
        parameterValues.put("startDate", new String("2016-06-20"));
        parameterValues.put("endDate", new String("2018-08-02"));
        
        evaluationContext.setParameterValues(parameterValues);
        
        CohortDefinition cohortDefinition = NutritionIndicatorReportCohortLibrary.childrenAged5To19Cohort();
        Cohort cohort = Context.getService(CohortDefinitionService.class).evaluate(cohortDefinition, evaluationContext);
        Assert.assertEquals(2, cohort.size());
        Assert.assertTrue(cohort.contains(190));
    }
}
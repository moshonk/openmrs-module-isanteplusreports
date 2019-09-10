package org.openmrs.module.isanteplusreports;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public abstract class StandaloneContextSensitiveTest extends BaseModuleContextSensitiveTest {
    
    @Override
    public Properties getRuntimeProperties() {
        Properties p = super.getRuntimeProperties();
        String url = "jdbc:h2:mem:openmrs;DB_CLOSE_DELAY=30;LOCK_TIMEOUT=10000";
        runtimeProperties.setProperty(Environment.URL, url);
        
        return p;
    }
}

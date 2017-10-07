package com.wikipedia.cmptest;

import com.cucumber.listener.ExtentCucumberFormatter;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import java.io.File;
import com.wikipedia.cmptest.RuntimeSettings;

@RunWith(Cucumber.class)
@CucumberOptions(
    strict = false, 
    plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter" },
    features = "src/test/java/com/wikipedia/cmptest/features",
    glue = {"com.wikipedia.cmptest.stepDefinitions" }
      )
public class RunCukesTest {
    @BeforeClass
    public static void setUp() throws Exception {
        String applicationUrl = RuntimeSettings.getApplicationUrl();

        ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("reports/index.html"));
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
        ExtentCucumberFormatter.addSystemInfo("Application URL", applicationUrl);
    }
}
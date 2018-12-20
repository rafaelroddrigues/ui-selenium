package org.cucumber.run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/org/cucumber/features",
        glue = "org/cucumber/search",
        plugin = {"pretty"})
public class RunCucumberTest {
}

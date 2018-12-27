package run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import base.BaseStep;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "search",
        plugin = {"pretty"})
public class RunCucumberTest extends BaseStep {
}

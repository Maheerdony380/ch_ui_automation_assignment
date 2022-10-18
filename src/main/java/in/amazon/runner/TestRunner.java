package in.amazon.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "in/amazon/stepDefinitions",
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
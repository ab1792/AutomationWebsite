package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Ecommerce.feature",
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty"},
        monochrome = true,
        publish = true
)

public class Runner extends AbstractTestNGCucumberTests {
}
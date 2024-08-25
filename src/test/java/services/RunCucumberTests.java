package services;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/services",
        glue = "services/google_page",
        tags = "@Smoke or @Regression",
        plugin = {"pretty", "html:target/cucumber-reports/CucumberTests.html",
                "json:target/cucumber-reports/CucumberTests.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RunCucumberTests extends AbstractTestNGCucumberTests {
}
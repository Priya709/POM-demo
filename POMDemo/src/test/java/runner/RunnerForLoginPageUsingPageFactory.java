package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/LoginDemo.feature",glue={"StepDefinition"},
        dryRun = false, monochrome=true,
        plugin = { "pretty", "junit:target/JUnitReports/reports.xml",
                "json:target/JSONReports/report.json",
                "html:target/HTMLReports"})

public class RunnerForLoginPageUsingPageFactory {
}
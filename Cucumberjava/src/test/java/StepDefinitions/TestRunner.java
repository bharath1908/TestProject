package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "StepDefinitions" }, plugin = { "pretty",
		"junit:target/JUnitReports/report.xml", "html:target/HtmlReports", "json:target/JSONReports/report.json" })
public class TestRunner {

}

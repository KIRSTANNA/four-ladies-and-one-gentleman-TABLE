package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = { "pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json" },
        tags = {"~@not_working", "@part4", "~@bug"}, // => NOT @not_working AND @part3 AND NOT @bug
        glue = { "stepDefinitions" }
        )
public class CucumberRunner {

}

//Edit configuration
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty","html:target/cucumber-reports.html",
                    "pretty","json:target/json-reports/Pcucumber.json",
                    "pretty","junit:target/xml-report/Pcucumber.xml"},
            features = "src/test/resources/features",
            glue = "stepdefinitions",
            tags = "@smoke",
            dryRun = false

    )

public class Runner{    }


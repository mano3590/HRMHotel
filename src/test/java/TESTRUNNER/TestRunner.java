package TESTRUNNER;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Facebook", glue = "STEPDEFINITION", tags = "@Regression")

public class TestRunner {

}

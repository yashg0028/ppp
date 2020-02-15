package driverScript;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"Feature"},
glue = "stepDefinition", 
plugin = {"json:target/Reports/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter:target/Reports/cucumber-report.html"}, 
monochrome = true, 
tags = {"@Sanity"})

public class RunCukes {

}

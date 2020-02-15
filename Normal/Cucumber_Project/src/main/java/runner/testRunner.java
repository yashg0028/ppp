package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "G:\\Workspace\\Cucumber_Project\\src\\main\\java\\features\\login.feature", //path of feature file
		glue ={"stepDefinition"}, //path of stepdefinition class
		format={"pretty", "html:testoutput","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, //to  generate diff types of reporting
		monochrome =true, // display the console ouput in a proper readble format.
		strict = true, //it will check if any step is not defined in step definition file.
		dryRun=false //to check the mapping is proper between feature file and step definition file.
	)


public class testRunner {

}

package com.qa.TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Tamanna\\Selenium_Workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features"
		//path of feature file
 ,glue={"com\\qa\\stepDefinitions"}, //path of step defination files
format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
 dryRun = false ,// makes sure that  all feature files have matching tests cases
 monochrome= true // it will generate  proper readable console output
// strict = true// fails execution if any pending steps are there
 )
public class TestRunner {

}

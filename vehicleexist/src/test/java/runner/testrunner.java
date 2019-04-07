package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\main\\java\\Features\\vehicle.feature",
              glue= {"Stepdefinitions"},
              format= {"pretty", "html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
               dryRun=false,
                monochrome=true,
               strict=false
              )


public class testrunner {

}

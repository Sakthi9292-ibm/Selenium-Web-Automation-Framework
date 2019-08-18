package testCases;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  

@CucumberOptions(format = { "pretty", "json:target/cucumber.json", "html:target/html_report" }, features = { 
		"src/main/java" },tags={"@PaperBook"})

public class AmazonRunner {

}

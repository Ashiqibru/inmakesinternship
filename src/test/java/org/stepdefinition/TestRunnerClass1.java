package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" ,
glue = "org.stepdefinition" ,
monochrome = true ,
dryRun = true,
strict = true,
snippets = SnippetType.UNDERSCORE ,
tags = {"@Feature1"} ,
plugin = { "pretty", "html:Report1" ,
		"junit:Report1\\junitreport.xml" ,
		"json:Report1\\jsonreport1.json"}
)
public class TestRunnerClass1 {
	
	

}

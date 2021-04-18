package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"}, 
glue = {"StepDefinition"},
tags = "@Login",
dryRun = false,
monochrome = true,
plugin = {"html:testoutput/Abdul.html", "junit:testoutput/report.xml" , "json:testoutput/jsonreport.json"})

public class Test_Runner {

	
}

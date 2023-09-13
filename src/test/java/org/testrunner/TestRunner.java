package org.testrunner;

import org.base.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Login.feature", glue = "org.stepdef", dryRun = false,
plugin = {"html:C:\\Users\\LENOVO\\eclipse-workspace\\MavenDemo\\target//sample.html",
		"json:C:\\Users\\LENOVO\\eclipse-woace\\MavenDemo\\target\\sample.json"})

public class TestRunner {

	
	@AfterClass
	public static void aftclass() {
		
		ReportGeneration.generateJVMReport("C:\\\\Users\\\\LENOVO\\\\eclipse-woace\\\\MavenDemo\\\\target\\\\sample.json");
	}
	
	
}

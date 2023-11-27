package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", plugin = { "pretty",
		"json:target\\output.json","rerun:target\\failed.txt"}, dryRun = false, stepNotifications = true, features = "src\\test\\resources\\Features", glue = "com.stepdefinition")




public class TestRunnerClass extends BaseClass {
	
	
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("browser", "chrome");

	}
	
	
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {

		Reporting.generateJvmReport(getProjectPath() + getPropertiesFileValue("jsonPath"));

	}

}

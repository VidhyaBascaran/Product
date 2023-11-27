package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


/**
 * @author Vidhya
 * @see This class is to maintain all the scenario
 * @since 26-05-23
 */

public class HooksClass extends BaseClass{
	
	static Scenario scenario;
	
	
	/**
	 * @author vidhya
	 * @see This method is to include the reponse body in report
	 * @param sc should be send as a Scenario class
	 */
	@Before
	public void beforeScenario(Scenario sc) throws FileNotFoundException, IOException {
		
		scenario=sc;
		
		String id = sc.getName();
		System.out.println("scenario :"+id);
		int i=0;
		if(id.contains("DemoQA")) {
			i=1;			
		}else if(id.contains("Amazon"))
		{
			i=2;
		}else if(id.contains("flipkart")) {
			i=3;
		}
		
		getDriver(getPropertiesFileValue("browser"));
			
		loadURL(getPropertiesFileValue("url"+i));
		maximizeWindow();
		implicitWait();	
		
		
		

	}
	
	/**
	 * @author vidhya
	 * @see This method is to include the failed scenario screenshot in report
	 * @param scenario should be send as a Scenario class
	 */

	
	@After
	public void afterScenario(Scenario scenario) {
		
		boolean failedScenarios = scenario.isFailed();
		
		if(failedScenarios) {
			
			scenario.attach(screenShot(), "image/png", "Failed Scenario screenshots");
			
			
		}
		
		//quitBrowser();
	}
	
	
	
	
	
}

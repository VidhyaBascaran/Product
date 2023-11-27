package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC1_DemoQA extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();
	
	
	
	@Given("User is on DemoQA Register page")
	public void user_is_on_demo_qa_register_page() {
		
		
		
	    
	}
	@When("User enters {string},{string},{string} and {string}")
	public void user_enters_and(String firstName, String lastName, String userName, String password) {
		
		disableChromeOption();
		
		type(pom.getDemoQAPage().getTxtFirstName(),firstName);
		type(pom.getDemoQAPage().getTxtLastName(),lastName);
		type(pom.getDemoQAPage().getTxtUserName(),userName);
		type(pom.getDemoQAPage().getTxtPassword(),password);
		
		javaScriptShrink();
		threadSleep();
		
		switchToFrame(pom.getDemoQAPage().getiFrame());
		click(pom.getDemoQAPage().getChkRobot());
		visibilityOfElement(pom.getDemoQAPage().getChkRobot());

		switchToMainPage();
		
			
		click(pom.getDemoQAPage().getBtnRegister());		
		threadSleep();
	    
	}
	@Then("User Should Verify success message after register {string}")
	public void user_should_verify_success_message_after_register(String expSuccessMsg) {
		
		String actSuccessMsg = pom.getDemoQAPage().getActSuccessMsg().getText();
		Assert.assertTrue("Verify success message after register",actSuccessMsg.contains(expSuccessMsg));
	    
	}



	

}

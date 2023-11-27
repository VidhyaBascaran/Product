package com.stepdefinition;


import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;
import org.junit.Assert;


public class TC2_Amazon extends BaseClass {
	
	
	PageObjectManager pom=new PageObjectManager();

	@Given("User is on Amazon page")
	public void user_is_on_amazon_page() {
		
		
		
	}
	@When("User enters {string}")
	public void user_enters(String searchProduct) {
		
		type(pom.getAmazonPage().getTxtSearchBox(), searchProduct);
		keyEnter(pom.getAmazonPage().getTxtSearchBox());
		threadSleep();
			
		
	}
	@Then("User verify success message after search Product {string}")
	public void user_verify_success_message_after_search_product(String expSuccessMsg) {
		 
		
		String actSuccessMsg = getText(pom.getAmazonPage().getActSuccessMsg());
		System.out.println("Actual Message:"+actSuccessMsg);
		Assert.assertTrue("Verifying search success message", actSuccessMsg.contains(expSuccessMsg));

			
	}
	@When("User select the product")
	public void user_select_the_product() {
		
		click(pom.getAmazonPage().getLnkProduct());
		windowHandle();
		threadSleep();
		
	}
	@When("User add the product to cart")
	public void user_add_the_product_to_cart() {
		
			click(pom.getAmazonPage().getBtnAddToCart());
			//click(pom.getAmazonPage().getBtnSkip());
			threadSleep();
	}
	@Then("User Should verify the sucess message after product added {string}")
	public void user_should_verify_the_sucess_message_after_product_added(String expProductSuccessMsg) {
		
		String actProductSuccessMsg = getText(pom.getAmazonPage().getActProductSuccessMsg());
		System.out.println("Actual Message:"+actProductSuccessMsg);

		Assert.assertTrue("Verifying search success message", actProductSuccessMsg.contains(expProductSuccessMsg));

	}






	
	

}

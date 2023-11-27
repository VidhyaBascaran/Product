package com.stepdefinition;


import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_Flipkart extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager();
	
	

	@Given("User is on Flipkart page")
	public void user_is_on_flipkart_page() {
		
		
		
	}
	@When("User enter {string}")
	public void user_enter(String searchProduct) 
	{
		
		type(pom.getFlipkartPage().getTxtSearchBox(), searchProduct);
		keyEnter(pom.getFlipkartPage().getTxtSearchBox());
		threadSleep();
		
	}
	@Then("User should verify the success message after search product {string}")
	public void user_should_verify_the_success_message_after_search_product(String expSearchSuccessMsg) 
	{
		String actSearchSuccessMsg = getText(pom.getFlipkartPage().getActSearchSuccessMsg());
		Assert.assertTrue("Verifying after search product success message", actSearchSuccessMsg.contains(expSearchSuccessMsg));
		
	}
	@When("User select product")
	public void user_select_product() 
	{
		
		click(pom.getFlipkartPage().getLnkProduct());
		windowHandle();
		threadSleep();
		
	}
	
	@When("User  add the product in the cart")
	public void user_add_the_product_in_the_cart() 
	{
		
		click(pom.getFlipkartPage().getBtnAddToCart());
		threadSleep();
		
	
		
	}
	
	@Then("User Should verify the sucess message after added product  {string}")
	public void user_should_verify_the_sucess_message_after_added_product(String expProductSuccessMsg) 
	{
		
		
		String actProductSuccessMsg = getText(pom.getFlipkartPage().getActProductSuccessMsg());
		System.out.println(actProductSuccessMsg);
		Assert.assertTrue("Verifying after search product success message", actProductSuccessMsg.contains(expProductSuccessMsg));

	}


	

	
	
	
	
	

}

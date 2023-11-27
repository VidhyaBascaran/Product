package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FlipkartPage extends BaseClass {
	
	
	public FlipkartPage() {

		PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="//div[@data-id='RBKGT8KB8HSHJVRX']")
	private WebElement lnkProduct;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement btnAddToCart;

	@FindBy(xpath="//span[@class='_10Ermr']")
	private WebElement actSearchSuccessMsg;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement actProductSuccessMsg;
	
	
	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getLnkProduct() {
		return lnkProduct;
	}

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getActSearchSuccessMsg() {
		return actSearchSuccessMsg;
	}

	public WebElement getActProductSuccessMsg() {
		return actProductSuccessMsg;
	}
	
	
	
	
	
	
	

}

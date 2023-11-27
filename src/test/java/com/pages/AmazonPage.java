package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AmazonPage extends BaseClass{
	
	
	public AmazonPage() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtSearchBox;
	 //public  static By txtSearchBox=By.id("twotabsearchtextbox");
	 
				
	@FindBy(xpath="//div[@data-uuid='1121cce5-e8b0-4180-8f64-cc85c7dde592']")
	private WebElement lnkProduct;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath="//*[text()='Results']")
	private WebElement actSuccessMsg;
	
	@FindBy(xpath="//div[@class='a-fixed-left-grid']")
	private WebElement actProductSuccessMsg;
	
	@FindBy(xpath="(//*[text()=' Skip '])[2]")
	private WebElement btnSkip; 
	
	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}


	public WebElement getLnkProduct() {
		return lnkProduct;
	}


	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}


	public WebElement getActSuccessMsg() {
		return actSuccessMsg;
	}


	public WebElement getActProductSuccessMsg() {
		return actProductSuccessMsg;
	}


	public WebElement getBtnSkip() {
		return btnSkip;
	}
	
	
	
	
	
	
	

}

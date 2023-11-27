package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DemoQAPage extends BaseClass {
	
	
	
	
	public DemoQAPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="firstname")
	private WebElement txtFirstName;
	
	
	@FindBy(id="lastname")
	private WebElement txtLastName;
	
	
	@FindBy(id="userName")
	private WebElement txtUserName;
	
	
	@FindBy(id="password")
	private WebElement txtPassword;
	

	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	private WebElement iFrame;
	
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	private WebElement chkRobot;
	
	@FindBy(xpath="//button[@id='register']")
	private WebElement btnRegister;
	
	@FindBy(id="name")
	private WebElement actSuccessMsg;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}


	public WebElement getTxtLastName() {
		return txtLastName;
	}


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getiFrame() {
		return iFrame;
	}


	public WebElement getChkRobot() {
		return chkRobot;
	}


	public WebElement getBtnRegister() {
		return btnRegister;
	}


	public WebElement getActSuccessMsg() {
		return actSuccessMsg;
	}
	
	
	
	
	
	
	

}

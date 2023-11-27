package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void getDriver(String browserType) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		String v = System.getProperty("browser", browserType);
//		
//		System.out.println(v);
//		switch (v) {
//		case "chrome":
//			driver = new ChromeDriver();
//			break;
//		case "firefox":
//			driver = new FirefoxDriver();
//			break;
//		case "ie":
//			driver = new InternetExplorerDriver();
//			break;
//		case "edge":
//			driver = new EdgeDriver();
//			break;
//		default:
//			break;}

	}

	public void quitBrowser() {

		driver.quit();

	}

	public static void disableChromeOption() {

		ChromeOptions chrome_Profile = new ChromeOptions();
		chrome_Profile.addArguments("chrome.switches", "--disable-extensions");
		chrome_Profile.addArguments("--disable-save-password");
		chrome_Profile.addArguments("disable-infobars");
	}

	public static void maximizeWindow() {

		driver.manage().window().maximize();
	}

	public static void loadURL(String url) {

		driver.get(url);

	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public void visibilityOfElement(WebElement locatorName) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(locatorName));

	}

	public void type(WebElement element, String data) {
		visibilityOfElement(element);
		element.sendKeys(data);
	}

	public void keyEnter(WebElement element) {
		visibilityOfElement(element);
		element.sendKeys(Keys.chord(Keys.ENTER));
	}

	public void click(WebElement element) {
		visibilityOfElement(element);
		element.click();
	}

	public String getText(WebElement element) {
		visibilityOfElement(element);
		String text = element.getText();
		return text;

	}

	public String getAttribute(WebElement element, String data) {
		visibilityOfElement(element);
		String attribute = element.getAttribute(data);
		return attribute;

	}

	public static String getProjectPath() {

		String path = System.getProperty("user.dir");
		return path;
	}

	public static String getPropertiesFileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\Config\\Config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

	public void acceptAlert() {

		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void cancelAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public void dropDownList(WebElement element, String visibleText) {
		visibilityOfElement(element);
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);

	}

	public void dropDownList(WebElement element, int index) {
		visibilityOfElement(element);

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public void dropDownList(String value, WebElement element) {
		visibilityOfElement(element);
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public void threadSleep() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void pressEnterKey(WebElement element) {

		visibilityOfElement(element);
		try {

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public void javaScriptType(WebElement element, String date) {
		visibilityOfElement(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + date + "')", element);

	}

	public void javaScriptShrink() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
	}

	public void windowHandle() {

		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();

		for (String eachWindowId : allWindowId) {

			if (!eachWindowId.equals(parentWindowId)) {
				driver.switchTo().window(eachWindowId);
			}

		}

	}

	public void switchToFrame(WebElement element) {

		visibilityOfElement(element);

		driver.switchTo().frame(element);
	}

	public void switchToParentFrame() {

		driver.switchTo().parentFrame();
	}

	public void switchToMainPage() {
		driver.switchTo().defaultContent();
	}

	public byte[] screenShot() {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;

	}

}

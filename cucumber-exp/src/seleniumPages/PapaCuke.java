package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import common.Page_BasePage;

public class PapaCuke extends Page_BasePage {

	// So the original is kind of serving a similar purpose as
	// PapaBless in SeleniumJava, except for TestNG framework annotations.
	// This is holding all the Selenium and is called by the StepDefs classes.
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","//webdrivers//chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	public void navToDemoPage() {
		driver.get("localhost:8080"); // This is meant to be used with my SpringBoorProject, which runs here.
		// So wait is having an issue. I should use these and will fix them later.
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/html5']")));
		driver.findElement(By.xpath("//a[@href='/html5']")).click();
	}
		
	public void enterInTextField(String arg1){
		driver.findElement(By.name("textField")).sendKeys(arg1);
	}
	
	public void submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void verifyTextField(String arg1) {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='textResult']")));
		String actualText = driver.findElement(By.xpath("//p[@id='textResult']")).getText();
		Assert.assertEquals(arg1,actualText);
	}
	
	public void makeDropDownSelection(String arg1) {
		//I should have a wait here once I fix it
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='dropDownSelection']")));  
		dropDown.selectByVisibleText(arg1);
		this.submit();
	}
	
	public void validateDropDownSelection(String arg1) {
		//ditto
		Assert.assertEquals(arg1,driver.findElement(By.xpath("//p[@id='dropDownResult']")).getText());
	}
}
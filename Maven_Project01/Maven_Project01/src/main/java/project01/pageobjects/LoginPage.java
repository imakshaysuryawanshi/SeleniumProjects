package project01.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project01.abstractcomponents.AbstractComponents;

public class LoginPage extends AbstractComponents {

	WebDriver driver;
		public LoginPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//WebElement userEmail = driver.findElement(By.id("userEmail"));
		
	@FindBy(id="userEmail")
	WebElement userEmail;

	@FindBy(id="userPassword")
	WebElement passwordEle;
	
	@FindBy (id="login")
	WebElement loginButton;
	
	public void goTo() {
		
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	}
	public void loginApplication(String email, String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		loginButton.click();
	}
	
	
	
}

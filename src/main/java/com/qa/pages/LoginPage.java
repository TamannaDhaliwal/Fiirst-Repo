package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;



public class LoginPage  extends TestBase{
	
	//PageFactory
	@FindBy(xpath="//div[@class='rd-navbar-panel']//div[@class='rd-navbar-brand']//a[@class='brand-name']//span[contains(text(),'free')]")
	WebElement crmLogo;
	

	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement LogIn;
	
	@FindBy(name ="email")
	WebElement email;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement LoginBtn;
	
	//SignUp
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	

	
	//to initialize Page factories we create constructor of this class and use this method --> PageFactory.initElements(driver, this)
	//this refers to this(current) class objects
	
	//Initializing the Page Objects:
	public LoginPage() {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//Actions: diff features avail
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public  void loginApp () {
		LogIn.click();
	}
	
	public HomePage login(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
	}

	
	
}



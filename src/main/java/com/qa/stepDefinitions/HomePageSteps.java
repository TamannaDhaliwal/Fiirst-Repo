package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {

LoginPage loginpage ;
HomePage homepage;
@Given("^user opens browser$")
public void user_opens_browser() {
    TestBase.initialization();
}

@Then("^user is on login Page$")
public void user_is_on_login_Page()  {
	LoginPage loginpage = new LoginPage();
 String title = loginpage.validateLoginPageTitle();
 Assert.assertEquals("#1 Free CRM customer relationship management software cloud",title );
}

@Then("^user enters username and password$")
public void user_enters_username_and_password()  {
	LoginPage loginpage = new LoginPage();
		loginpage.loginApp();
   homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    
}




@Then("^validate home page title$")
public void validate_home_page_title()  {
	 String HomePagetitle =  homepage.verifyHomePageTitle();
	 Assert.assertEquals ("Cogmento CRM",HomePagetitle );
	
}

@Then("^validate logged in user$")
public void validate_logged_in_user()  {
  boolean flag =  homepage.verifyCorrectUserName();
  Assert.assertTrue(flag);
}
}

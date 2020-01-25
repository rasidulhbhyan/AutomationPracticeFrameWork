package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MyAccountPage;

public class TestRunner extends TestBase {

	
	
	
public void signInTest() {

	goToSiteUsing("chrome");	
	HomePage homePage = new HomePage(driver);
		homePage.goToSignInPage();
	MyAccountPage myAccountPage = new MyAccountPage(driver);	
	myAccountPage.signIn("theoffice123@gmail.com", "password123");
	
	String nameDisplayed= myAccountPage.userNameDisplayed();
	Assert.assertEquals(nameDisplayed, "Micheal Scott");
	
}

public void signOutTest() {

	goToSiteUsing("chrome");	
	HomePage homePage = new HomePage(driver);
		homePage.goToSignInPage();
	MyAccountPage myAccountPage = new MyAccountPage(driver);	
	myAccountPage.signIn("theoffice123@gmail.com", "password123");
	myAccountPage.signOut();
	
	String nameDisplayed= myAccountPage.userNameDisplayed();
	Assert.assertEquals(nameDisplayed, "Sign In");
	
}	

public void goToHomePageFromAccountPage() {
	
	goToSiteUsing("chrome");	
	HomePage homePage = new HomePage(driver);
		homePage.goToSignInPage();
	MyAccountPage myAccountPage = new MyAccountPage(driver);	
	myAccountPage.signIn("theoffice123@gmail.com", "password123");
	myAccountPage.goToHomePage();	
	
}
	
	
public void goToTshirtPage() {
	goToSiteUsing("firefox");	
	HomePage homePage = new HomePage(driver);
		homePage.goToSignInPage();
	MyAccountPage myAccountPage = new MyAccountPage(driver);	
	myAccountPage.signIn("theoffice123@gmail.com", "password123");
	myAccountPage.goToHomePage();
		homePage.goToTshirtPage();
	
}	

@Test
public void goToDressPage() {
	goToSiteUsing("firefox");	
	HomePage homePage = new HomePage(driver);
		homePage.goToSignInPage();
	MyAccountPage myAccountPage = new MyAccountPage(driver);	
	myAccountPage.signIn("theoffice123@gmail.com", "password123");
	myAccountPage.goToHomePage();
		homePage.goToDressPage();
	
}
	
	
}

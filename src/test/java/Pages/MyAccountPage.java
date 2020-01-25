package Pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MasterPage {

String emailBox= "name:email";
String passwordBox= "name:passwd";
String signInButton= "xpath://p[@class='submit']//span[1]";
String signOutButton= "xpath://a[@class='logout']";
String userNameDisplayed= "xpath://div[@class='nav']//div[@class='row']//div[1]";

String goToHomePage= "xpath://img[@class='logo img-responsive']";
	
	
	
public MyAccountPage(WebDriver driver) {
		super(driver);
			}

//User Interaction
public void signIn(String email, String password) {
	
	type(emailBox,email);
	type(passwordBox, password);
	click(signInButton);
	
}

public void signOut() {
	click(signOutButton);
}

public String userNameDisplayed() {
	
	return getText(userNameDisplayed);
	
}



//Page Interaction
public void goToHomePage() {
	
	click(goToHomePage);
	pause(750);
	
}













}

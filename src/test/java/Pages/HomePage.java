package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage {
	
String signInPageLink= "xpath://a[@class='login']";	
String tShirtPageLink= "xpath:(//a[@title='T-shirts'])[2]";
String dressPageLink= "xpath:(//a[@class='sf-with-ul'])[4]";
	
	
public HomePage (WebDriver driver) {
	super(driver);
}

public void goToSignInPage() {
	
	click(signInPageLink);
	
}

public void goToTshirtPage() {
	
	click(tShirtPageLink);
}

public void goToDressPage() {
	
	click(dressPageLink);
}








}

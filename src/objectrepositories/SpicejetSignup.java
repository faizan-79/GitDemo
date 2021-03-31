package objectrepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpicejetSignup {

	WebDriver driver;

	public SpicejetSignup(WebDriver driver) {
		this.driver = driver;
	}

	By fname = By.cssSelector("#CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName");
	By lname = By.cssSelector("#CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName");
	By pswd = By.cssSelector("#CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword");
	By submit = By.cssSelector("#CONTROLGROUPREGISTERVIEW_ButtonSubmit");

	public WebElement FirstName() {
		return driver.findElement(fname);
	}

	public WebElement LastName() {
		return driver.findElement(lname);
	}

	public WebElement Password() {
		return driver.findElement(pswd);
	}

	public WebElement Submit() {
		return driver.findElement(submit);
	}
}
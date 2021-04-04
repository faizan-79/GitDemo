package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositories.SpicejetMemberLoginPage;
import objectrepositories.SpicejetSignup;

public class LoginSpicejetApplication {

	@Test
	public void SpicejetLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Selchromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://book.spicejet.com/Login.aspx");
		SpicejetMemberLoginPage sj = new SpicejetMemberLoginPage(driver);
		sj.Username().sendKeys("hellllooooooo");
		sj.Password().sendKeys("hello123");
		// sj.Login().click();
		sj.Signup().click();
		SpicejetSignup rs = new SpicejetSignup(driver);
<<<<<<< HEAD

		rs.FirstName().sendKeys("JACK SPARROW");
		rs.LastName().sendKeys("DEAN JONES");
		rs.Password().sendKeys("ABC*12345689897");

=======
		rs.FirstName().sendKeys("JACK SPARROW");
		rs.LastName().sendKeys("DEAN JONES");
		rs.Password().sendKeys("ABC*12345689897");
>>>>>>> 1f8483cbf2f3f8e034503a00a899af5d9e586ace

		rs.FirstName().sendKeys("HARRY POTTER");
		rs.LastName().sendKeys("BOB");
		rs.FirstName().sendKeys("helloooo");
		rs.LastName().sendKeys("hiiii");
		rs.Password().sendKeys("123456");

		rs.FirstName().sendKeys("KATRINA KAIF");
		rs.LastName().sendKeys("AAMIR KHAN");
<<<<<<< HEAD
		rs.Password().sendKeys("ABC*12345689856dsfsdfSFFFFFFFFFFSSSSSSSSSS");
=======
		rs.Password().sendKeys("ABC*FFFFFFFSSSSSSSSSS");
>>>>>>> 1f8483cbf2f3f8e034503a00a899af5d9e586ace
		rs.Submit().click();
	}

}

package pageObjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.DashboardPage;
import pageObject.LoginPage;
import pageObject.SettingsPage;

public class TestPageObject {

	WebDriver driver;

	LoginPage login;
	DashboardPage dashboard;
	SettingsPage settings;

	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* Maximize the window */
		driver.manage().window().maximize();

		driver.get("https://wordpress.com/wp-login.php");
	}

	@Test
	public void updateSettings() {
		String userName = "ajinkyagosavi475@gmail.com";
		String password = "aju@Wordpress786";
		String title = "Page Object Title";
		String tagLine = "Page Object - Desc";

		login = new LoginPage(driver);

		dashboard = login.login(userName, password);
		settings = dashboard.clickOnSettings();
		settings.updateSettings(title, tagLine);
	}

	@Test
	public void forgotPassword() {
		String userName = "ajinkyagosavi475@gmail.com";

		login = new LoginPage(driver);

//		login.forgotPassword(userName);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

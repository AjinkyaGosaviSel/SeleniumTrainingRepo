package maven_grp.MavenProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	@Test
	public void testSeleniumGrid() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL(
				"http://10.44.204.212:4444/wd/hub"), dc); // IP of Hub

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* Maximize the window */
		driver.manage().window().maximize();

		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
				"aju@Wordpress786");
		driver.findElement(By.cssSelector("input#wp-submit")).click();

		driver.quit();
	}
}

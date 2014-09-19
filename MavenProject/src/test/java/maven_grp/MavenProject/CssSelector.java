package maven_grp.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; // Required for Chrome
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver; // Required for IE
import org.testng.annotations.Test;

public class CssSelector {
	@Test
	public void changeSettings() {
		// Firefox
		WebDriver driver = new FirefoxDriver();

		// Chrome
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:/JAVA Soft/trg/chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver();
		 */

		// Internet Explorer
		/*
		 * System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		 * WebDriver driver = new InternetExplorerDriver();
		 */

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* Maximize the window */
		driver.manage().window().maximize();

		/* CSS Locator */
		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
				"aju@Wordpress786");
		driver.findElement(By.cssSelector("input#wp-submit")).click();

		driver.findElement(
				By.cssSelector("li#menu-settings a.wp-has-submenu.wp-not-current-submenu.menu-top.menu-icon-settings.menu-top-last div.wp-menu-name"))
				.click();

		driver.findElement(By.cssSelector("input#blogname")).clear();
		driver.findElement(By.cssSelector("input#blogname")).sendKeys(
				"Ajinkya Gosavi");
		driver.findElement(By.cssSelector("input#blogdescription")).sendKeys(
				"Ajinkya Desc");
		driver.findElement(By.cssSelector("input#submit")).click();

		driver.close();
	}
}

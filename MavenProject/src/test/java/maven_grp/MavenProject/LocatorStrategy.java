package maven_grp.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorStrategy {
	@Test
	public void firstRun() {

		WebDriver driver = new FirefoxDriver();

		/* Locating Element by id */
		// Login Code
		/*
		 * driver.get("https://wordpress.com/wp-login.php");
		 * driver.findElement(By.id("user_login")).sendKeys(
		 * "ajinkyagosavi475@gmail.com");
		 * driver.findElement(By.id("user_pass")).sendKeys("aju@Wordpress786");
		 * driver.findElement(By.id("wp-submit")).click();
		 */

		driver.close();

		/* Locating Element by name */
		// Login Code
		/*
		 * driver.get("https://wordpress.com/wp-login.php");
		 * driver.findElement(By.name("log")).sendKeys(
		 * "ajinkyagosavi475@gmail.com");
		 * driver.findElement(By.name("pwd")).sendKeys("aju@Wordpress786");
		 * driver.findElement(By.name("wp-submit")).click();
		 * 
		 * driver.close();
		 */

		// Similarly for By.class
	}
}

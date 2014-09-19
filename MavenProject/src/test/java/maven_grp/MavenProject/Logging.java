package maven_grp.MavenProject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logging {
	private static Logger log = Logger.getLogger(Logging.class);

	@Test
	public void testLogging() {
		DOMConfigurator.configure("log4j.xml"); // Need to specify path of
												// log4j.xml. In this case, in
												// src folder, no we can
												// directly specify.

		WebDriver driver = new FirefoxDriver();
		log.info("WebDriver has been initialized successfully.");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* Maximize the window */
		driver.manage().window().maximize();

		// Login Code
		String url = "https://wordpress.com/wp-login.php";
		driver.get(url);

		log.info("URL is loaded successfully: " + url);
		log.debug("URL: " + url);

		/*
		 * driver.findElement(By.cssSelector("input#user_login")).sendKeys(
		 * "ajinkyagosavi475@gmail.com");
		 * driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
		 * "aju@Wordpress786");
		 * driver.findElement(By.cssSelector("input#wp-submit")).click();
		 */

	}
}

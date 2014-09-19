package maven_grp.MavenProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewWindowHandling {
	@Test
	public void handlingNewWindow() {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Login Code
		/*
		 * driver.get("https://wordpress.com/sites");
		 * driver.findElement(By.id("user_login")).sendKeys(
		 * "ajinkyagosavi475@gmail.com");
		 * driver.findElement(By.id("user_pass")).sendKeys("aju@Wordpress786");
		 * driver.findElement(By.id("wp-submit")).click();
		 * 
		 * driver.findElement(
		 * By.xpath("//a[@href='https://ajinkyagosavi.wordpress.com/wp-admin/']"
		 * )) .click(); Set<String> handles = driver.getWindowHandles();
		 * 
		 * for (String handle : handles) { System.out.println(handle); }
		 */

		driver.get("http://www.flipkart.com/");
		driver.findElement(By.cssSelector("a.facebook_icn.inner.rmargin5"))
				.click();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);

			System.out.println(handle + " : " + driver.getTitle());

			String windowTitle = driver.getTitle();
			if (windowTitle.equals("flipkart.com | Facebook")) {
				break;
			}
		}

		driver.findElement(By.id("email")).sendKeys("AjinkyaGosavi");

		driver.switchTo().defaultContent();

		/*
		 * // handle# is handle of new window(tab).
		 * driver.switchTo().window("handle#"); // TODO Do whatever you need to
		 * do. // Come back to original window
		 * driver.switchTo().defaultContent();
		 */

//		driver.quit();
	}
}

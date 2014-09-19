package maven_grp.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	@Test
	public void handleAlert() {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/* XPath Locator */
		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("aju@Wordpress786");
		driver.findElement(By.id("wp-submit")).click();

		driver.findElement(By.xpath("//*[text()='Posts']")).click();
		driver.findElement(By.className("add-new-h2")).click();
		driver.findElement(By.id("title")).sendKeys("Title - Alert");

		driver.switchTo().frame("content_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("Description - Alert");

		driver.switchTo().defaultContent();

		driver.close(); // This driver.close() is used to create alert pop-up.

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.switchTo().defaultContent();

		driver.findElement(By.id("publish")).click();

		driver.close();
	}
}

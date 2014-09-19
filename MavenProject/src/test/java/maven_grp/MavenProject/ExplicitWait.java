package maven_grp.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("aju@Wordpress786");
		driver.findElement(By.id("wp-submit")).click();

		driver.findElement(
				By.cssSelector("li#menu-settings a.wp-has-submenu.wp-not-current-submenu.menu-top.menu-icon-settings.menu-top-last div.wp-menu-name"))
				.click();

		driver.findElement(By.id("blogdescription")).clear();
		driver.findElement(By.id("blogdescription")).sendKeys(
				"Explicit Wait Desc");
		driver.findElement(By.id("submit")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By
						.xpath("//*[path()='Settings saved.']")));

		System.out.println("Message: " + element.getText());

		driver.quit();

	}

}

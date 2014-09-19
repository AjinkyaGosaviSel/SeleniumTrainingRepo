package maven_grp.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnumCharacters {
	@Test
	public void enterCharacters() {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys(
				"Aju" + Keys.NUMPAD2 + "" + Keys.NUMPAD2);

		// We should use ActionBuilder if we want to perform any action with key
		// combinations.
	}
}

package maven_grp.MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenshotCapturing {
	@Test
	public void captureScreenshot() throws IOException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Login Code
		driver.get("https://wordpress.com/wp-login.php");

		// These below 2 lines will take screen shot window. NOT entire screen.
		// It will take screenshot of current state.
		File screenShot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils
				.copyFile(screenShot, new File("./screenshot/loginScreen.jpg")); // JPG
		/*
		 * FileUtils .copyFile(screenShot, new
		 * File("./screenshot/loginScreen.png")); // PNG
		 */

		driver.findElement(By.id("user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("aju@Wordpress786");
		driver.findElement(By.id("wp-submit")).click();

		driver.quit();
	}
}

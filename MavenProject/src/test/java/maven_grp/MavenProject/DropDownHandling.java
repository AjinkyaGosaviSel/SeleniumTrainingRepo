package maven_grp.MavenProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling {
	@Test
	public void handleDropDown() {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
				"aju@Wordpress786");
		driver.findElement(By.cssSelector("input#wp-submit")).click();

		// Going to 'Settings' page
		driver.findElement(
				By.cssSelector("li#menu-settings a.wp-has-submenu.wp-not-current-submenu.menu-top.menu-icon-settings.menu-top-last div.wp-menu-name"))
				.click();

		// Creating object for Drop Down LIst
		WebElement dropDownId = driver.findElement(By.id("start_of_week"));

		Select dropDown = new Select(dropDownId);
		// dropDown.selectByValue("4");
		dropDown.selectByIndex(5);
		// dropDown.selectByVisibleText("Saturday");

		// Display all values from Drop-Down on Console
		List<WebElement> optionsInDropDown = dropDown.getOptions();
		for (WebElement days : optionsInDropDown) {
			System.out.println(days.getText());
		}

		driver.findElement(By.cssSelector("input#submit")).click();

		driver.close();
	}
}

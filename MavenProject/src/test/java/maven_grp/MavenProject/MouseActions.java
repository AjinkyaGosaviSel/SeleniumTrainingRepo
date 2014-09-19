package maven_grp.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	/*
	 * @Test public void actionMouseOver() { WebDriver driver = new
	 * FirefoxDriver();
	 * 
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * // Login Code driver.get("https://wordpress.com/wp-login.php");
	 * driver.findElement(By.cssSelector("input#user_login")).sendKeys(
	 * "ajinkyagosavi475@gmail.com");
	 * driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
	 * "aju@Wordpress786");
	 * driver.findElement(By.cssSelector("input#wp-submit")).click();
	 * 
	 * // Adding New Post WebElement mouseHoverElement = driver.findElement(By
	 * .xpath("//*[text()='Posts']"));
	 * 
	 * Actions action = new Actions(driver);
	 * action.moveToElement(mouseHoverElement).build().perform();
	 * 
	 * driver.findElement(By.xpath("//*[text()='Add New']")).click();
	 * 
	 * driver.findElement(By.cssSelector("input#title")).sendKeys(
	 * "Mouse Hover Title");
	 * 
	 * driver.findElement(By.cssSelector("input#publish")).click();
	 * 
	 * driver.close(); }
	 */

	/*
	 * @Test public void actionDragDrop() { WebDriver driver = new
	 * FirefoxDriver();
	 * 
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * 
	 * // Login Code driver.get("https://wordpress.com/wp-login.php");
	 * driver.findElement(By.cssSelector("input#user_login")).sendKeys(
	 * "ajinkyagosavi475@gmail.com");
	 * driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
	 * "aju@Wordpress786");
	 * driver.findElement(By.cssSelector("input#wp-submit")).click();
	 * 
	 * // Adding Widget to Sidebar WebElement mouseHoverElement =
	 * driver.findElement(By .xpath("//*[text()='Appearance']"));
	 * 
	 * Actions action = new Actions(driver);
	 * action.moveToElement(mouseHoverElement).build().perform();
	 * 
	 * driver.findElement(By.xpath("//*[text()='Widgets']")).click();
	 * 
	 * WebElement dragElement = driver .findElement(By
	 * .cssSelector("div#widget-3_archives-__i__ div.widget-top div.widget-title"
	 * )); System.out.println("Drag Element: " + dragElement.getText());
	 * 
	 * WebElement dropElement = driver.findElement(By.id("sidebar"));
	 * System.out.println("Drop Element: " + dropElement.getText());
	 * 
	 * action.dragAndDrop(dragElement, dropElement).build().perform();
	 * 
	 * driver.close(); }
	 */

	@Test
	public void actionBuilder() {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Login Code
		driver.get("https://wordpress.com/wp-login.php");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys(
				"ajinkyagosavi475@gmail.com");
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys(
				"aju@Wordpress786");
		driver.findElement(By.cssSelector("input#wp-submit")).click();

		// WebElement mouseHoverElement = driver.findElement(By
		// .xpath("//*[text()='Posts']"));

		WebElement mouseHoverElement = driver.findElement(By
				.xpath("//*[text()='Posts']"));
		// WebElement postTitleTxt = driver.findElement(By.id("title"));
		// System.out.println("1- " + postTitleTxt.getText());

		Actions action = new Actions(driver);
		action.moveToElement(mouseHoverElement)
				.click(driver.findElement(By.xpath("//*[text()='Add New']")))
				.sendKeys(driver.findElement(By.id("title")),
						"Action Builder Post");

		// System.out.println("2- " + postTitleTxt.getText());

		action.build().perform();
		driver.quit();
	}
}

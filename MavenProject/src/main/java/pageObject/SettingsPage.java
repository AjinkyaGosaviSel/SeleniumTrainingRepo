package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	WebDriver driver;

	WebElement titleTxt;
	WebElement tagLineTxt;
	WebElement saveChangeBtn;

	public SettingsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void updateSettings(String title, String tagLine) {
		titleTxt = driver.findElement(By.cssSelector("input#blogname"));
		tagLineTxt = driver
				.findElement(By.cssSelector("input#blogdescription"));
		saveChangeBtn = driver.findElement(By.cssSelector("input#submit"));

		titleTxt.clear();
		titleTxt.sendKeys(title);
		tagLineTxt.clear();
		tagLineTxt.sendKeys(tagLine);
		saveChangeBtn.click();
	}
}

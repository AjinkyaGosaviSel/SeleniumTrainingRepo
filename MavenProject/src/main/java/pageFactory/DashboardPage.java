package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;

	WebElement settingsLink;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public SettingsPage clickOnSettings() {

		settingsLink = driver
				.findElement(By
						.cssSelector("li#menu-settings a.wp-has-submenu.wp-not-current-submenu.menu-top.menu-icon-settings.menu-top-last div.wp-menu-name"));
		settingsLink.click();

		return PageFactory.initElements(driver, SettingsPage.class);

	}

}

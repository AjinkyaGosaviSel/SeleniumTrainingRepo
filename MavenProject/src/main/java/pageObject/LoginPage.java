package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	WebElement userNameTxt;
	WebElement passwordTxt;
	WebElement submitBtn;
	WebElement forgotPasswordLink;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public DashboardPage login(String userName, String password) {
		userNameTxt = driver.findElement(By.id("user_login"));
		passwordTxt = driver.findElement(By.id("user_pass"));
		submitBtn = driver.findElement(By.id("wp-submit"));

		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		submitBtn.click();

		return new DashboardPage(driver);
	}

	/*public void forgotPassword(String userName) {
		forgotPasswordLink = driver
				.findElement(By
						.xpath("//a[@href='https://wordpress.com/wp-login.php?action=lostpassword']"));

		forgotPasswordLink.click();

		userNameTxt = driver.findElement(By.id("user_login"));
		submitBtn = driver.findElement(By.id("wp-submit"));

		userNameTxt.sendKeys(userName);
		submitBtn.click();

		WebElement forgotPwdMsg = driver.findElement(By
				.cssSelector("div#login p.message"));
		String actualMsg = forgotPwdMsg.getText();
		String expectedMsg = "Check your e-mail for the confirmation link.";

		if (expectedMsg.equals(actualMsg)) {
			System.out.println("Forgot Password Successful.");
		} else {
			System.out.println("Forgot Password Failed.");
		}
	}*/
}

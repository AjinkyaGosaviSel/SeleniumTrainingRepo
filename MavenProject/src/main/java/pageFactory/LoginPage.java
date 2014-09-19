package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "user_login")
	@CacheLookup
	// Scope till package
	WebElement userNameTxt;

	@FindBy(id = "user_pass")
	WebElement passwordTxt;

	@FindBy(id = "wp-submit")
	WebElement submitBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public DashboardPage login(String userName, String password) {
		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		submitBtn.click();

		return PageFactory.initElements(driver, DashboardPage.class);
	}

	/*
	 * public void forgotPassword(String userName) { forgotPasswordLink = driver
	 * .findElement(By
	 * .xpath("//a[@href='https://wordpress.com/wp-login.php?action=lostpassword']"
	 * ));
	 * 
	 * forgotPasswordLink.click();
	 * 
	 * userNameTxt = driver.findElement(By.id("user_login")); submitBtn =
	 * driver.findElement(By.id("wp-submit"));
	 * 
	 * userNameTxt.sendKeys(userName); submitBtn.click();
	 * 
	 * WebElement forgotPwdMsg = driver.findElement(By
	 * .cssSelector("div#login p.message")); String actualMsg =
	 * forgotPwdMsg.getText(); String expectedMsg =
	 * "Check your e-mail for the confirmation link.";
	 * 
	 * if (expectedMsg.equals(actualMsg)) {
	 * System.out.println("Forgot Password Successful."); } else {
	 * System.out.println("Forgot Password Failed."); }
	 * 
	 * }
	 */

}

package maven_grp.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetPropertyFile {
	@Test
	public void getPropertyFile() throws FileNotFoundException, IOException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(
				"./src/test/ObjectRepository.properties")));

		// String elementLocator = getElementLocator("userLoginUserNameTxt");

		/*
		 * Properties File: URL=https://wordpress.com/wp-login.php
		 * userLoginUserNameTxt.css=input#user_login
		 * userLoginPwdTxt.css=input#user_pass
		 * userLoginSumbitBtn.css=input#wp-submit
		 * userLoginUserName=ajinkyagosavi475@gmail.com
		 * userLoginPwd=aju@Wordpress786
		 * 
		 * String url = prop.getProperty("URL"); driver.get(url);
		 * 
		 * String userLoginUserNameTxt = prop
		 * .getProperty("userLoginUserNameTxt.css"); String userLoginPwdTxt =
		 * prop.getProperty("userLoginPwdTxt.css"); String userLoginSumbitBtn =
		 * prop.getProperty("userLoginSumbitBtn.css"); String userLoginUserName
		 * = prop.getProperty("userLoginUserName"); String userLoginPwd =
		 * prop.getProperty("userLoginPwd");
		 * 
		 * driver.findElement(By.cssSelector(userLoginUserNameTxt)).sendKeys(
		 * userLoginUserName);
		 * driver.findElement(By.cssSelector(userLoginPwdTxt)).sendKeys(
		 * userLoginPwd);
		 * driver.findElement(By.cssSelector(userLoginSumbitBtn)).click();
		 */

		String url = prop.getProperty("URL");
		driver.get(url);

		By selectorObject = selector("userLoginUserNameTxt");
		driver.findElement(selectorObject).sendKeys("Ajinkya");

	}

	public String getElementLocator(String elementType) {
		System.out.println("Ele: " + elementType);
		int indexOfLocator = elementType.indexOf('.');
		String elementLocator = elementType.substring(0, indexOfLocator);
		System.out.println(elementLocator);
		return elementLocator;
	}

	public By selector(String property) throws FileNotFoundException,
			IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(
				"./src/test/ObjectRepository.properties")));

		String propertyValue = prop.getProperty(property);
		// String elementLocator = getElementLocator(propertyValue);

		int indexOfLocator = propertyValue.indexOf('.');
		String elementLocator = propertyValue.substring(0, indexOfLocator);
		String value = propertyValue.substring(indexOfLocator + 1);

		if (elementLocator.equals("css")) {
			return By.cssSelector(value);
		} else if (elementLocator.equals("id")) {
			return By.id(value);
		}

		return null;
	}

}

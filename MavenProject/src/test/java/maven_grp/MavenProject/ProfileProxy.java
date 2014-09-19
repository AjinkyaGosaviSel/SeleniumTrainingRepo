package maven_grp.MavenProject;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class ProfileProxy {
	@Test
	public void f() {
		FirefoxProfile d = new FirefoxProfile();
		FirefoxBinary bin = new FirefoxBinary(new File("path_of_firefox_exe"));

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("netwwork.http.phishy-userpass-length", 255);

		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://ajinkya_gosavi:password@www.wordpress.com/");
	}
}

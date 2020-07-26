package Testscripts;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.*;

public class Testclass {

	@Test
	public void test1() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		login_in_or_sign_up p1=new login_in_or_sign_up(driver);
		
		p1.setunname("prasad123@gmail.com");
		p1.setpwd("abcd1234");
		p1.click();

	}

}

package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_in_or_sign_up {

	
		@FindBy(id="email")
		private WebElement unname;
		
		@FindBy(name="pass")
		private WebElement pwd;
		
		@FindBy(xpath="//label[@id='loginbutton']")
		private WebElement login;
		
		public login_in_or_sign_up(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setunname(String s1)
		{
			unname.sendKeys(s1);
		}
		
		public void setpwd(String s1)
		{
			pwd.sendKeys(s1);
		}
		
		public void click()
		{
			login.click();
		}
	

}

package pages;

import java.util.Properties;

import org.openqa.selenium.By;

import base.Page;

public class LoginPage extends Page {
	
	public LandingPage doLogin(String username, String password, Properties or) {
		driver.findElement(By.xpath(or.getProperty("username_xpath"))).sendKeys(username);
		driver.findElement(By.xpath(or.getProperty("password_xpath"))).sendKeys(password);
		driver.findElement(By.xpath(or.getProperty("button_xpath"))).click();
		
		return  new LandingPage();
		
	} 
}

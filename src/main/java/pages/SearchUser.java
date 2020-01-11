package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.Page;

public class SearchUser extends Page {
	
	public void search() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Browse Event")).click();
	}

}

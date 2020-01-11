package pages;

import java.util.Properties;

import org.openqa.selenium.By;

import base.Page;

public class CreateEvent extends Page {

	
	public void createEventBtn(Properties or) {
		driver.findElement(By.linkText(or.getProperty("create_linkText"))).click();
	}
	
	public void enterEventName(String eventname, Properties or) {
		driver.findElement(By.xpath(or.getProperty("eventname_xpath"))).sendKeys(eventname);
	}
	
	public void selectCategory(Properties or) {
		driver.findElement(By.xpath(or.getProperty("category_xpath"))).click();
		driver.findElement(By.xpath("//*[@id=\"create_event_form_1\"]/md-input-container[2]/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath(or.getProperty("continue_xpath"))).click();
	}
	
	
}

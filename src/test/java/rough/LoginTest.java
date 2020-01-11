package rough;

import java.io.FileInputStream;
import java.util.Properties;

import base.Page;
import pages.CreateEvent;
import pages.LandingPage;
import pages.LoginPage;
import pages.SearchUser;

public class LoginTest {
	
	static Properties or = new Properties();
	
	static Properties config = new Properties();
	
	public static FileInputStream fis;

	public static void main(String[] args) {
		
		try {
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		or.load(fis);
		}catch(Throwable e) {
			System.out.print("IO Exception"+ e);
		}
		 
		 LoginPage loginPage = new LoginPage();
		 LandingPage landingPage = loginPage.doLogin("ekaushik", "epsa@codeblock", or);
		 SearchUser browsePage = landingPage.getBrowseEventPage();
		 browsePage.search();
		 
		 CreateEvent createEvent = landingPage.getCreateEventPage();
		 createEvent.createEventBtn(or);
		 createEvent.enterEventName("epsaeventdemo", or);
		 createEvent.selectCategory(or);
		 
		 Page.topNav.logout();
		 
		 
		/*
		 * SearchUser search = new SearchUser(); search.search();
		 */
		 
		/*
		 * CreateEvent create = new CreateEvent(); create.createEventBtn(or);
		 * create.enterEventName("epsaEventee", or); create.selectCategory(or);
		 */
	}

}

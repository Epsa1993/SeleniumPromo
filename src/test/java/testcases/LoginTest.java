package testcases;

import java.util.Properties;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void Login() {
		System.out.print("do login");
	}
	
	@Test
	public void doLogin(Properties or) {
		LoginPage loginPage = new LoginPage();
		loginPage.doLogin("ekaushik", "epsa@codeblock", or);
	}
}

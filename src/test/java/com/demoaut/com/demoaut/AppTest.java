package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoaut.com.testbase.Presetup;

/**
 * Unit test for simple App.
 */
public class AppTest extends Presetup {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	App app = new App();

	@DataProvider(name = "login")
	public String[][] getdata() throws IOException {
		String[][] array;
		array = app.returnLocator();
		return array;
	}

	@Test(dataProvider = "login", priority = 0)
	public void AppTest1(String username1, String password1) throws IOException {
		File file = new File("./src/test/resources/testdata/config.properties");
		Properties prop = property(file);
		File file1 = new File("./src/test/resources/locators/index.properties");
		Properties prop1 = property(file1);
		webdriver.manage().window().maximize();
		webdriver.get(prop.getProperty("url1"));
		WebElement userName = webdriver.findElement(By.xpath(prop1.getProperty("loc.txtfield.userName.xpath")));
		userName.sendKeys(username1);
		WebElement password = webdriver.findElement(By.xpath(prop1.getProperty("loc.txtfield.password.xpath")));
		password.sendKeys(password1);
		WebElement sign_in = webdriver.findElement(By.xpath(prop1.getProperty("loc.btn.sign_in.xpath")));
		sign_in.click();
//		webdriver = reser.reservation(webdriver);
//		webdriver = air.selectAirline(webdriver);
//		webdriver = pur.billing(webdriver);
//		webdriver.quit();
	}

	// http://newtours.demoaut.com

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		AssertJUnit.assertTrue(true);
	}
}

package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reservation extends AppTest {
	@Test(priority = 1)
	public void reservation() throws IOException {
		File file3 = new File("./src/test/resources/locators/reservation.properties");
		Properties prop3 = property(file3);
		WebElement radio = webdriver.findElement(By.xpath(prop3.getProperty("loc.btn.oneway.xpath")));
		radio.click();
		WebElement pass = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.passcount.xpath")));
		Select s = new Select(pass);
		s.selectByIndex(1);
		WebElement dport = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.Departing.xpath")));
		Select s1 = new Select(dport);
		s1.selectByIndex(2);
		WebElement dmonth = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.Onmonth.xpath")));
		Select s2 = new Select(dmonth);
		s2.selectByIndex(2);
		WebElement dday = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.Onday.xpath")));
		Select s3 = new Select(dday);
		s3.selectByIndex(2);
		WebElement Aport = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.Arriving.xpath")));
		Select s4 = new Select(Aport);
		s4.selectByIndex(2);
		WebElement Amonth = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.returnmonth.xpath")));
		Select s5 = new Select(Amonth);
		s5.selectByIndex(2);
		WebElement Aday = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.returnday.xpath")));
		Select s6 = new Select(Aday);
		s6.selectByIndex(2);
		WebElement businesclass = webdriver.findElement(By.xpath(prop3.getProperty("loc.radiobtn.business.xpath")));
		businesclass.click();
		WebElement preferences = webdriver.findElement(By.xpath(prop3.getProperty("loc.dropdown.airline.xpath")));
		Select s7 = new Select(preferences);
		s7.selectByIndex(2);
		WebElement continue1 = webdriver.findElement(By.xpath(prop3.getProperty("loc.imglink.continue.xpath")));
		continue1.click();
	}
}

package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Airline extends Reservation {
	@Test(priority = 2)
	public void selectAirline() throws IOException {
		File file4 = new File("./src/test/resources/locators/reservation2.properties");
		Properties prop4 = property(file4);
		WebElement depart = webdriver.findElement(By.xpath(prop4.getProperty("loc.radiobtn.dflight.xpath")));
		depart.click();
		WebElement returnf = webdriver.findElement(By.xpath(prop4.getProperty("loc.radiobtn.returnflight.xpath")));
		returnf.click();
		WebElement continue2 = webdriver.findElement(By.xpath(prop4.getProperty("loc.imglink.continue1.xpath")));
		continue2.click();
	}

}

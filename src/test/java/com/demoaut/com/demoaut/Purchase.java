package com.demoaut.com.demoaut;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Purchase extends Airline {
	@Test(priority = 3)
	public void billing() throws IOException {
		File file = new File("./src/test/resources/locators/purchase.properties");
		Properties prop = property(file);
		WebElement firstname = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.firstname.xpath")));
		firstname.sendKeys("ajith");
		WebElement lastname = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.lastname.xpath")));
		lastname.sendKeys("moorthy");
		WebElement meal = webdriver.findElement(By.xpath(prop.getProperty("loc.dropdown.meal.xpath")));
		Select se = new Select(meal);
		se.selectByIndex(2);
		WebElement firstname2 = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.firstname2.xpath")));
		firstname2.sendKeys("ajith");
		WebElement lastname2 = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.lastname2.xpath")));
		lastname2.sendKeys("moorthy");
		WebElement meal1 = webdriver.findElement(By.xpath(prop.getProperty("loc.dropdown.meal1.xpath")));
		Select se0 = new Select(meal1);
		se0.selectByIndex(2);
		WebElement cardtype = webdriver.findElement(By.xpath(prop.getProperty("loc.dropdown.cardtype.xpath")));
		Select se2 = new Select(cardtype);
		se2.selectByIndex(3);
		WebElement cardnum = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.cardnum.xpath")));
		cardnum.sendKeys("126546");
		WebElement expmonth = webdriver.findElement(By.xpath(prop.getProperty("loc.dropdown.expmonth.xpath")));
		Select se3 = new Select(expmonth);
		se3.selectByIndex(3);
		WebElement expyear = webdriver.findElement(By.xpath(prop.getProperty("loc.dropdown.expyear.xpath")));
		Select se4 = new Select(expyear);
		se4.selectByIndex(3);
		WebElement first = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.firstname1.xpath")));
		first.sendKeys("ajith");
		WebElement mid = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.midname.xpath")));
		mid.sendKeys("moorthy");
		WebElement last = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.lastname1.xpath")));
		last.sendKeys("periyasamy");
		WebElement billaddress = webdriver.findElement(By.xpath(prop.getProperty("loc.txtfield.billaddress2.xpath")));
		billaddress.sendKeys("chennai");
		WebElement country = webdriver.findElement(By.xpath(prop.getProperty("loc.dropdown.country.xpath")));
		Select se5 = new Select(country);
		se5.selectByIndex(3);
		WebElement deliverycheck = webdriver.findElement(By.xpath(prop.getProperty("loc.checkbox.delivery.xpath")));
		deliverycheck.click();
		WebElement purchase = webdriver.findElement(By.xpath(prop.getProperty("loc.imglink.purchase.xpath")));
		purchase.click();
		webdriver.close();
	}
}

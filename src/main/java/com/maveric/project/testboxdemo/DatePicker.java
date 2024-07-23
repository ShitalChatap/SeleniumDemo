package com.maveric.project.testboxdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maveric.project.Factory;

public class DatePicker 
{

	
	public static void main(String[] args)
	{
	WebDriver driver =Factory.getdriver();
	driver.get("https://www.makemytrip.com/");
	 
	String year = "2000" ;
    String month = "April"; 
	String date = "05";
	ExpectedCondition<WebElement> elementClickable = ExpectedConditions.elementToBeClickable(By.xpath("//p[@data-cy='departureDate']/span[1]")); 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element= wait.until(elementClickable);
	WebElement element2 = driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[1]")); 
	 element2.click();
	
	}
}

package com.maveric.project.testboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.Factory;

public class GoogleSearch
{
	public static void main (String[]args)
	{
		WebDriver driver =Factory.getdriver();
		
		driver.get("https://www.google.com/");
		WebElement ele =driver.findElement(By.name("q"));
		ele.sendKeys("agile");
		ele.click();
	     
	     
//		By byName=By.name("q");
//		WebElement element = driver.findElement(byName);
//		element.sendKeys("Agile");
////		WebElement submitBtn=driver.findElement(By.name("btnk"));
////        submitBtn.submit();
//       WebElement submitBtn=driver.findElement(By.name("btnk"));
//       submitBtn.click();
//		driver.close();
		
	 }

}

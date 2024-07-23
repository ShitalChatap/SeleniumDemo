package com.maveric.project.testboxdemo;

import org.openqa.selenium.WebDriver;

import com.maveric.project.Factory;

public class navigate 
{
	public static void main (String[]args)
	{
	WebDriver driver=Factory.getdriver();
	
	driver.get("https://www.flipkart.com/");
	driver.get("https://www.amazon.com/");
	driver.navigate().to("https://www.amazon.com/");
	driver.navigate().back();
	driver.navigate().forward();
	
	driver.navigate().refresh();

}
}

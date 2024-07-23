package com.maveric.project.testboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.Factory;

public class DoubleClick
{
	public static void main (String[]args)
	{
		WebDriver driver=Factory.getdriver();
		driver.get(" https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.switchTo().frame("iframeResult");
		Actions act =new Actions(driver);
		WebElement DoubleClick=driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		act.doubleClick(DoubleClick).perform();
		
	}

}

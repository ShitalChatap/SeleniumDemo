package com.maveric.project.testboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.Factory;

public class DragandDrop
{
	public static void main (String[]args)
	{
		WebDriver driver=Factory.getdriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act =new Actions(driver);
		
		WebElement DoubleClick=driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		act.doubleClick(DoubleClick).perform();
		
	}

}

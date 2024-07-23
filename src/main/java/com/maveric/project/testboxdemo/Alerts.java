package com.maveric.project.testboxdemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.Factory;
 
public class Alerts {
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=Factory.getdriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//Alert window with ok button
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("button[onclick=jsPrompt()']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		driver.close();
			
 
	}
 
}
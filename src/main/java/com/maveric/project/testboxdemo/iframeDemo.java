package com.maveric.project.testboxdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.Factory;

public class iframeDemo
{

public static void main(String[] args) throws Exception 
{
	WebDriver driver = Factory.getdriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	
	WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	driver.switchTo().frame(outerframe);
	
	WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	driver.switchTo().frame(innerframe);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WelCome");

}
}

package com.maveric.project.testboxdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.Factory;

public class TakeScreenShot 
{
	
		public static void main (String[]args) throws IOException
		{
	       WebDriver driver = Factory.getdriver();
	       driver.get("https://demo.nopcommerce.com/");
	       
//	       TakeScreenshot takeScreenshot=(TakeScreenshot)driver;
//	       File src = takeScreenshot.getScreenshotAs(OutputType.FILE);
//	       File trg =new File("");
//	       FileUtils.copyFile(src, trg);
	       
	       
	       WebElement section =driver.findElement(By.xpath(""));
	       File src=section.getScreenshotAs(OutputType.FILE);
	       File trg =new File(".\\screenshot");
	       FileUtils.copyFile(src, trg);     

}
}
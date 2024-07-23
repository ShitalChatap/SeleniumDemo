package com.maveric.project.testboxdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.Factory;

public class GitLogin
{
	public static void main (String[]args)
	{
		WebDriver driver =Factory.getdriver();
		

		
		driver.get("https://github.com/login");
		By byusername=By.name("login");
		By bypassword=By.name("password");
		
		
    	WebElement username = driver.findElement(byusername);
    	WebElement password = driver.findElement(bypassword);
    	
    	username.sendKeys("Admin");
		password.sendKeys("admin123");
		WebElement submitBtn=driver.findElement(By.name("commit"));
        submitBtn.submit();
        
		//driver.close();
//		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//      driver.findElement(By.name("username")).sendKeys("Admin");
//      driver.findElement(By.name("password")).sendKeys("admin123");
//      driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.close();
		
		
        
    	}

}
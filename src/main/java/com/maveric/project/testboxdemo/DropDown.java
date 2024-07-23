package com.maveric.project.testboxdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maveric.project.Factory;

public class DropDown 
{
	public static void main(String[]args)
	{
		WebDriver driver = Factory.getdriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement drp =driver.findElement(By.id("dropdown-class-example"));
		//Thread.sleep(100);

		Select selectdrp = new Select(drp);
		
//		selectdrp.selectByIndex(1);
//		selectdrp.selectByValue("option2");
//		selectdrp.selectByVisibleText("Option3");
//		
//		System.out.println(selectdrp.getOptions().size());
		List<WebElement>dropdown=selectdrp.getOptions();
		for(WebElement opt:dropdown)
		{
			System.out.println(opt.getText());
			
		}
		WebElement firstSelectedOption=selectdrp.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		//driver.close();
		
	}

}

package com.maveric.project.testboxdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.Factory;

public class ChecksBox {
	public static void main(String[] args) {
		WebDriver driver = Factory.getdriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// 1 specific checkbox
		WebElement singleCheckbox = driver.findElement(By.id("checkbox1"));
	
		System.out.println("is selectable "+singleCheckbox.isSelected());
		
		List<WebElement>totalcheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));;
		System.out.print("Total number of checkboxes="+totalcheckBox.size());
	}
}
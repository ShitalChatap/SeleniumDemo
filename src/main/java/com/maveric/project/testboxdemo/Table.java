package com.maveric.project.testboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.Factory;

public class Table 
{
	public static void main (String[]args)
	{
    WebDriver driver = Factory.getdriver();
    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html"); 
    int rows = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr")).size();
    System.out.println("Number of rows:=" + rows);
    
    
    int colms = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size(); 
    System.out.println("Number of columns:=" + colms);
    
    
    // retrieve specific row and colm values
    String value1 = driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[3]")).getText();
    System.out.println(value1);
    
    
    String value2 = driver.findElement(By.xpath("//table[@id='customers']//tr[3]/td[1]")).getText();
    System.out.println(value2);
    
    
    // Retrieve all the Data from table
    for (int r = 2; r <= rows; r++)
    {
    for (int c= 1; c <= colms; c++)
    {
    String data = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
    System.out.print(data+" ");
    System.out.println(); 

    }
}
	}
}
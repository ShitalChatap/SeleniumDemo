package com.maveric.project.testboxdemo;

import java.net.MalformedURLException;

import java.net.URL;

import java.time.Duration;

import java.util.HashMap;

import java.util.List;

 

import org.openqa.selenium.By;

import org.openqa.selenium.MutableCapabilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;


 

public class Practice_Date_Picker {

public static String username = "<username>";

public static String accesskey = "<access_key>";

public static final String URL = "https://" + username + ":" + accesskey + "@hub-cloud.browserstack.com/wd/hub";

WebDriver driver;

String url = "https://www.makemytrip.com/";

 

MutableCapabilities capabilities = new MutableCapabilities();

HashMap<String, Object> bstackOptions = new HashMap<String, Object>();

 



public void setUp() throws MalformedURLException {

        capabilities.setCapability("browserName", "Chrome");

     bstackOptions.put("os", "Windows");

        bstackOptions.put("osVersion", "11");

        bstackOptions.put("browserVersion", "latest");

        capabilities.setCapability("bstack:options", bstackOptions);

     driver = new RemoteWebDriver(new URL(URL), capabilities);

}

 



public void testDatePicker() throws InterruptedException {

     driver.get(url);

     driver.manage().window().maximize();

     Thread.sleep(5000);

     // Close the modal dialog box if it appears

     List<WebElement> closeModal = driver.findElements(By.cssSelector("span.commonModal__close"));

     if (closeModal.size() > 0) {

         closeModal.get(0).click();

     }

     try {

         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         WebElement dept = wait

                 .until(ExpectedConditions.elementToBeClickable(By.cssSelector("p[data-cy='departureDate']")));

         dept.click();

         Thread.sleep(2000);

         selectDate("June 2024", "8");

         Thread.sleep(3000);

         String selectedDate = driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[1]")).getText();

        // Assert.assertEquals(selectedDate, "8");

     } 
     catch (Exception e)
     {

         e.printStackTrace();

     }

}

 

public void selectDate(String month_year, String day) throws InterruptedException {

     // For selecting month and year

     List<WebElement> months = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));

     System.out.println("months count: " + months.size());

 

     for (int i = 0; i < months.size(); i++) {

         // Select date corresponding to the the month

         if (months.get(i).getText().equals(month_year)) {

             List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Caption']/div)[" + i

                     + "+1]/..//following-sibling::div[@class='DayPicker-Body']//div[@class='DayPicker-Day']//p"));

             System.out.println("days count: " + days.size());

             for (int j = 0; j < days.size(); j++) {

                 if (days.get(j).getText().equals(day)) {

                     days.get(j).click();

                     break;

                 }

             }

         }

     }

}

 



public void closeBrowser() {

     // driver.quit();

}

}
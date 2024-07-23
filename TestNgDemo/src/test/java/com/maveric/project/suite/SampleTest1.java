package com.maveric.project.suite;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SampleTest1 
{
	
	@BeforeTest
	public void sampleTest1BeforeTest()
	{
		System.out.println("--------->sampletest1BeforeTest()");
	}
	
	@BeforeClass
	public void sampleTest1BeforeClass() 
	{
		System.out.println("------------>sampletestBeforeClass()");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("--------->test1()");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("--------->test2()");
	}
	
	@BeforeMethod
	public void sampleTest1BeforeMethod() 
	{
		System.out.println("------------>sampletestBeforeMethod()");
	}
	
	@AfterMethod
	public void sampleTest1AfterMethod() 
	{
		System.out.println("------------>sampletest1AfterMethod()");
	}
	
	
	  @AfterTest
	  public void sampleTest1AfterTest()
	  {
		  System.out.println("sampletestaftertest()");
	  }
	  
	 
	  @AfterClass
	  public void sampleTest1AfterClassClass()
	  {
		  System.out.println("sampleTest1AfterClassClass ()");
	  }
	
}
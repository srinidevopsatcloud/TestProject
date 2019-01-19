package com.selenium.WebdriverProj.WebDriverwithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MercuryHomePageTitle 
{
	public WebDriver driver;
	String url="http://www.newtours.demoaut.com";
@BeforeClass
public void testsetup()
{
	driver=new ChromeDriver();
	
}
@Test
public void verifytitle()
{
	driver.navigate().to(url);
	driver.manage().window().maximize();
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	
	String getTitle=driver.getTitle();
	try
	{
	Assert.assertEquals(getTitle, "Mercury");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
	
}

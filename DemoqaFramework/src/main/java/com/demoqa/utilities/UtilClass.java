package com.demoqa.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	//get url 
	
	public String getWebPageUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	//alert popup get text
	public String getAlertText()
	{
		String alert_text = driver.switchTo().alert().getText();
		return alert_text;	
	}
	
	
	//*****************************************************************************************************************
	public void screenshot(WebDriver driver,String name) throws IOException  
	{				
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		LocalDateTime x= java.time.LocalDateTime.now();
		String sc = x+"";
		String time_stamp = sc.replace('.','-').replace(':','-');
		//long ct= System.currentTimeMillis();
		File des = new File("C:\\Users\\RANJIT\\eclipse-workspace\\DemoqaFramework\\Screenshots\\"+name+ time_stamp +".png");
		org.openqa.selenium.io.FileHandler.copy(src, des);			
	}	
	
	public void screenshot(WebDriver driver) throws IOException  
	{				
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		LocalDateTime x= java.time.LocalDateTime.now();
		String sc = x+"";
		String time_stamp = sc.replace('.','-').replace(':','-');
		//long ct= System.currentTimeMillis();
		File des = new File("C:\\Users\\RANJIT\\eclipse-workspace\\DemoqaFramework\\Screenshots\\"+ time_stamp +".png");
		org.openqa.selenium.io.FileHandler.copy(src, des);	
	}
	//**********************************************************************************************************************


}

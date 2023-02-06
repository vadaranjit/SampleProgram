package com.demoqa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.testBase.TestBase;

public class homePage extends TestBase {

	public homePage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[1]")
	private WebElement elements_button;
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[2]")
	private WebElement forms_button;
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[3]")
	private WebElement alertsFrameWindow_button;
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[4]")
	private WebElement widgets_button;
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[5]")
	private WebElement interactions_button;
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[6]")
	private WebElement bookStoreApplication_button;
	
	//---------------------------------------------------------------------
	public void clickOnElementsButton() 
	{
		elements_button.click();
	}
	
	public void clickOnFormsButton() 
	{
		forms_button.click();
	}
	
	public void clickOnAlertsFrameWindowButton() 
	{
		alertsFrameWindow_button.click();
	}
	
	public void clickOnWidgetsButton() 
	{
		widgets_button.click();
	}
	
	public void clickOnInteractionsButton() 
	{
		interactions_button.click();
	}
	
	public void clickOnBookStoreApplicationButton() 
	{
		bookStoreApplication_button.click();
	}
}

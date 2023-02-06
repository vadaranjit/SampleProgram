package com.demoqa.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.testBase.TestBase;

public class TextBox extends TestBase {
	public TextBox() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[@id='item-0']")
	private WebElement textBox_button;
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement full_name_textBox;
	
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement email_textBox;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement current_address_textBox;
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	private WebElement permanent_address_textBox;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit_button;
	
	//----------------------------------------------------------------
	public void ClickOnTextBoxButton() 
	{
		textBox_button.click();
	}
	
	public void EnterFullName(String name) 
	{
		full_name_textBox.sendKeys(name);
	}
	
	public void EnterEmailName(String email) 
	{
		email_textBox.sendKeys(email);
	}
	
	public void EnterCurrentAddressName(String currentAddr) 
	{
		current_address_textBox.sendKeys(currentAddr);
	}
	
	public void EnterPermanetAddressName(String permanentAddr) 
	{
		permanent_address_textBox.sendKeys(permanentAddr);
	}
	
	public void ClickOnSubmitButton() 
	{
		//submit_button.click();	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//use this method for scrolling page
		js.executeScript("arguments[0].scrollIntoView(true)",submit_button);
		submit_button.click();
	}
	
	
	
	
	
	
	
	
	
	
}

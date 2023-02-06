package com.demoqa.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.testBase.TestBase;

public class CheckBox extends TestBase {
	
	public CheckBox() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=("(//li[@class='btn btn-light '])[2]"))
	private WebElement check_box_button;
	
	@FindBy(xpath=("//button[@class='rct-collapse rct-collapse-btn'][1]"))
	private WebElement home_toggle_button;
	
	//-----------sub types of home toggle buttons
	
	@FindBy(xpath=("(//button[@class='rct-collapse rct-collapse-btn'])[2]"))
	private WebElement desktop_toggle_button;
	
	@FindBy(xpath=("(//button[@class='rct-collapse rct-collapse-btn'])[3]"))
	private WebElement document_toggle_button;
	
	@FindBy(xpath=("(//button[@class='rct-collapse rct-collapse-btn'])[6]"))
	private WebElement download_toggle_button;
	
	//----------------sub types of desktop toggle button
	
	@FindBy(xpath=("(//span[@class=\"rct-checkbox\"])[3]"))
	private WebElement notes_toggle_button;
	
	@FindBy(xpath=("(//span[@class=\"rct-checkbox\"])[4]"))
	private WebElement commands_toggle_button;
	
	//----------------sub types of document toggle button
	
	@FindBy(xpath=("(//span[@class=\"rct-checkbox\"])[6]"))
	private WebElement workspace_toggle_button;
	
	@FindBy(xpath=("(//span[@class=\"rct-checkbox\"])[7]"))
	private WebElement office_toggle_button;
	
	//----------------sub types of download toggle button
	
	@FindBy(xpath=("(//span[@class=\"rct-checkbox\"])[9]"))
	private WebElement wordfile_toggle_button;
	
	@FindBy(xpath=("(//span[@class=\"rct-checkbox\"])[10]"))
	private WebElement excelfile_toggle_button;
	
	//--------------------------------------------------------------------
	
	public void clickOnCheckBoxButton() 
	{
		check_box_button.click();
	}
	
	public void clickOnHomeToggleButton() 
	{
		home_toggle_button.click();
	}
	
	//-----------sub types of home toggle buttons-----------------------------
	
	public void clickOnDesktpToggleButton() 
	{
		desktop_toggle_button.click();
	}
	
	public void clickOnDocumentToggleButton() 
	{
		document_toggle_button.click();
	}
	
	public void clickOnDownloadToggleButton() 
	{
		download_toggle_button.click();
	}
	
	//----------------sub types of desktop toggle button----------------------------
	
	public void clickOnNotesToggleButton() 
	{
		notes_toggle_button.click();
	}
	
	public void clickOnCommandsToggleButton() 
	{
		commands_toggle_button.click();
	}
	
	//----------------sub types of document toggle button--------------------------------
	
	public void clickOnWorkspaceToggleButton() 
	{
		workspace_toggle_button.click();
	}
	
	public void clickOnOfficeToggleButton() 
	{
		office_toggle_button.click();
	}
	
	//----------------sub types of download toggle button--------------------------------
	
	public void clickOnWordfileToggleButton() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//use this method for scrolling page
		js.executeScript("arguments[0].scrollIntoView(true)",wordfile_toggle_button);
		wordfile_toggle_button.click();
	}
	
	public void clickOnExcelFileToggleButton() 
	{
		excelfile_toggle_button.click();
	}
	
}

package com.demoqa.TestLayer;

import org.testng.annotations.Test;

import com.demoqa.PageLayer.CheckBox;
import com.demoqa.PageLayer.TextBox;
import com.demoqa.PageLayer.homePage;
import com.demoqa.testBase.TestBase;

public class ElementsTest extends TestBase {

	@Test
	public void TextBoxTestLayer() throws InterruptedException 
{
	//String Expected_ouput = "https://demoqa.com/elements";
	
	homePage homepage_obj = new homePage();
	TextBox textbox_obj = new TextBox();
	
	homepage_obj.clickOnElementsButton();
	Thread.sleep(1000);
	textbox_obj.ClickOnTextBoxButton();
	Thread.sleep(1000);
	textbox_obj.EnterFullName("Ranjit vadar");
	textbox_obj.EnterEmailName("varanjit@gmail.com");
	textbox_obj.EnterCurrentAddressName("Ring road kagal,kolhapur. pincode 416216");
	textbox_obj.EnterPermanetAddressName("Ring road kagal,kolhapur. pincode 416216");
	textbox_obj.ClickOnSubmitButton();
	//expected result this xpath //div[@id='output']	
}
	@Test
	public void CheckBoxTestLayer() throws InterruptedException
	{
		homePage homepage_obj = new homePage();
		CheckBox checkbox_obj = new CheckBox();
		
		homepage_obj.clickOnElementsButton();
		Thread.sleep(1000);
		checkbox_obj.clickOnCheckBoxButton();
		
		checkbox_obj.clickOnHomeToggleButton();
		
		checkbox_obj.clickOnDesktpToggleButton();
		checkbox_obj.clickOnNotesToggleButton();
		checkbox_obj.clickOnCommandsToggleButton();
			
		checkbox_obj.clickOnDocumentToggleButton();
		checkbox_obj.clickOnWorkspaceToggleButton();
		checkbox_obj.clickOnOfficeToggleButton();
			
		checkbox_obj.clickOnDownloadToggleButton();
		checkbox_obj.clickOnWordfileToggleButton();
		checkbox_obj.clickOnExcelFileToggleButton();		
	}
	
	@Test
	public void RedioButtonTestLayer() 
	{
		
	}
}

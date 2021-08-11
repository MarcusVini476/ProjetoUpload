package br.com.MarcusVinicius.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
	public UploadPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		
	}
	@FindBy(xpath = "//input[@id='upload']")
	private WebElement LinkFile;
	
	public WebElement getLinkFile() {
		return LinkFile;
	}
	

}

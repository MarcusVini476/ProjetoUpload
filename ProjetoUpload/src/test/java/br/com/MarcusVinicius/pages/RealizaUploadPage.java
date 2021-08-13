package br.com.MarcusVinicius.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealizaUploadPage {
	
	public RealizaUploadPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		
	}
	
	public WebElement getCampoRealizaUpload() {
		return campoRealizaUpload;
	}

	@FindBy(xpath = "//input[@id='upload']")
	private WebElement campoRealizaUpload;
	
	

}

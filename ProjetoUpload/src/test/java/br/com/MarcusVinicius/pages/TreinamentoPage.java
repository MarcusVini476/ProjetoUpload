package br.com.MarcusVinicius.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreinamentoPage {
	public TreinamentoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(xpath = "//a[text()='Outros']")
	private WebElement LinkUpload;
		
	public WebElement getLinkUpload(){
		return LinkUpload;
	}
	@FindBy(xpath = "//a[text()= 'Upload de Arquivo']")
	private WebElement LinkUploadDeArquivo;
		
	public WebElement getLinkUploadDeArquivo(){
		return LinkUploadDeArquivo;
	}
	

}

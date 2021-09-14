package br.com.MarcusVinicius.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InicialPage {
	public InicialPage(WebDriver navegador) {
		
		PageFactory.initElements(navegador, this);
	}
	
	@FindBy(xpath = "//a[text()='Começar Automação Web']")
	private WebElement btnIniciarAutomacao;
	
	public WebElement getBtnIniciarAutomacao() {
		return btnIniciarAutomacao;
	}
	

}

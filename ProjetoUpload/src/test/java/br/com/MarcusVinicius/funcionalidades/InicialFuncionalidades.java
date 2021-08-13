package br.com.MarcusVinicius.funcionalidades;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.MarcusVinicius.configuracoes.BaseTest;
import br.com.MarcusVinicius.pages.InicialPage;

public class InicialFuncionalidades extends BaseTest{
	private InicialPage inicialPage;
	
	public InicialFuncionalidades() {
		this.inicialPage = new InicialPage(navegador);
	}
	
	public void clicaNoBotaoComecarAutomacao() {
		WebElement botao = this.inicialPage.getBtnIniciarAutomacao();
		espera.until(ExpectedConditions.visibilityOf(botao));
		botao.click();
	}

}

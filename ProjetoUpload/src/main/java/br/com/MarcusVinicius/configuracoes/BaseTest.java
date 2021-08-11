package br.com.MarcusVinicius.configuracoes;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.MarcusVinicius.interfaces.WebApplication;

public abstract class BaseTest {
	
	protected static WebDriver navegador;
	protected static WebDriverWait espera;
	
	protected void inicializarAplicacaoWeb(WebApplication webApplication, String url) {
		if (navegador != null) {
			navegador.quit();
		}
		navegador = webApplication.getWebDriver();
		navegador.manage().window().maximize();
		navegador.get(url);
		
		espera = new WebDriverWait(navegador, 60);
	}
	
	protected static void fecharWeb() {
		
		navegador.close();
	}

}

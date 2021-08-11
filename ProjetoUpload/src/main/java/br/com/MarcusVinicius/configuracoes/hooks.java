package br.com.MarcusVinicius.configuracoes;

import br.com.MarcusVinicius.enums.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseTest {
	
	@Before
	public void setUp() {
		System.out.println("iniciando automacao");
		inicializarAplicacaoWeb(Web.CHROME, "https://automacaocombatista.herokuapp.com/");
	}
	
	@After
	public void tearDown() {
		System.out.println("terminando automacao");
		
		fecharWeb();
	}

}

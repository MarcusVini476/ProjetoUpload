package br.com.MarcusVinicius.steps;

import br.com.MarcusVinicius.funcionalidades.InicialFuncionalidades;
import cucumber.api.java.pt.Dado;

public class InicialSteps {
	private InicialFuncionalidades inicialFuncionalidade;

	public InicialSteps() {
		this.inicialFuncionalidade = new InicialFuncionalidades();

	}

	@Dado("^que acesso Automacao com Batista$")
	public void queAcessoAutomacaoComBatista() throws Throwable {
		this.inicialFuncionalidade.clicaNoBotaoComecarAutomacao();
	}

}

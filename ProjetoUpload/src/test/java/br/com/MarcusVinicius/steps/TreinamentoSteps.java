package br.com.MarcusVinicius.steps;

import br.com.MarcusVinicius.funcionalidades.TreinamentoFuncionalidades;
import cucumber.api.java.pt.Dado;

public class TreinamentoSteps {
	private TreinamentoFuncionalidades treinamentoFuncionalidade;
	
	public TreinamentoSteps() {
		this.treinamentoFuncionalidade = new TreinamentoFuncionalidades();
		
	}
	@Dado("^navego ate \"([^\"]*)\" e clico em \"([^\"]*)\"$")
	public void navegoAteEClicoEm(String arg1, String arg2) throws Throwable {
	   this.treinamentoFuncionalidade.clicaNoLinkOutros();
	   this.treinamentoFuncionalidade.clicaNoLinkUploadDeArquivos();
	}
}

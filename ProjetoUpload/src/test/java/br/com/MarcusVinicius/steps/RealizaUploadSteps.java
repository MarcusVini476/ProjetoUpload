package br.com.MarcusVinicius.steps;

import br.com.MarcusVinicius.funcionalidades.RealizaUploadFuncionalidades;

import cucumber.api.java.pt.Entao;

public class RealizaUploadSteps {
	private RealizaUploadFuncionalidades realizaUploadFuncionalidades;

	public RealizaUploadSteps() {
		this.realizaUploadFuncionalidades = new RealizaUploadFuncionalidades();

	}

	@Entao("^devo fazer o Upload do arquivo \"([^\"]*)\" que esta na pasta \"([^\"]*)\"$")
	public void devoFazerOUploadDoArquivoQueEstaNaPasta(String arg1, String arg2) throws Throwable {
		this.realizaUploadFuncionalidades.preencherCampoDePesquisa();
	}

}

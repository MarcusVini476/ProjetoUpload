package br.com.MarcusVinicius.steps;

import br.com.MarcusVinicius.funcionalidades.UploadFuncionalidades;

import cucumber.api.java.pt.Dado;

public class UploadSteps {
	private UploadFuncionalidades uploadFuncionalidades;
	
	public UploadSteps() {
		this.uploadFuncionalidades = new UploadFuncionalidades();
	}
	
	@Dado("^clico em \"([^\"]*)\"$")
	public void clicoEm(String arg1) throws Throwable {
	
	    this.uploadFuncionalidades.clicaEmFile();
	}

}

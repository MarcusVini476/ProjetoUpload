package br.com.MarcusVinicius.funcionalidades;

import br.com.MarcusVinicius.configuracoes.BaseTest;
import br.com.MarcusVinicius.pages.UploadPage;


public class UploadFuncionalidades extends BaseTest {
	private UploadPage uploadPage;
	
	
	public UploadFuncionalidades() {
		this.uploadPage = new UploadPage(navegador);
		
	}
	
	public void clicaEmFile() {
		this.uploadPage.getLinkFile();
	}

}

package br.com.MarcusVinicius.funcionalidades;


import java.io.File;

import br.com.MarcusVinicius.configuracoes.BaseTest;
import br.com.MarcusVinicius.pages.RealizaUploadPage;

public class RealizaUploadFuncionalidades extends BaseTest{
	private RealizaUploadPage realizaUploadPage;
	
	
	public RealizaUploadFuncionalidades() {
		this.realizaUploadPage = new RealizaUploadPage(navegador);
		
	}
	
	public void preencherCampoDePesquisa() {
		File arquivo = new File("ParaUpload/LEIAME.txt");
		this.realizaUploadPage.getCampoRealizaUpload().sendKeys(arquivo.getAbsolutePath());
	}

}


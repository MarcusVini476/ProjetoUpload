package br.com.MarcusVinicius.funcionalidades;

import br.com.MarcusVinicius.configuracoes.BaseTest;
import br.com.MarcusVinicius.pages.RealizaUploadPage;

public class RealizaUploadFuncionalidades extends BaseTest{
	private RealizaUploadPage realizaUploadPage;
	
	
	public RealizaUploadFuncionalidades() {
		this.realizaUploadPage = new RealizaUploadPage(navegador);
		
	}
	
	public void preencherCampoDePesquisa() {
		this.realizaUploadPage.getCampoRealizaUpload().sendKeys
		("C:\\Users\\Marcus Silva\\eclipse-workspace\\ProjetoUpload\\ParaUpload\\LEIAME.txt");
	}

}

package br.com.MarcusVinicius.funcionalidades;



import br.com.MarcusVinicius.configuracoes.BaseTest;
import br.com.MarcusVinicius.pages.TreinamentoPage;
import br.com.MarcusVinicius.robot.RobotSelenium;

public class TreinamentoFuncionalidades extends BaseTest {
	private TreinamentoPage treinamentoPage;
	private RobotSelenium robotSelenium;
	
	public TreinamentoFuncionalidades() {
		this.treinamentoPage = new TreinamentoPage(navegador);
		this.robotSelenium = new RobotSelenium();
			
	}
	public void clicaNoLinkOutros() {
		this.robotSelenium.AguardeFicarVisivel(this.treinamentoPage.getLinkUpload());
	}
	
	public void clicaNoLinkUploadDeArquivos() {
		this.robotSelenium.AguardeFicarVisivel(this.treinamentoPage.getLinkUploadDeArquivo());
		
	}

}

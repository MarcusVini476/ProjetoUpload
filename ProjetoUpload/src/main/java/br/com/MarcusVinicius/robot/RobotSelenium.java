package br.com.MarcusVinicius.robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.MarcusVinicius.configuracoes.BaseTest;

public class RobotSelenium extends BaseTest{
	public void AguardeFicarVisivel(WebElement element) {
		espera.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

}

package br.com.MarcusVinicius.enums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import br.com.MarcusVinicius.interfaces.WebApplication;

public enum Web implements WebApplication {
	CHROME {
		public WebDriver getWebDriver() {
			System.setProperty("webdriver.chrome.driver", 
					"src/main/resources/drivers/chromedriver.exe");
			ChromeOptions opcoes = new ChromeOptions();
			opcoes.addArguments("--disable-notifications");
	
			return new ChromeDriver(opcoes);
		}
	}

}

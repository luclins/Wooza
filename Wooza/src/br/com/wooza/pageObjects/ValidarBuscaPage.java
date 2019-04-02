package br.com.wooza.pageObjects;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.wooza.util.WebDriverUtil;

public class ValidarBuscaPage {
	private static WebDriver driver;
	static WebDriverUtil util = new WebDriverUtil();

	public static final String urlCelularDireto = "https://www.celulardireto.com.br/";

	public void setParametroBusca() throws InterruptedException {
		util.escrever(By.id("s"), "O que podemos esperar do iPhone XI e XI Max?");

	}

	public void efetivarBusca() {
		util.clicarBotaoBySelector("#searchsubmit > img");
	}

}

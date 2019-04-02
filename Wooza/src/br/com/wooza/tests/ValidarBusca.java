package br.com.wooza.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import br.com.wooza.pageObjects.SelecionarPlanoPage;
import br.com.wooza.pageObjects.ValidarBuscaPage;
import br.com.wooza.util.WebDriverUtil;

public class ValidarBusca {
	private static WebDriver driver;
	ValidarBuscaPage page = new ValidarBuscaPage();
	WebDriverUtil util = new WebDriverUtil();

	@BeforeEach
	public void setUp() throws Exception {
		driver = WebDriverUtil.chromeDriverConfig();
	}

	@AfterEach
	public void tearDown() throws Exception {
		// driver.quit();
	}

	@Test
	public void buscar() throws InterruptedException {
		util.acessarEndereco(SelecionarPlanoPage.urlCelularDireto);

		page.setParametroBusca();
		page.efetivarBusca();

	}

}

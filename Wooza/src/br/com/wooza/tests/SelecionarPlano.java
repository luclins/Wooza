package br.com.wooza.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import br.com.wooza.pageObjects.SelecionarPlanoPage;
import br.com.wooza.util.WebDriverUtil;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SelecionarPlano {
	private static WebDriver driver;
	SelecionarPlanoPage page = new SelecionarPlanoPage();
	WebDriverUtil util = new WebDriverUtil();

	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		driver = WebDriverUtil.chromeDriverConfig();
	}

	@AfterEach
	public void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	// @Test
	public void test() {
		util.acessarEndereco(SelecionarPlanoPage.urlCelularDireto);
	}

	@Test
	public void selecionarPlano() throws InterruptedException {
		// util.acessarEndereco(SelecionarPlanoPage.urlCelularDireto);
		util.acessarEndereco(SelecionarPlanoPage.urlPlanosClaro);

		// Selecionar Plano
		page.setFiltroPacote();
		page.setBotaoContratar();

		// Cadastrar Cliente
		page.setEmail();
		page.setCelular();
		page.setCPF();
		page.setBotaoContinuar();

		page.setCEP();
		page.setNumero();
		page.setContratar();

	}

}

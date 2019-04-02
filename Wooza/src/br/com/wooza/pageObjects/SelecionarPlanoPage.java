package br.com.wooza.pageObjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.wooza.util.WebDriverUtil;

public class SelecionarPlanoPage {
	private static WebDriver driver;
	static WebDriverUtil util = new WebDriverUtil();

	public static final String urlCelularDireto = "https://www.celulardireto.com.br/";
	public static final String urlPlanosClaro = "https://www.celulardireto.com.br/planos-celular/claro";

	public void setFiltroPacote() {
		util.clicarBotaoBySelector("#field-group-dataValuenull_4\\2e 0 > span");
	}

	public void validarFiltro() {
		//
		WebElement element = driver.findElement(By.xpath(
				"/html/body/div[1]/div/ui-view/inner/main/aside/sidebar/div/plan-card/div/div[3]/div[2]/div/div/h2"));
		String plano = element.getText();
		System.out.println("plano: " + plano);
		assertEquals("3GB", plano);
		System.out.println("Plano selecionado: " + plano);

	}

	public void setBotaoContratar() {
		util.clicarBotaoBySelector(
				"body > div:nth-child(9) > wza-vrj-mobile-plan-comparison > main > div > section > mpc-card-plan > div:nth-child(6) > button");

	}

	public void setEmail() throws InterruptedException {
		util.esperaImplicita(5000);

		util.acessarEndereco(
				"https://modalreduzido.claro.celulardireto.com.br/?plano=3GB&plataforma=&oferta=&uf=RJ&ddd=21&d2=&d3=&d4=&d5=&mudanca=&cliente=&ambiente=&trk_origin=5e069df6f8a14771bc4655026e95687d&trk_seller=mol.celulardireto&trk__ga=2.234256094.1198687868.1554243846-148028358.1554243846&_ga=2.234256094.1198687868.1554243846-148028358.1554243846&uid=&tid=&aid=&sku=CC00033NA&varejo=true");

		util.escrever(By.id("email"), "teste@wooza.com.br");
	}

	public void setCelular() throws InterruptedException {
		util.escrever(By.id("lineService"), "21999999999");
	}

	public void setCPF() throws InterruptedException {
		util.escrever(By.id("cpf"), "03326103735");
	}

	public void setBotaoContinuar() {
		util.clicarBotao("btnLead");
	}

	public void setCEP() throws InterruptedException {
		util.esperaImplicita(10000);
		util.escrever(By.cssSelector("#cep"), "20270020");
	}

	public void setNumero() throws InterruptedException {
		util.escrever(By.cssSelector("#number"), "15");
	}

	public void setContratar() {
		// util.clicarBotaoBySelector("#btnAddress");
		System.out.println("Prossegue fluxo de contratação...");
	}

	public void setParametroBusca() throws InterruptedException {
		util.escrever(By.id("s"), "O que podemos esperar do iPhone XI e XI Max?");
	}

}

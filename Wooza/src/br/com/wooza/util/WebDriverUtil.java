package br.com.wooza.util;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {

	private static WebDriver driver;

	public final static String urlMinhasAplicacoes = ".";

	// public static String versaoTeste = null;

	public static WebDriver chromeDriverConfig() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().setPosition(new Point(1500, 200));
		driver.manage().window().maximize();
		return driver;

	}

	public void escrever(By by, String texto) throws InterruptedException {
		driver.findElement(by).sendKeys(texto);
	}

	public void clicarRadio(String id) {
		driver.findElement(By.id(id)).click();
	}

	public void acessarEndereco(String url) {
		driver.get(url);
		// driver.manage().window().maximize();
		esperaImplicita(5);
	}

	public static void selecionarCombo(String id, String valor) throws InterruptedException {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByValue(valor);
	}

	public String obterValorCombo(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}

	public void clicarBotaoXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void clicarBotaoBySelector(String css) {
		driver.findElement(By.cssSelector(css)).click();
	}

	public String obterValueElemento(String id) {
		return driver.findElement(By.id(id)).getAttribute("value");
	}

	/********* Link ************/

	public void clicarLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	/********* Textos ************/

	public static String obterTexto(By by) {
		return driver.findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

	public static void esperaImplicita(int tempo) {
		driver.manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	public void esperaExplicita(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

}

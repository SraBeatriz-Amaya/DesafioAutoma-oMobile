package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriarListaPage;

public class CriarListaSteps {
	
	CriarListaPage telaCriar = new CriarListaPage(driver);
	
	@Quando("eu acionar o botao logar")
	public void euAcionarOBotaoLogar() throws InterruptedException {
		telaCriar.acionarBotaoLogar();
	}

	@Quando("eu acionar o new list")
	public void euAcionarONewList() throws InterruptedException {
		telaCriar.acionarBotaoNewList();
	}

	@Quando("eu informar no campo title {string}")
	public void euInformarNoCampoTitle(String title) throws InterruptedException {
		telaCriar.informarCampoTitle(title);
	}

	@Quando("eu acionar o botao CreateList")
	public void euAcionarOBotaoCreateList() throws InterruptedException {
		telaCriar.acionarBotaoCriarLista();
	}
	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() throws InterruptedException {
		telaCriar.acionarBotaoVoltar();
	}
	@Entao("o sistema apresenta a lista criada")
	public void oSistemaApresentaAListaCriada() {
		assertEquals("Lista1", driver.findElement(By.xpath("//android.widget.TextView[@text='Lista1']")).getText());
	}

}

package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AdicionarItemListaPage;


public class AdicionarItemListaSteps {
	
AdicionarItemListaPage adicionarItemLista = new AdicionarItemListaPage(driver);
	

	@Quando("eu acionar a ListaEditada")
	public void euAcionarAListaEditada() throws Exception {
		adicionarItemLista.acionarLista();
	}

	@Quando("eu acionar o botao de mais")
	public void euAcionarOBotaoDeMais() {
		adicionarItemLista.acionarBotaoAdd();
	}

	@Quando("eu informar o nome do item {string}")
	public void euInformarONomeDoItem(String nome) throws Exception {
		adicionarItemLista.informarTask(nome);
	}

	@Quando("eu acionar o botao adicionar item")
	public void euAcionarOBotaoAdicionarItem() {
		adicionarItemLista.acionarBotaoCriarTask();
	}
	
	@Quando("eu acionar o botao retornar")
	public void euAcionarOBotaoRetornar() {
	    adicionarItemLista.acionarBotaoVoltar();
	}
	
	@Entao("o aplicativo apresenta lista com numero de itens")
	public void oAplicativoApresentaListaComNumeroDeItens() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertEquals("1", driver.findElement(By.xpath("//android.widget.TextView[@text='1']")).getText());
	    
	}

}

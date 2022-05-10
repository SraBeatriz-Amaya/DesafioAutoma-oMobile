package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExcluirItemListaPage;

public class ExcluirItemListaSteps {
	
	ExcluirItemListaPage excluirItem = new ExcluirItemListaPage(driver);
	
	@Quando("eu acessar a ListaEditada")
	public void euAcessarAListaEditada() throws Exception {
	    excluirItem.acionarLista();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Quando("eu acessar o item")
	public void euAcessarOItem() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    excluirItem.acionarItemCriado();
	}

	@Quando("eu tocar na lixeira")
	public void euTocarNaLixeira() throws Exception {
		excluirItem.acionarLixeira();
	}
	
	
	@Quando("eu tocar em delete")
	public void euTocarEmDelete() throws Exception {
		excluirItem.acionarbotaoDelete();
	}
	

	@Entao("o sistema deleta o item permanentemente")
	public void oSistemaDeletaOItemPermanentemente() {
		assertEquals("", driver.findElement(By.id("com.microsoft.todos:id/tasks_recycler_view")).getText());
	}
	

}

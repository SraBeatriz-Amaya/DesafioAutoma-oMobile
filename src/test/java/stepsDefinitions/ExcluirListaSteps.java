package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExcluirListaPage;

public class ExcluirListaSteps {
	
	ExcluirListaPage excluirLista = new ExcluirListaPage(driver);
	
	@Quando("eu tocar na ListaEditada")
	public void euTocarNaListaEditada() throws Exception {
		excluirLista.acionarLista();
	}

	@Quando("eu acionar mais opcoes")
	public void euAcionarMaisOpcoes() {
	    excluirLista.acionarMaisOpcoes();
	}

	@Quando("eu acionar delete list")
	public void euAcionarDeleteList() throws Exception {
		excluirLista.acionarbotaoDeleteList();
	}

	@Quando("eu confirmar acionando delete")
	public void euConfirmarAcionandoDelete() throws Exception {
		excluirLista.acionarbotaoDelete();
	}

	@Entao("o sistema apaga o item permanentemente")
	public void oSistemaApagaOItemPermanentemente() {
		assertEquals("", driver.findElement(By.id("com.microsoft.todos:id/name_background")).getText());
	}
}

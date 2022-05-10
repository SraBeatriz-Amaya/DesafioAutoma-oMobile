package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EditarListaPage;

public class EditarListaSteps {
	
	EditarListaPage editarLista = new EditarListaPage(driver);
	
	@Quando("eu acionar a lista")
	public void euAcionarALista(){
	    editarLista.acionarLista();
	}

	@Quando("eu acionar as opcoes")
	public void euAcionarAsOpcoes() throws Exception{
	    editarLista.acionarMaisOpcoes();
	}

	@Quando("eu acionar o botao rename list")
	public void euAcionarOBotaoRenameList() {
	    editarLista.acionarRenameList();
	}
	
	@Quando("eu informar um novo title {string}")
	public void euInformarUmNovoTitle(String title) throws Exception {
	   editarLista.informarNovoTitulo(title);
	}
	
	@Quando("eu acionar o botao Save")
	public void euAcionarOBotaoSave() {
	    editarLista.acionarBotaoSave();
	}

	@Entao("o aplicativo apresenta lista com o titulo {string}")
	public void oAplicativoApresentaListaComOTitulo(String title) {
		 assertEquals(title, driver.findElement(By.xpath("//android.widget.TextView[@text='ListaEditada1']")).getText());
	}
}
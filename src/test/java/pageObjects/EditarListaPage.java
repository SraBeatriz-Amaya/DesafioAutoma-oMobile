package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditarListaPage {
	
	public EditarListaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista1']")
	private MobileElement acessarLista;
	
	public void acionarLista(){
		acessarLista.click();
	} 
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement maisOpcoes;
	
	public void acionarMaisOpcoes() throws Exception{
		maisOpcoes.click();
	} 
	@AndroidFindBy(id = "com.microsoft.todos:id/title")
	private MobileElement renameList;
	
	public void acionarRenameList(){
		renameList.click();
	} 
	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement editarTitle;
	
	public void informarNovoTitulo(String title) throws Exception{
		Thread.sleep(1000); 
		editarTitle.clear();
		editarTitle.sendKeys(title);
	} 
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoSave;
	
	public void acionarBotaoSave(){
		botaoSave.click();
	} 
	
	@AndroidFindBy(accessibility = "Back")
	private MobileElement botaoVoltar;
	
	public void acionarBotaoVoltar(){
		botaoVoltar.click();
	} 
}

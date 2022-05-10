package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExcluirListaPage {

	
	public ExcluirListaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ListaEditada1']")
	private MobileElement acessarLista;
	
	public void acionarLista() throws Exception{
		Thread.sleep(10000); 
		acessarLista.click();
	} 
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement maisOpcoes;
	
	public void acionarMaisOpcoes(){
		maisOpcoes.click();
	} 		
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete list']")
	private MobileElement botaoDeleteList;
	
	public void acionarbotaoDeleteList() throws Exception{ 
		botaoDeleteList.click();
	} 
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='DELETE']")
	private MobileElement botaoDelete;
	
	public void acionarbotaoDelete() throws Exception{ 
		Thread.sleep(2000); 
		botaoDelete.click();
	} 
}

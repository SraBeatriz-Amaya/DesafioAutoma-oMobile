package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExcluirItemListaPage {
		
	public ExcluirItemListaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ListaEditada1']")
	private MobileElement acessarLista;
	
	public void acionarLista() throws Exception{
		Thread.sleep(10000); 
		acessarLista.click();
	} 
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PrimeiroItem']")
	private MobileElement itemCriado;
	
	public void acionarItemCriado() throws Exception{
		itemCriado.click();
		
	} 
	@AndroidFindBy(id = "com.microsoft.todos:id/delete")
	private MobileElement lixeira;
	
	public void acionarLixeira() throws Exception{
		Thread.sleep(1000); 
		lixeira.click();
	} 		
	@AndroidFindBy(xpath = "//android.widget.Button[@text='DELETE']")
	private MobileElement botaoDelete;
	
	public void acionarbotaoDelete() throws Exception{ 
		botaoDelete.click();
	} 
	
}

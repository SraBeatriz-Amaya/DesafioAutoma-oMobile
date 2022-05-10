package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CriarListaPage {
	
	public CriarListaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.microsoft.todos:id/sso_account_email")
	private MobileElement botaoLogar;
	
	public void acionarBotaoLogar() throws InterruptedException {
		Thread.sleep(2000); 
		botaoLogar.click();
		
	} 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement botaoNewList;
	
	public void acionarBotaoNewList() throws InterruptedException {
		Thread.sleep(20000); 
		botaoNewList.click();
		
	} 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement campoTitle;
	
	public void informarCampoTitle(String title) throws InterruptedException{
		Thread.sleep(1000); 
		campoTitle.sendKeys(title);
		
	}
	
	@AndroidFindBy(accessibility = "Back")
	private MobileElement botaoVoltar;
	
	public void acionarBotaoVoltar() throws InterruptedException {
		botaoVoltar.click();
	} 
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoCriaLista;
		
	public void acionarBotaoCriarLista() throws InterruptedException{
		botaoCriaLista.click();
		
	}
}

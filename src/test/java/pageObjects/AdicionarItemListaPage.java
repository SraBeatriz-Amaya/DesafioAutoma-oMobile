package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AdicionarItemListaPage {
	
	public AdicionarItemListaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista1']")
	private MobileElement acessarLista;
	
	public void acionarLista() throws Exception{
		Thread.sleep(20000); 
		acessarLista.click();
	} 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/new_todo_fab")
	private MobileElement acessarBotaoAdd;
	
	public void acionarBotaoAdd(){
		acessarBotaoAdd.click();
	} 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement informarTask;
	
	public void informarTask(String nome) throws Exception{
		Thread.sleep(1000); 
		informarTask.sendKeys(nome);
	} 
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_image_button")
	private MobileElement acionarBotaoCriarTask;
	
	public void acionarBotaoCriarTask(){
		acionarBotaoCriarTask.click();
	} 
	
	@AndroidFindBy(accessibility = "Back")
	private MobileElement botaoVoltar;
	
	public void acionarBotaoVoltar(){
		botaoVoltar.click();
	} 
	

	
	
	 
}

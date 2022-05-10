package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	public LoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement campoEmail;
	
	public void informarCampoEmail(String email) throws Exception{
		campoEmail.click();
		campoEmail.sendKeys(email);
	} 
	@AndroidFindBy(id = "com.microsoft.todos:id/sign_in_button")
	private MobileElement botaoSignIn;
	
	public void acionarBotaoSignIn(){
		botaoSignIn.click();
	} 
	
	@AndroidFindBy(xpath = "//android.view.View//android.widget.EditText")
	private MobileElement campoSenha;
	
	public void informarCampoSenha(String senha) throws Exception{
		Thread.sleep(20000);
		campoSenha.sendKeys(senha);
	} 
	@AndroidFindBy(accessibility = "Sign in")
	private MobileElement botaoLogar;
	
	public void acionarBotaoLogar(){
		botaoLogar.click();
	} 
	
}

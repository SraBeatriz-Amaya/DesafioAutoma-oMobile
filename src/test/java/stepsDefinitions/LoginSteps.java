package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	LoginPage login = new LoginPage(driver);
	
	@Quando("informar no campo email {string}")
	public void informarNoCampoEmail(String email) throws Exception {
		login.informarCampoEmail(email);
	}

	@Quando("eu acionar o botao SignIn")
	public void euAcionarOBotaoSignIn() {
		login.acionarBotaoSignIn();
	}

	@Quando("eu informar no campo senha {string}")
	public void euInformarNoCampoSenha(String senha) throws Exception {
		login.informarCampoSenha(senha);
	}
	
	@Quando("eu acionar o botao sign in logar")
	public void euAcionarOBotaoSignInLogar() {
		login.acionarBotaoLogar();
	}
	
	@Entao("o aplicativo mostra a opcao My Day")
	public void oAplicativoMostraAOpcaoMyDay() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    assertEquals("My Day", driver.findElement(By.xpath("//android.widget.TextView[@text='My Day']")).getText());
	}


}

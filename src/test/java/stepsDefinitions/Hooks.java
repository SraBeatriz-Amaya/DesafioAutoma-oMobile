package stepsDefinitions;

import static utils.Utils.*;



import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before
    public void setUp() throws Exception{
		acessarMicrosoftToDo();
		LoginPage login = new LoginPage(driver);
		login.informarCampoEmail("testeStefanini.teste@outlook.com");
		login.acionarBotaoSignIn();
		login.informarCampoSenha("Teste123456");
		login.acionarBotaoLogar();
    }


	@After
	public void fechaApp(Scenario scenario) throws Exception {
		capturarScreenshot(scenario);
		driver.quit();
		
	}
	
}

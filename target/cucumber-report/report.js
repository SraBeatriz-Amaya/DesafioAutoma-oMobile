$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Microsoft To Do",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "Dado que eu acesso a plataforma e já possuo cadastro na microsoft",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "realizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "informar no campo email \"testeStefanini.teste@outlook.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarNoCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao SignIn",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.euAcionarOBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar no campo senha \"Teste123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.euInformarNoCampoSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao sign in logar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.euAcionarOBotaoSignInLogar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o aplicativo mostra a opcao My Day",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oAplicativoMostraAOpcaoMyDay()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});
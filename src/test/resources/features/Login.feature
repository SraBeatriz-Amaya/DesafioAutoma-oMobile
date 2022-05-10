#language: pt
#enconding:UTF-8

@Login
Funcionalidade: Microsoft To Do

Contexto: Dado que eu acesso a plataforma e já possuo cadastro na microsoft

Cenario: realizar login
Quando informar no campo email "testeStefanini.teste@outlook.com"
E eu acionar o botao SignIn
E eu informar no campo senha "Teste123456"
E eu acionar o botao sign in logar 
Entao o aplicativo mostra a opcao My Day



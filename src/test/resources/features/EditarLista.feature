#language: pt
#enconding:UTF-8

Funcionalidade: Microsoft To Do

Contexto: Dado que eu acesso a plataforma

@EditarLista
Cenario: editar uma lista
Quando eu acionar a lista
E eu acionar as opcoes
E eu acionar o botao rename list
E eu informar um novo title "ListaEditada1"
E eu acionar o botao Save
E eu acionar o botao voltar
Entao o aplicativo apresenta lista com o titulo "ListaEditada1"



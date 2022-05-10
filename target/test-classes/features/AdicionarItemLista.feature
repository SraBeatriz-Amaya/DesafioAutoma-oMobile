#language: pt
#enconding:UTF-8

Funcionalidade: Microsoft To Do

Contexto: Dado que eu acesso a plataforma

@AdicionarItemLista
Cenario: adicionar um item na lista
Quando eu acionar a ListaEditada
E eu acionar o botao de mais
E eu informar o nome do item "PrimeiroItem"
E eu acionar o botao adicionar item
E eu acionar o botao retornar
Entao o aplicativo apresenta lista com numero de itens



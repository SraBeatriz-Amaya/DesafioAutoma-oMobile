#language: pt
#enconding:UTF-8

Funcionalidade: Microsoft To Do

Contexto: Dado que eu acesso a plataforma

@ExcluirItemLista
Cenario: excluir um item 
Quando eu acessar a ListaEditada
E eu acessar o item 
E eu tocar na lixeira
E eu tocar em delete 
Entao o sistema deleta o item permanentemente
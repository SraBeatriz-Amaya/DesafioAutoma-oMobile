#language: pt
#enconding:UTF-8

Funcionalidade: Microsoft To Do

Contexto: Dado que eu acesso a plataforma

@ExcluirLista
Cenario: excluir a lista
Quando eu tocar na ListaEditada
E eu acionar mais opcoes
E eu acionar delete list
E eu confirmar acionando delete
Entao o sistema apaga o item permanentemente
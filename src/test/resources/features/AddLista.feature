#language: pt
#enconding:UTF-8


Funcionalidade: Microsoft To Do

Contexto: Dado que eu acesso a plataforma

@CriarLista
Cenario: Criar uma lista
Quando eu acionar o new list
E eu informar no campo title "Lista1"
E eu acionar o botao CreateList
E eu acionar o botao voltar
Entao o sistema apresenta a lista criada



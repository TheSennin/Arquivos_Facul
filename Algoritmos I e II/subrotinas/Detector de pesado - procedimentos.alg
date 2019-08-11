algoritmo "detector de pesado"
var
I: Inteiro
N, Pesado: Caractere
P, Mai: Real
procedimento Topo()
inicio
LimpaTela
escreval("-------------------------------------")
escreval(" D E T E C T O R   D E   P E S A D O ")
Escreval(" Maior peso ate agora: ", Mai, "Kg")
escreval("-------------------------------------")
fimprocedimento
inicio
Topo()
para I <- 1 ate 5 faca
   escreva("Digite o nome: ")
   leia(N)
   escreva("Digite o peso de ", N, ": ")
   leia(P)|
   se (P>Mai) entao
      Mai <- P
      Pesado <- N
   fimse
Topo()
fimpara
Topo()
escreval("A pessoa mais pesada foi ",Pesado, ", com ", Mai, " quilos.")
fimalgoritmo

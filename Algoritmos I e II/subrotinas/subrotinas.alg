algoritmo "fatorial"

funcao fatorial(n:inteiro):inteiro
var
resultado,i:inteiro
inicio
resultado <- 1
para i de 1 ate n faca
   resultado <- resultado * i
fimpara
retorne resultado
fimfuncao
funcao leianuminteiropositivo():inteiro
var
n:inteiro
inicio
escreval("digite num inteiro positivo")
repita
   leia(n)
ate(n>0)
retorne n
fimfuncao
var
n,fat:inteiro
inicio
n <- leianuminteiropositivo
fat <- fatorial(n)
escreval("fatorial de",n," é",fat)
fimalgoritmo





fimalgoritmo

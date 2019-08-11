algoritmo "semnome"

var
matA: vetor[1..15,1..25] de inteiro
vet: vetor [1..25] de inteiro
j, n, lin, col, soma, p, q: inteiro
inicio
repita
   escreva("Número de linhas:")
   leia(n)
   escreva("Número de colunas:")
   leia(j)
ate (n>0) e (n<16) e (j>0) e (j<26)
para lin de 1 ate n faca
   para col de 1 ate n faca
      escreva("Elemento[",lin,",",col,"]: ")
      leia (matA[lin,col])
   fimpara
fimpara
para lin de 1 ate n faca
   para col de 1 ate n faca
      vet[n] <- vet[n] + matA[lin,col]
   fimpara
fimpara
para p de 1 ate n faca
escreval("resultado = ",vet[p])
fimpara
   fimalgoritmo

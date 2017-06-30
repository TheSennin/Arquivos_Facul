algoritmo "semnome"

var
matA: vetor[1..10,1..10] de inteiro
vet: vetor [1..10] de inteiro
n, lin, col, result, p, q: inteiro
inicio
repita
   escreva("Dimensão da matriz (1..10)")
   leia(n)
ate (n>2) e (n<11)
para lin de 1 ate n faca
   para col de 1 ate n faca
      escreva("Elemento[",lin,",",col,"]: ")
      leia (matA[lin,col])
   fimpara
fimpara
escreval("matriz para conferência")
para lin de 1 ate n faca
   para col de 1 ate n faca
      result <- result + matA[lin,col]
   fimpara
fimpara
escreval("Soma de toda a matriz",result)
result <- 0
para lin de 1 ate n faca
   result <- result + matA[lin,lin]
fimpara
escreval("Soma diagonal", result)
escreval("Entre com linhas p e q para troca:")
repita
leia(p,q)
ate (p>0) e (p<=n) e (q>0) e (q<=n) e (p<>q)
para col de 1 ate n faca
result <- matA[p,col]
matA[p,col] <- matA[q,col]
matA[q,col] <- result
fimpara
escreval("Matriz modificada")
para lin de 1 ate n faca
para col de 1 ate n faca
escreva(matA[lin,col]," ")
fimpara
escreval //pula linha
fimpara
fimalgoritmo

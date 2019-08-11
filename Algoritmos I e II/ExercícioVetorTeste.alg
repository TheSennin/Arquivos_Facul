algoritmo "vetor - Listagem de alunos, médias e nomes"

var
nome:vetor[1..4] de caractere
n1:vetor[1..4] de real
n2:vetor[1..4] de real
SM, MT: real
m:vetor[1..4] de real
i,tot:Inteiro
inicio
para i <- 1 ate 4 faca
   Escreval("Aluno ", i)
   escreva("Nome: ")
   leia(nome[i])
   Escreva("Primeira nota: ")
   leia(n1[i])
   Escreva("Segunda nota: ")
   leia(n2[i])
   m[i] <- (n1[i]+n2[i])/2
   SM <- SM + m[i]
fimpara
MT <- SM/4

limpatela
Escreval("LISTAGEM DE ALUNOS")
Escreval("---------------------------")
para i <-1 ate 4 faca
   Escreval(nome[i]:15, m[i]:4:1)
   se (m[i] >= 6) entao
    tot <- tot + 1
   fimse
fimpara
Escreval("Temos",tot," Alunos acima da média")
Escreval("A média da turma é", MT:4:1)

fimalgoritmo

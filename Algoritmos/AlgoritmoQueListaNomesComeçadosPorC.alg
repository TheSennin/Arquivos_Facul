algoritmo "semnome"

var
  nome:caractere
  soC:vetor[1..5] de caracter
  c, tot:inteiro
inicio
  tot <- 0
  para c <- 1 ate 5 faca
    Escreva("Digite seu nome: ")
    leia(nome)
    se (copia(maiusc(nome),1, 1)= "C") entao
        tot <- tot + 1
        soC[tot] <- nome
    fimse
  fimpara
  
  limpatela
  escreval ("LISTAGEM FINAL")
  Para c <- 1 ate tot faca
    escreval(soC[c])
  fimpara
fimalgoritmo

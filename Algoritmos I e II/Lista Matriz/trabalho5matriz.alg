algoritmo "Multiplicação de matrizes e transposta"
// Função :
// Autor :
// Data : 31/10/2016
// Seção de Declarações 
var
lin,col,i,j,m,n: inteiro
matA:vetor[1..3,1..3] de inteiro
matB:vetor[1..3,1..3] de inteiro
matC:vetor[1..3,1..3] de inteiro
inicio
para lin de 1 ate 3 faca
    para col de 1 ate 3 faca
    escreva("Informe o elemento [",lin,",",col,"] para a matriz A: ")
    leia (matA[lin,col])
    fimpara
fimpara
para lin de 1 ate 3 faca
    para col de 1 ate 3 faca
    escreva("Informe o elemento [",lin,",",col,"] para a matriz B: ")
    leia(matB[lin,col])
    fimpara
fimpara
para lin de 1 ate 3 faca
    para m de 1 ate 3 faca
        para col de 1 ate 3 faca
    matC[m,lin] <- matC[m,lin] + matA[lin,col]*matB[col,m]
        fimpara
    fimpara
fimpara
escreval("Multiplicacao AxB = ")
para m de 1 ate 3 faca
    para lin de 1 ate 3 faca
escreva(matC[lin,m]," ")
fimpara
escreval(" ")
fimpara
escreval("Transposta de A = ")
para lin de 1 ate 3 faca
    para col de 1 ate 3 faca
escreva(matA[col,lin]," ")
fimpara
escreval(" ")
fimpara
escreval("Transposta de B = ")
para lin de 1 ate 3 faca
    para col de 1 ate 3 faca
escreva(matB[col,lin]," ")
fimpara
escreval(" ")
fimpara
fimalgoritmo

#include <iostream>

using namespace std;

void shakerSort(int vetor[]){
    int tamanho, inicio, fim, troca, aux;
    tamanho = 10; // para um vetor de 10 elementos
    inicio = 0;
    fim = tamanho - 1;
    troca = 0;
    while (troca == 0 && inicio < fim){
        troca = 1;
        for (int i = inicio; i < fim; i++){
            if (vetor[i] > vetor[i + 1]){
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                troca = 0;
            }
        }
        fim = fim - 1;
        for (int i = fim; i > inicio; i--){
            if (vetor[i] < vetor[i - 1]){
                aux = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = aux;
                troca = 0;
            }
        }
        inicio = inicio + 1;
    }
    for(int i=0;i<10;i++)
        cout << vetor[i];
}

int main(){
    int vetor[10]={3,5,9,10,4,6,7,8,2,1};

    for(int i=0;i<10;i++)
        cout << vetor[i];
    cout << endl << endl;

    shakerSort(vetor);

    return 0;
}

#include <iostream>
#include <cmath>
#include <stdio.h>

using namespace std;

//Escreva uma função recursiva que retorne quantas vezes um determinado dígito
//ocorre em um número natural N. Por exemplo, o dígito 5 ocorre 3 vezes em 4551925.

int aux; // Variável Global declarada para auxiliar a função.

int vezesRepetidas(float num, int dig){
    if(num == 0){  //Condição de parada
        if(dig == num)
            return 1;
        else
            return 0;
    }
    else{
        num = num/10; //Divide o numero por 10 para sobrar uma parte decimal. ex: 555 -> 55,5
        aux = int(num); // A variavel auxiliar guarda a parte inteira do numero.
        num = round((num - int(num))*10); //Transforma a parte decimal em um numero inteiro. Ex: 0,5 -> 5.
        if(num == dig)                                                  //(round resolve problemas de divisão de um float)
            return 1 + vezesRepetidas(aux, dig);
        else
            return vezesRepetidas(aux, dig);
    }
}

int main(){
    int num;
    int dig;
    cout << "Numero: ";
    cin >> num;
    fflush(stdin);
    cout << endl << "Digito: ";
    cin >> dig;
    cout << endl;
    cout << "Vezes em que o digito " << dig << " foi repetido em " << num << ":  " << vezesRepetidas(num, dig);
    return 0;
}

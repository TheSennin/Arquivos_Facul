#include <iostream>
#include "PilhaDupla.h"

using namespace std;

template<class T>
PilhaDupla<T>::PilhaDupla(){
    this->numeroElementosP1 = 0;
    this->numeroElementosP2 = 0;
}

template<class T>
PilhaDupla<T>::~PilhaDupla(){
    this->numeroElementosP1 = 0;
    this->numeroElementosP2 = 0;
}

template<class T>
bool PilhaDupla<T>::ehVazia(){
    return numeroDeElementosP1() + numeroDeElementosP2() == 0;
}

template<class T>
bool PilhaDupla<T>::temEspaco(){
    return numeroDeElementosP1() + numeroDeElementosP2() != tamanho;
}

template<class T>
int PilhaDupla<T>::numeroDeElementosP1(){
    return this->numeroElementosP1;
}

template<class T>
int PilhaDupla<T>::numeroDeElementosP2(){
    return this->numeroElementosP2;
}

template<class T>
void PilhaDupla<T>::empilhaP1(T elemento){
    elementos[numeroDeElementosP1()] = elemento;
    numeroElementosP1++;
}

template<class T>
void PilhaDupla<T>::empilhaP2(T elemento){
    numeroElementosP2++;
    elementos[tamanho - numeroDeElementosP2()] = elemento;
}

template<class T>
void PilhaDupla<T>::desempilhaP1(){
    numeroElementosP1--;
}

template<class T>
void PilhaDupla<T>::desempilhaP2(){
    numeroElementosP2--;
}

template<class T>
void PilhaDupla<T>::mostra(){
    int i;
    cout << "Pilha 1: ";
    for(i = 0; i < numeroDeElementosP1(); i++){
        cout << elementos[i] << "  ";
    }
    cout << endl << endl;
    cout << "Pilha 2: ";
    for(i = 1; i <= numeroDeElementosP2(); i++){
        cout << elementos[tamanho-i] << "  ";
    }
    cout << endl << endl;

}




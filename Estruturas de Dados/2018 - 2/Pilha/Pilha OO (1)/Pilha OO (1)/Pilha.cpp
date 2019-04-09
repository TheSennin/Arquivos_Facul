#include <iostream>
#include "Pilha.h"

using namespace std;

template<class T>
Pilha<T>::Pilha (){
    numeroElementos = 0;
}

template<class T>
Pilha<T>::~Pilha (){
    numeroElementos = 0;
}

template<class T>
bool Pilha<T>::ehVazia(){
    return numeroDeElementos() == 0;
}

template<class T>
bool Pilha<T>::temEspaco(){
    return numeroDeElementos() != tamanho;
}

template<class T>
int Pilha<T>::numeroDeElementos(){
    return numeroElementos;
}

template<class T>
void Pilha<T>::empilha(T elemento){
    elementos[numeroDeElementos()] = elemento;
    numeroElementos++;
}

template<class T>
void Pilha<T>::desempilha(){
    numeroElementos--;
}

template<class T>
void Pilha<T>::mostra(){
    for (int i = 0; i < numeroDeElementos(); i++)
        cout << elementos[i] << "  ";
}




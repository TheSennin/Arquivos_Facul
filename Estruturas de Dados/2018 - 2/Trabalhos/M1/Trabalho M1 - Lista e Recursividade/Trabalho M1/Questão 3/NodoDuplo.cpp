#include "NodoDuplo.h"
#include <stdio.h>

template <typename T>
NodoDuplo<T>::NodoDuplo(T elemento){
    this->elemento = elemento;
    this->anterior = NULL;
    this->proximo = NULL;
}

template <typename T>
void NodoDuplo<T>::setElemento(T elemento){
    this->elemento = elemento;
}

template <typename T>
void NodoDuplo<T>::setAnterior(NodoDuplo<T>* nodo){
    this->anterior = nodo;
}

template <typename T>
void NodoDuplo<T>::setProximo(NodoDuplo<T>* nodo){
    this->proximo = nodo;
}

template <typename T>
T NodoDuplo<T>::getElemento(){
    return this->elemento;
}

template <typename T>
NodoDuplo<T>* NodoDuplo<T>::getAnterior(){
    return this->anterior;
}

template <typename T>
NodoDuplo<T>* NodoDuplo<T>::getProximo(){
    return this->proximo;
}

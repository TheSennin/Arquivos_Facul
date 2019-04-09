#include "NodoDuplo.h"
#include <stdio.h>

template <typename T>
NodoDuplo<T>::NodoDuplo(T elemento, int prioridade){
    this->elemento = elemento;
    this->prioridade = prioridade;
    this->anterior = NULL;
    this->proximo = NULL;
}

template <typename T>
void NodoDuplo<T>::setElemento(T elemento){
    this->elemento = elemento;
}

template <typename T>
void NodoDuplo<T>::setPrioridade(int prioridade){
    this->prioridade = prioridade;
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
int NodoDuplo<T>::getPrioridade(){
    return this->prioridade;
}


template <typename T>
NodoDuplo<T>* NodoDuplo<T>::getAnterior(){
    return this->anterior;
}

template <typename T>
NodoDuplo<T>* NodoDuplo<T>::getProximo(){
    return this->proximo;
}

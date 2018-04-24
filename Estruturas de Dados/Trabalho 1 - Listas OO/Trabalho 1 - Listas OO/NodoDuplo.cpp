#include "NodoDuplo.h"

NodoDuplo::NodoDuplo(int elemento){
    this->elemento = elemento;
    this->proximo = NULL;
}

void NodoDuplo::setElemento(int elemento){
    this->elemento = elemento;
}

void NodoDuplo::setAnterior(NodoDuplo* nodo){
    this->anterior = nodo;
}

void NodoDuplo::setProximo(NodoDuplo* nodo){
    this->proximo = nodo;
}

int NodoDuplo::getElemento(){
    return this->elemento;
}

NodoDuplo* NodoDuplo::getAnterior(){
    return this->anterior;
}


NodoDuplo* NodoDuplo::getProximo(){
    return this->proximo;
}

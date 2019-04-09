#include "Lista.h"
#include "NodoDuplo.cpp"
#include <stdio.h>
#include <iostream>

using namespace std;

template <typename T>
Lista<T>::Lista(){
    this->numeroElementos = 0;
    this->inicio = NULL;
    this->fim = NULL;
}

template <typename T>
Lista<T>::~Lista(){
    NodoDuplo<T> *nodo;

    while(this->inicio != NULL){
        nodo = this->inicio;
        this->inicio = this->inicio->getProximo();
        delete nodo;
    }
    this -> numeroElementos = 0;
}

template <typename T>
bool Lista<T>::ehVazia(){
    return numeroElementos == 0;
}

template <typename T>
int Lista<T>::numeroDeElementos(){
    return this->numeroElementos;
}

template <typename T>
bool Lista<T>::existeElemento(T elemento){
    NodoDuplo<T> *nodo = this->inicio;
    while(nodo != NULL){
        if(nodo->getElemento() == elemento){
            return true;
        }
        nodo = nodo->getProximo();
    }
    return false;
}

template <typename T>
T Lista<T>::umElemento(int posicao){
    NodoDuplo<T> *nodo = this->inicio;
    int i = 1;

    while(i != posicao){
        nodo = nodo->getProximo();
        i++;
    }
    return nodo->getElemento();
}

template <typename T>
void Lista<T>::insereNoInicio(T elemento){
    NodoDuplo<T> *nodo = new NodoDuplo<T>(elemento);
    if(this->inicio == NULL){
        this->inicio = nodo;
        this->fim = nodo;
    }
    else{
        nodo->setProximo(this->inicio);
        this->inicio->setAnterior(nodo);
        this->inicio = nodo;
    }
    this->numeroElementos++;
}

template <typename T>
void Lista<T>::insereNoFinal(T elemento){
    NodoDuplo<T> *nodo = new NodoDuplo<T>(elemento);
    if(this->inicio == NULL){
        this->inicio = nodo;
        this->fim = nodo;
    }
    else{
        nodo->setAnterior(fim);
        fim->setProximo(nodo);
        this->fim = nodo;
    }
    this->numeroElementos++;
}

template <typename T>
void Lista<T>::retiraDoInicio(){
    NodoDuplo<T> *nodo = this->inicio;

    if(this->numeroElementos==0){
        cout << "Lista Vazia!" << endl;
    }else{
        if(this->inicio == this->fim){
            this->inicio = NULL;
            this->fim = NULL;
            this->numeroElementos == 0;
            delete nodo;
        }else{
             this->inicio = this->inicio->getProximo();
             this->inicio->setAnterior(NULL);
             this->numeroElementos--;
             delete nodo;
        }
    }
}

template <typename T>
void Lista<T>::retiraDoFinal(){
    NodoDuplo<T> *nodo = this->fim;

    if(this->numeroElementos==0){
        cout << "Lista Vazia!" << endl;
    }else{
        if(this->inicio == this->fim){
            this->inicio = NULL;
            this->fim = NULL;
            this->numeroElementos == 0;
            delete nodo;
        }else{
             this->fim = this->fim->getAnterior();
             this->fim->setProximo(NULL);
             this->numeroElementos--;
             delete nodo;
        }
    }
}

template <typename T>
void Lista<T>::retiraElemento(T elemento){
    NodoDuplo<T> *nodo = this->inicio;
    int i = 1;

    while(i <= numeroElementos && nodo->getElemento() != elemento){
        nodo = nodo->getProximo();
        i++;
    }
    if(nodo->getElemento() != elemento)
        cout << "Não existe o elemento informado!" << endl;
    else{
        NodoDuplo<T> *nodoAnterior = nodo->getAnterior();
        NodoDuplo<T> *nodoSeguinte = nodo->getProximo();
        nodoAnterior->setProximo(nodoSeguinte);
        nodoSeguinte->setAnterior(nodoAnterior);
        delete nodo;
        numeroElementos--;
    }
}

template <typename T>
void Lista<T>::mostra(){
    NodoDuplo<T> *nodo = this->inicio;
    cout << "Lista: ";
    while(nodo != NULL){
        cout << nodo->getElemento() << " ";
        nodo = nodo->getProximo();
    }
}


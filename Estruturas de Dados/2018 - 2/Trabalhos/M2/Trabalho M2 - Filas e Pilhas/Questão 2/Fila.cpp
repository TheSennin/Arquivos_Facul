#include "Fila.h"
#include "NodoDuplo.cpp"
#include <stdio.h>
#include <iostream>

using namespace std;

template <typename T>
Fila<T>::Fila(){
    this->numeroElementos = 0;
    this->inicio = NULL;
    this->fim = NULL;
}

template <typename T>
Fila<T>::~Fila(){
    NodoDuplo<T> *nodo;

    while(this->inicio != NULL){
        nodo = this->inicio;
        this->inicio = this->inicio->getProximo();
        delete nodo;
    }
    this -> numeroElementos = 0;
}

template <typename T>
bool Fila<T>::ehVazia(){
    return numeroElementos == 0;
}

template <typename T>
int Fila<T>::numeroDeElementos(){
    return this->numeroElementos;
}

template <typename T>
bool Fila<T>::existeElemento(T elemento){
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
void Fila<T>::insere(T elemento, int prioridade){
    NodoDuplo<T> *nodo = new NodoDuplo<T>(elemento, prioridade);
    if(this->inicio == NULL){
        this->inicio = nodo;
        this->fim = nodo;
    }
    else{
        nodo->setAnterior(this->fim);
        this->fim->setProximo(nodo);
        this->fim = nodo;
    }
    this->numeroElementos++;
}

template <typename T>
void Fila<T>::retiraElemento(T elemento){
    NodoDuplo<T> *nodo = this->inicio;

    while(nodo != NULL && nodo->getElemento() != elemento){
        nodo = nodo->getProximo();
    }
    if(nodo->getElemento() != elemento)
        cout << "Não existe o elemento informado!" << endl;
    else
    if(this->inicio == this->fim){
        this->inicio = NULL;
        this->fim = NULL;
        this->numeroElementos == 0;
        delete nodo;
        cout << "Elemento retirado!" << endl << endl;
    }
    else
    if(nodo == this->inicio){
        NodoDuplo<T> *nodoSeguinte = nodo->getProximo();
        this->inicio = nodoSeguinte;
        nodoSeguinte->setAnterior(NULL);
        numeroElementos--;
        delete nodo;
        cout << "Elemento retirado!" << endl << endl;
    }
    else
    if(nodo == this->fim){
        NodoDuplo<T> *nodoAnterior = nodo->getAnterior();
        this->fim = nodoAnterior;
        nodoAnterior->setProximo(NULL);
        numeroElementos--;
        delete nodo;
        cout << "Elemento retirado!" << endl << endl;
    }
    else{
        NodoDuplo<T> *nodoAnterior = nodo->getAnterior();
        NodoDuplo<T> *nodoSeguinte = nodo->getProximo();
        nodoAnterior->setProximo(nodoSeguinte);
        nodoSeguinte->setAnterior(nodoAnterior);
        delete nodo;
        numeroElementos--;
        cout << "Elemento retirado!" << endl << endl;
    }
}

template <typename T>
void Fila<T>::retiraComPrioridade(){
    NodoDuplo<T> *nodo = this->inicio;
    bool retirou=false;

    do{
        if(nodo->getPrioridade()==3){
            retiraElemento(nodo->getElemento());
            retirou = true;
        }else
            nodo = nodo->getProximo();
    }while(!retirou && nodo!=NULL);
    nodo = this->inicio;

    while(!retirou && nodo!=NULL){
        if(nodo->getPrioridade()==2){
            retiraElemento(nodo->getElemento());
            retirou = true;
        }else
            nodo = nodo->getProximo();
        }
    if(!retirou){
        nodo = this->inicio;
        retiraElemento(nodo->getElemento());
    }
}

template <typename T>
void Fila<T>::mostra(){
    NodoDuplo<T> *nodo = this->inicio;
    cout << "Fila: ";
    if(numeroDeElementos()==0)
        cout << "Fila Vazia!";
    else{
        while(nodo != NULL){
            cout << nodo->getElemento() << "(" << nodo->getPrioridade() << ")" << "  ";
            nodo = nodo->getProximo();
        }
        cout << endl << endl << "NOTA: Os numeros dentre os parenteses determinam a prioridade.";
    }
    cout << endl << endl;
}


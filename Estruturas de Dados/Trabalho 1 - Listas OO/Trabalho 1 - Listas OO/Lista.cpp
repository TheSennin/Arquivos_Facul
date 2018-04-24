#include "Lista.h"
#include "NodoDuplo.h"

using namespace std;

Lista::Lista(){
    this->numeroElementos = 0;
    this->inicio = NULL;
    this->fim = NULL;
}

Lista::~Lista(){
    Nodo* nodo;
    while(this->inicio != NULL){
        nodo = this->inicio;
        this->inicio = this->inicio->getProximo();
        delete nodo;
    }
    this->numeroElementos = 0;
}

bool Lista::ehVazia(){
    return numeroDeElementos() == 0;
}

int Lista::numeroDeElementos(){
    return this->numeroElementos;
}

bool Lista::existeElemento(int elemento){
    NodoDuplo* nodo = this->inicio;
    while (nodo != NULL){
        if (nodo->getElemento() == elemento)
            return true;
        nodo = nodo->getProximo();
    }
    return false;
}

int Lista::umElemento(int posicao){
    NodoDuplo* nodo = this->inicio;
    int i = 1;
    while (i != posicao){
        nodo = nodo->getProximo();
        i++;
    }
    return nodo->getElemento();
}

int Lista::posicao(int elemento){
    NodoDuplo* nodo = this->inicio;
    int i = 1;
    while (nodo->getElemento() != elemento){
        nodo = nodo->getProximo();
        i++;
    }
    return i;
}

void Lista::insere(int elemento, int posicao){
    NodoDuplo* nodo = new Nodo(elemento);
    if (this->inicio == NULL)
        this->inicio = nodo;
    else {
        if (posicao == 1){
            nodo->setProximo(this->inicio);
            this->inicio = nodo;
        }
        else {
            NodoDuplo* nodoAnterior = this->inicio;
            int i = 1;
            while (i != posicao - 1){
                nodoAnterior = nodoAnterior->getProximo();
                i++;
            }
            nodo->setProximo(nodoAnterior->getProximo());
            nodoAnterior->setProximo(nodo);
        }
    }
    this->numeroElementos++;
}

void Lista::retira(int posicao){
    NodoDuplo* nodo = this->inicio;
    if (posicao == 1){
        this->inicio = this->inicio->getProximo();
    }
    else {
        NodoDuplo* nodoAnterior = this->inicio;
        int i = 1;
        while (i != posicao - 1){
            nodoAnterior = nodoAnterior->getProximo();
            i++;
        }
        nodo = nodoAnterior->getProximo();
        nodoAnterior->setProximo(nodo->getProximo());
    }
    delete nodo;
    this->numeroElementos--;
}

void Lista::mostra(){
    NodoDuplo* nodo = this->inicio;
    while (nodo != NULL){
        cout << nodo->getElemento() << " ";
        nodo = nodo->getProximo();
    }
}

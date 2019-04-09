#include "Nodo.cpp"
#include "ABB.h"

using namespace std;

template<class T>
ABB<T>::ABB()
{
    this->raiz = NULL;
}

template<class T>
ABB<T>::~ABB()
{
    destroi(this->raiz);
}

template<class T>
void ABB<T>::destroi(Nodo<T>* raiz)
{
    if (raiz != NULL)
    {
        destroi(raiz->subArvoreEsquerda);
        destroi(raiz->subArvoreDireita);
        delete raiz;
        raiz = NULL;
    }
}

template<class T>
bool ABB<T>::ehVazia()
{
    return this->raiz == NULL;
}

template<class T>
bool ABB<T>::existeElemento(T elemento)
{
    Nodo<T>* nodo = this->raiz;
    while (nodo != NULL)
        if (nodo->elemento == elemento)
            return true;
        else
        {
            if (elemento < nodo->elemento)
                nodo = nodo->subArvoreEsquerda;
            else
                nodo = nodo->subArvoreDireita;
        }
    return false;
}

template<class T>
void ABB<T>::insere(T elemento)
{

    Nodo<T>* novoNodo = new Nodo<T>(elemento);

    if (this->raiz == NULL)
        this->raiz = novoNodo;
    else
    {
        Nodo<T>* nodoAnterior;
        Nodo<T>* nodoAtual = this->raiz;
        while (nodoAtual != NULL)
        {
            nodoAnterior = nodoAtual;
            if (elemento < nodoAtual->elemento)
            {
                nodoAtual = nodoAtual->subArvoreEsquerda;
                if (nodoAtual == NULL)
                {
                    nodoAnterior->subArvoreEsquerda = novoNodo;
                    return;
                }
            }
            else
            {
                nodoAtual = nodoAtual->subArvoreDireita;
                if (nodoAtual == NULL)
                {
                    nodoAnterior->subArvoreDireita = novoNodo;
                    return;
                }
            }
        }
    }
}

template<class T>
void ABB<T>::retira(T elemento)
{
    retira(this->raiz, elemento);
}

template<class T>
void ABB<T>::retira(Nodo<T>* raiz, T elemento)
{
    // IMPLEMENTAR
}

template <typename T>
int ABB<T>::nivel(Nodo<T>* raiz){
    if(raiz == NULL)
        return 0;
    else
        if(nivel(raiz->retornaSubArvoreEsquerda()) > nivel(raiz->retornaSubArvoreDireita()))
            return nivel(raiz->retornaSubArvoreEsquerda()) + 1;
        else
            return nivel(raiz->retornaSubArvoreDireita()) + 1;
}

template <typename T>
int ABB<T>::nivel(){
    return nivel(this->raiz);
}

template<typename T>
int ABB<T>::soma(){
    return soma(this->raiz);
}

template<typename T>
int ABB<T>::soma(Nodo<T>* raiz){
    if(raiz == NULL)
        return 0;
    else
        return raiz->retornaElemento() + soma(raiz->retornaSubArvoreEsquerda()) +
        soma(raiz->retornaSubArvoreDireita());
}

template<class T>
void ABB<T>::mostra()
{
    mostra(this->raiz);
}

template<class T>
void ABB<T>::mostra(Nodo<T>* raiz)
{
    if (raiz != NULL)
    {
        mostra(raiz->subArvoreEsquerda);
        cout << raiz->elemento << "  ";
        mostra(raiz->subArvoreDireita);
    }
}

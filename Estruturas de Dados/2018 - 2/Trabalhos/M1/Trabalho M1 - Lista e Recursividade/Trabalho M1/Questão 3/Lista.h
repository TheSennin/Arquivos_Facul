#ifndef LISTA_H_INCLUDED
#define LISTA_H_INCLUDED

#include "NodoDuplo.h"

template <typename T>
class Lista{
    private:
        int numeroElementos;
        NodoDuplo<T> *inicio, *fim;
    public:
        Lista();
        ~Lista();
        bool ehVazia();
        int numeroDeElementos();
        bool existeElemento(T elemento);
        T umElemento(int posicao);
        void insereNoInicio(T elemento);
        void insereNoFinal(T elemento);
        void retiraDoInicio();
        void retiraDoFinal();
        void retiraElemento(T elemento);
        void mostra();
};

#endif // LISTA_H_INCLUDED

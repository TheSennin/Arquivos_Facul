#ifndef FILA_H_INCLUDED
#define FILA_H_INCLUDED

#include "NodoDuplo.h"

template <typename T>
class Fila{
    private:
        int numeroElementos;
        NodoDuplo<T> *inicio, *fim;
    public:
        Fila();
        ~Fila();
        bool ehVazia();
        int numeroDeElementos();
        bool existeElemento(T elemento);
        void insere(T elemento, int prioridade);
        void retiraElemento(T elemento);
        void retiraComPrioridade();
        void mostra();
};

#endif // FILA_H_INCLUDED

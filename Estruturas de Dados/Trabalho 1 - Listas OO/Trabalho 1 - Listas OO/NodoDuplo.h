#ifndef NODODUPLO_H_INCLUDED
#define NODODUPLO_H_INCLUDED

class NodoDuplo{
    private:
        int elemento;
        NodoDuplo* anterior;
        NodoDuplo* proximo;
    public:
        NodoDuplo(int elemento);
        void setElemento(int elemento);
        void setAntrior(NodoDuplo* nodo);
        void setProximo(NodoDuplo* nodo);
        int getElemento();
        NodoDuplo* getAnterior();
        NodoDuplo* getProximo();
};


#endif // NODODUPLO_H_INCLUDED

#ifndef NODODUPLO_H_INCLUDED
#define NODODUPLO_H_INCLUDED

template <typename T>
class NodoDuplo{
    private:
        T elemento;
        NodoDuplo *anterior, *proximo;
    public:
        NodoDuplo(T elemento);
        void setElemento(T elemento);
        void setAnterior(NodoDuplo* nodo);
        void setProximo(NodoDuplo* nodo);
        T getElemento();
        NodoDuplo* getAnterior();
        NodoDuplo* getProximo();
};


#endif // NODODUPLO_H_INCLUDED

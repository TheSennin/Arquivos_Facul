#ifndef NODODUPLO_H_INCLUDED
#define NODODUPLO_H_INCLUDED

template <typename T>
class NodoDuplo{
    private:
        T elemento;
        int prioridade; //1-normal; 2-media; 3-alta
        NodoDuplo *anterior, *proximo;
    public:
        NodoDuplo(T elemento, int prioridade);
        void setElemento(T elemento);
        void setPrioridade(int prioridade);
        void setAnterior(NodoDuplo* nodo);
        void setProximo(NodoDuplo* nodo);
        T getElemento();
        int getPrioridade();
        NodoDuplo* getAnterior();
        NodoDuplo* getProximo();
};


#endif // NODODUPLO_H_INCLUDED

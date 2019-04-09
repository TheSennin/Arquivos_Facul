#ifndef PILHADUPLA_H_INCLUDED
#define PILHADUPLA_H_INCLUDED

const int tamanho = 10;

template<class T>
class PilhaDupla{
    private:
        int numeroElementosP1;
        int numeroElementosP2;
        T elementos[tamanho];
    public:
        PilhaDupla();
        ~PilhaDupla();
        bool ehVazia();
        bool temEspaco();
        int numeroDeElementosP1();
        int numeroDeElementosP2();
        void empilhaP1(T elemento);
        void empilhaP2(T elemento);
        void desempilhaP1();
        void desempilhaP2();
        void mostra();
};

#endif // PILHADUPLA_H_INCLUDED

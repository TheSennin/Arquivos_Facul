#ifndef PILHA_H_INCLUDED
#define PILHA_H_INCLUDED

const int tamanho = 100;

template<class T>
class PilhaDupla{
private:
    int numeroElementos;
    T elementos[tamanho];
public :
    Pilha ();
    ~Pilha ();
    bool ehVazia();
    bool temEspaco();
    int numeroDeElementos();
    void empilha(T elemento);
    void desempilha();
    void mostra();
};

#endif // PILHA_H_INCLUDED

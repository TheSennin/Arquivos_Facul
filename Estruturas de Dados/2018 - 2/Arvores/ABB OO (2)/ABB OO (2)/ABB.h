#ifndef ABB_H_INCLUDED
#define ABB_H_INCLUDED

template<class T>
class ABB
{
public:
    ABB();
    ~ABB();
    bool ehVazia();
    bool existeElemento(T elemento);
    void insere(T elemento);
    void retira(T elemento);
    int nivel();
    int soma();
    void mostra();
private:
    void destroi(Nodo<T>* raiz);
    void retira(Nodo<T>* raiz, T elemento);
    int nivel(Nodo<T>* raiz);
    int soma(Nodo<T>* raiz);
    void mostra(Nodo<T>* raiz);

    Nodo<T>* raiz;
};

#endif // ABB_H_INCLUDED

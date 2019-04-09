#ifndef ABB_H_INCLUDED
#define ABB_H_INCLUDED
#include "Node.h"

template <typename T>
class ABB{
    private:
        void destruct(Node<T>* root);
        void removeElement(Node<T>* root, T element);
        void show(Node<T>* root);
        Node<T>* root;
    public:
        ABB();
        ~ABB();
        bool isEmpty();
        bool hasElement(T element);
        int nivel();
        int soma();
        int multiplica();
        void insertElement(T element);
        void removeElement(T element);
        void show();
};

#endif // ABB_H_INCLUDED

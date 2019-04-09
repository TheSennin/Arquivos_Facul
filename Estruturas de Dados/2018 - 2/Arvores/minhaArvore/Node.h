#ifndef NODE_H_INCLUDED
#define NODE_H_INCLUDED

template <typename T>
class Node{
    private:
        T element;
        Node<T> *leftSubTree;
        Node<T> *rightSubTree;
    public:
        Node(T element);
        T getElement();
        Node<T>* getLeftSubTree();
        Node<T>* getRightSubTree();
        void setLeftSubTree(Node<T>* leftSubTree);
        void setRightSubTree(Node<T>* rightSubTree);

};

#endif // NODE_H_INCLUDED

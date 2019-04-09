#include <iostream>
#include "ABB.h"
#include "Node.cpp"
#include <stdio.h>

using std::cout;

template <typename T>
ABB<T>::ABB(){
    this->root = NULL;
}

template<typename T>
ABB<T>::~ABB(){
    destruct(this->root);
}

template<class T>
void ABB<T>::destruct(Node<T>* root){
    if (root != NULL)
    {
        destruct(root->getLeftSubTree());
        destruct(root->getRightSubTree());
        delete root;
        root = NULL;
    }
}

template<class T>
bool ABB<T>::isEmpty(){
    return this->root == NULL;
}

template<class T>
bool ABB<T>::hasElement(T element){
    Node<T>* node = this->root;
    while (node != NULL)
        if (node->getElement() == element)
            return true;
        else
        {
            if (element < node->getElement())
                node = node->getLeftSubTree();
            else
                node = node->getRightSubTree();
        }
    return false;
}

template<class T>
int ABB<T>::nivel(Node<T>* root){
    if (root == NULL)
        return 0;
    else
        if(nivel(root->getLeftSubTree()) > nivel(root->getRightSubTree()))
            return nivel(raiz->retornaSubArvoreEsquerda()) + 1;
        else
            return nivel(raiz->retornaSubArvoreDireita()) + 1;
}

template<class T>
T ABB<T>::soma(Node<T>* root){
    if (root == NULL)
        return 0;
    else
        return root->getElement() + soma(root->getLeftSubTree()) + soma(root->getRightSubTree());
}

template<class T>
void ABB<T>::multiplica(Node<T>* root, T element) {
    if (root != NULL){
        root->getElement() *= element;
        multiplica(root->getLeftSubTree(), element);
        multiplica(root->getRightSubTree(), element);
    }
}

template<class T>
void ABB<T>::insertElement(T element){

    Node<T>* novonode = new Node<T>(element);

    if (this->root == NULL)
        this->root = novonode;
    else{
        Node<T>* nodeAnterior;
        Node<T>* nodeAtual = this->root;
        while (nodeAtual != NULL){
            nodeAnterior = nodeAtual;
            if (element < nodeAtual->getElement()){
                nodeAtual = nodeAtual->getLeftSubTree();
                if (nodeAtual == NULL){
                    nodeAnterior->setLeftSubTree(novonode);
                    return;
                }
            }
            else{
                nodeAtual = nodeAtual->getRightSubTree();
                if (nodeAtual == NULL){
                    nodeAnterior->setRightSubTree(novonode);
                    return;
                }
            }
        }
    }
}

template<class T>
void ABB<T>::removeElement(T element){
    removeElement(this->root, element);
}

template<class T>
void ABB<T>::removeElement(Node<T>* root, T element){
    if(root->getElement() == element){
        Node<T>* nodeRight = root->getRightSubTree();
        Node<T>* nodeLeft = root ->getLeftSubTree();
        nodeRight->setLeftSubTree(nodeLeft);
        delete root;
        this->root = nodeRight;
    }else{
        Node<T>* nodeRight = root->getRightSubTree();
        Node<T>* nodeLeft = root ->getLeftSubTree();
        Node<T>* nodeProx = root;
        while(nodeProx != NULL){
            if(nodeProx->getElement() < element){
                root = nodeProx;
                nodeProx = root->getRightSubTree();
            }else
            if(nodeProx->getElement() > element){
                root = nodeProx;
                nodeProx = root->getLeftSubTree();
            }
            else{
                if(nodeProx->getRightSubTree() != NULL){
                    Node<T>* nodeRight = nodeProx->getRightSubTree();
                    Node<T>* nodeLeft = nodeProx ->getLeftSubTree();
                    root->setLeftSubTree(nodeRight);
                    nodeRight->setLeftSubTree(nodeLeft);
                    delete nodeProx;
                }
            }
        }
    }
}

template<class T>
void ABB<T>::show(){
    show(this->root);
}

template<class T>
void ABB<T>::show(Node<T>* root){
    if (root != NULL){
        show(root->getLeftSubTree());
        cout << root->getElement() << "  ";
        show(root->getRightSubTree());
    }
}

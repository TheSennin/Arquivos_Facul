#include "Node.h"
#include <stdio.h>

template <typename T>
Node<T>::Node(T element){
    this->element = element;
    this->leftSubTree = NULL;
    this->rightSubTree = NULL;
}

template<typename T>
T Node<T>::getElement(){
    return this->element;
}

template<typename T>
Node<T>* Node<T>::getLeftSubTree(){
    return this->leftSubTree;
}

template<typename T>
Node<T>* Node<T>::getRightSubTree(){
    return this->rightSubTree;
}

template<typename T>
void Node<T>::setLeftSubTree(Node<T>* leftSubTree){
    this->leftSubTree = leftSubTree;
}

template<typename T>
void Node<T>::setRightSubTree(Node<T>* rightSubTree){
    this->rightSubTree = rightSubTree;
}

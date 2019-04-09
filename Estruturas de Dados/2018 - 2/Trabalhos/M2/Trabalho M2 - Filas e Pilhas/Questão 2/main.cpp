#include <iostream>
#include "Fila.cpp"
#include <stdlib.h>

using namespace std;

int main(){

    Fila<int> fila;
    int opc, elemento, prioridade;

    do{
        system("cls");
        cout << "::::::::MENU DE OPCOES::::::::" << endl << endl;
        cout << "1-Inserir Elemento na fila" << endl;
        cout << "2-Retirar elemento da fila (elemento de maior prioridade)" << endl;
        cout << "3-Retirar elemento da fila (independente da prioridade)" << endl;
        cout << "4-Verificar se um elemento existe na fila" << endl;
        cout << "5-Mostra a fila" << endl;
        cout << "'-1'-Sai da aplicacao" << endl;
        cout << "Sua opcao: ";
        fflush(stdin);
        cin >> opc;

        switch(opc){
            case 1:
                system("cls");
                cout << "Elemento a ser inserido: ";
                cin >> elemento;
                do{
                    cout << endl << "Prioridade: ";
                    cin >> prioridade;
                    if(prioridade<1 || prioridade>3)
                        cout << "Prioridade invalida! (1, 2 ou 3)" << endl << endl;
                    else
                        fila.insere(elemento, prioridade);
                }while(prioridade<1 || prioridade>3);
                cout << endl << "Elemento inserido!" << endl << endl;
                system("pause");
                break;
            case 2:
                system("cls");
                if(fila.ehVazia())
                    cout << "Erro! Fila vazia!" << endl << endl;
                else
                    fila.retiraComPrioridade();
                system("pause");
                break;
            case 3:
                system("cls");
                cout << "Elemento a ser retirado: ";
                cin >> elemento;
                system("cls");
                if(!fila.existeElemento(elemento)){
                    cout << "Nao foi possivel encontrar o elemento (fila vazia?)" << endl << endl;
                }else
                    fila.retiraElemento(elemento);
                 system("pause");
                 break;
            case 4:
                system("cls");
                cout << "Elemento a ser pesquisado: ";
                cin >> elemento;
                if(fila.existeElemento(elemento))
                    cout << "O elemento pesquisado esta na fila!" << endl << endl;
                else
                    cout << "O elemento pesquisado nao esta na fila." << endl << endl;
                system("pause");
                break;
            case 5:
                system("cls");
                fila.mostra();
                system("pause");
                break;
        }
    }while(opc != -1);


    return 0;
}

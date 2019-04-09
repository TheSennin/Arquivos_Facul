#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include "PilhaDupla.cpp"

using namespace std;

int main()
{
    PilhaDupla<int> pilha;
    int i, elemento, opc;

    do{
        system("cls");
        cout << "::::::::MENU DE OPCOES::::::::" << endl << endl;
        cout << "1-Empilha na Pilha 1" << endl;
        cout << "2-Empilha na Pilha 2" << endl;
        cout << "3-Desempilha da Pilha 1" << endl;
        cout << "4-Desempilha da Pilha 2" << endl;
        cout << "5-Mostra o conteudo (ambas as pilhas)" << endl;
        cout << "'-1'-Sai da aplicacao" << endl;
        cout << "Sua opcao: ";
        cin >> opc;

        switch(opc){
            case 1:
                system("cls");
                if(!pilha.temEspaco()){
                    cout << "ERRO! Pilha cheia!" << endl;
                    system("pause");
                    break;
                }else{
                    cout << "Elemento a ser empilhado: ";
                    cin >> elemento;
                    pilha.empilhaP1(elemento);
                    break;
                }

            case 2:
                system("cls");
                if(!pilha.temEspaco()){
                    cout << "ERRO! Pilha cheia!" << endl;
                    system("pause");
                    break;
                }else{
                    cout << "Elemento a ser empilhado: ";
                    cin >> elemento;
                    pilha.empilhaP2(elemento);
                    break;
                }
            case 3:
                system("cls");
                if(pilha.numeroDeElementosP1() == 0){
                    cout << "ERRO! Pilha vazia!" << endl;
                    system("pause");
                    break;
                }else{
                    pilha.desempilhaP1();
                    break;
                }
            case 4:
                system("cls");
                if(pilha.numeroDeElementosP2() == 0){
                    cout << "ERRO! Pilha vazia!" << endl;
                    system("pause");
                    break;
                }else{
                    pilha.desempilhaP2();
                    break;
                }
            case 5:
                system("cls");
                pilha.mostra();
                system("pause");
                break;
        }
    }while(opc != -1);

    return 0;
}

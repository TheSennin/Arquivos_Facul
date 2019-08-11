#include <iostream>
#include "CDS.h"
#include "DVDS.h"
#include "Livros.h"
#include <string>
#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <time.h>

using namespace std;

/*
ostream& operator << (ostream &out, Produto& obj){
    obj.mostra();
    return out;
}
*/

int main(){
    int i = 0;
    char opcao, produto[i];
    do {
        cout << "Deseja acrescentar um novo produto? S/N" << endl;
        cin.get(opcao);
        fflush(stdin);
        if (toupper(opcao) != 'N'){
            system("cls");
            do {
                cout << "Qual produto voce quer adicionar? (L = livro, C = CD, D = DVD S = SAIR)" << endl;
                cin.get(produto[i]);
                fflush(stdin);
                produto[i] = toupper(produto[i]);
                if (produto[i] != 'L' && produto[i] != 'C' && produto[i] != 'D' && produto[i] != 'S'){
                    system("cls");
                    cout << "Opcao invalida, tente novamente! " << endl;
                    system("pause");
                }
                switch (produto[i]){
                    case 'L':
                        cout << "caso L" << endl;
                        system("pause");
                        break;
                    case 'C':
                        cout << "caso C" << endl;
                        system("pause");
                        break;
                    case 'D':
                        cout << "Caso D" << endl;
                        system("pause");
                        break;
                }
            }while(produto[i] != 'L' && produto[i] != 'C' && produto[i] != 'D' && produto[i] != 'S');
             i++; // Acrescenta +1 no vetor a cada produto cadastrado
             system("cls");
        }
    }while(toupper(opcao) != 'N');

    return 0;
}

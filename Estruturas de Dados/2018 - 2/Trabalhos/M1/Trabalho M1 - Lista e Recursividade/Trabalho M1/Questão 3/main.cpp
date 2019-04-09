#include <iostream>
#include "Lista.cpp"

using namespace std;

int main(){
    int pos;
    Lista<int> L1;

    L1.insereNoInicio(99);
    L1.insereNoFinal(150);
    L1.insereNoFinal(50);
    L1.insereNoFinal(45);
    L1.retiraElemento(50);
    L1.retiraDoFinal();
    L1.retiraDoInicio();
    L1.mostra();

    cout << endl << endl;
    do{
        cout << "Teste funcao 'umElemento': digite uma posicao a ser pesquisada: ";
        cin >> pos;
        if(pos > L1.numeroDeElementos())
            cout << "Posicao invalida!" << endl;
    }while(pos>L1.numeroDeElementos());
    cout << "O elemento na posicao " << pos << " eh " << L1.umElemento(pos);




    return 0;
}

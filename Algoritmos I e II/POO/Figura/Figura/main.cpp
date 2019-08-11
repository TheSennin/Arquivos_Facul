#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include "Quadrado.h"
#include "Circulo.h"
#include "Retangulo.h"

using namespace std;

int main()
{
    char resp = 'n'; int t=0, n=0;
    Figura *vetF[100];
    do{
    cout << "Criar qual figura? \n 1 - Quadrado \n 2 - Retangulo \n 3 - Circulo \n" << endl;
    cin >> t;
    switch (t){
        case 1:
            vetF[n] = new Quadrado;
            vetF[n] -> ler();
            n++;
            break;
        case 2:
            vetF[n] = new Retangulo;
            vetF[n] -> ler();
            n++;
            break;
        case 3:
            vetF[n] = new Circulo;
            vetF[n] -> ler();
            n++;
            break;
    };
    cout << "Registrar outra figura? [S/N] " << endl;
    fflush(stdin);
    resp=toupper(cin.get());
    }while(resp != 'N');

    return 0;
}

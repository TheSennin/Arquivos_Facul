#include <iostream>
#include "Quadrado.h"
using namespace std;

    float Quadrado::getLado(){
        return lado;
    }
    void Quadrado::setLado(float lado){
        this -> lado = lado;
    }
    void Quadrado::calculaArea(){
        area= lado*lado;
    }
    void Quadrado::calculaPerimetro(){
        perimetro= lado*4;
    }
    void Quadrado::ler(){
        cout << "Medida de lado? " << endl ;
        cin >> lado;
    };
    void Quadrado::imprimir(){
        cout << "Tipo: Quadrado " <<  endl;
        cout << "Lado: " << lado << endl;
        cout << "Area: " << area << endl;
        cout << "Perimetro: " << perimetro << "\n" << endl;
    }

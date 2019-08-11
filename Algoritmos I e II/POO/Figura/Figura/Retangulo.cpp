#include <iostream>
#include "Retangulo.h"
using namespace std;

    void Retangulo:: calculaArea(){
        area= largura*comprimento;
    }
    void Retangulo:: calculaPerimetro(){
        perimetro= (largura*2) + (comprimento*2);
    }
    void Retangulo:: setLargura(float largura){
        this -> largura = largura;
        calculaArea();
        calculaPerimetro();
    }
    void Retangulo:: setComprimento(float comprimento){
        this -> comprimento = comprimento;
        calculaArea();
        calculaPerimetro();
    }
    float Retangulo:: getLargura(){
        return largura;
    }
    float Retangulo:: getComprimento(){
        return comprimento;
    }
    void Retangulo::ler(){
        cout << "Medida de comprimento? " << endl ;
        cin >> comprimento;
        cout << "Medida de largura? ";
        cin >> largura;
    }
    void Retangulo:: imprimir(){
        cout << "Tipo: Retangulo " <<  endl;
        cout << "Largura: " << largura << endl;
        cout << "Comprimento: " << comprimento << endl;
        cout << "Area: " << area << endl;
        cout << "Perimetro: " << perimetro << "\n" << endl;
    }

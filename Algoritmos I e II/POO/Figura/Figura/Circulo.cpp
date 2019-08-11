#include <iostream>
#include "Circulo.h"
const double pi = 3.141516;
using namespace std;

    void Circulo:: calculaArea(){
        area= 3.141516*raio*raio;
        }
    void Circulo:: calculaPerimetro(){
        perimetro=2*3.141516*raio;
        }
    void Circulo:: setRaio(float raio){
        this -> raio = raio;
        calculaPerimetro();
        calculaArea();
        }
    float Circulo:: getRaio(){
        return raio;
        }
    void Circulo::ler(){
        cout << "Medida de raio? " << endl ;
        cin >> raio;
        }
    void Circulo:: imprimir(){
        cout << "Tipo: Circulo " <<  endl;
        cout << "raio: " << raio << endl;
        cout << "Area: " << area << endl;
        cout << "perimetro: " << perimetro << "\n" << endl;
    }

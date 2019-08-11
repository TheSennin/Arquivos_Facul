#ifndef CIRCULO_H_INCLUDED
#define CIRCULO_H_INCLUDED
#include "Figura.h"

class Circulo : public Figura{
    float raio;
public:
    void ler();
    void calculaArea();
    void calculaPerimetro();
    void setRaio(float);
    float getRaio();
    void imprimir();
};

#endif // CIRCULO_H_INCLUDED

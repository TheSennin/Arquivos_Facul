#ifndef QUADRADO_H_INCLUDED
#define QUADRADO_H_INCLUDED
#include "Figura.h"

class Quadrado : public Figura {
    float lado;
public:
    float getLado();
    void ler();
    void setLado(float);
    void calculaArea();
    void calculaPerimetro();
    void imprimir();
};

#endif // QUADRADO_H_INCLUDED

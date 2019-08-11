#ifndef RETANGULO_H_INCLUDED
#define RETANGULO_H_INCLUDED
#include "Figura.h"

class Retangulo : public Figura{
    float largura, comprimento;
public:
    void ler();
    void calculaArea();
    void calculaPerimetro();
    void setLargura(float);
    void setComprimento(float);
    float getLargura();
    float getComprimento();
    void imprimir();
};
#endif // RETANGULO_H_INCLUDED

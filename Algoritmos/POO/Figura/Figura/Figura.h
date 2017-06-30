#ifndef FIGURA_H_INCLUDED
#define FIGURA_H_INCLUDED

class Figura{
protected:
    float area, perimetro;
public:
    float getArea();
    float getPerimetro();
    virtual void calculaArea()=0;
    virtual void calculaPerimetro() =0;
    virtual void ler() =0;
    virtual void imprimir() =0;
};

#endif // FIGURA_H_INCLUDED

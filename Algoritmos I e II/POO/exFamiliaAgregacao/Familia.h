#ifndef FAMILIA_H_INCLUDED
#define FAMILIA_H_INCLUDED

#include <iostream>
#include <string>
#include "Pessoa.h"

using namespace std;

class Familia{
    int tamanho;
    string sobrenome;
    Pessoa * membro[5]; // póde usar vector !!!
  public:
    Familia();
    void setSobrenome(string);
    string getSobrenome();
    void adicionaMembro(Pessoa &);
    int getTamanho();
    void mostra();
};

#endif // FAMILIA_H_INCLUDED

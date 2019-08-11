#ifndef PESSOA_H_INCLUDED
#define PESSOA_H_INCLUDED

#include <iostream>
#include <string>

using namespace std;

class Pessoa{
    int idade;
    string nome;
  public:
    Pessoa();
    void setNome(string);
    string getNome();
    void setIdade(int);
    int getIdade();
    void mostra();
};

#endif // PESSOA_H_INCLUDED

#ifndef PESSOA_H_INCLUDED
#define PESSOA_H_INCLUDED
#include <iostream>
#include <string>

using namespace std;

class Pessoa {
 private:
     string nome;
     float cpf;
     int rg;
 public:
     void set_nome(string nome);
     void set_cpf(float cpf);
     void set_rg(int rg);

     string get_nome();
     float get_cpf();
     int get_rg();

};

#endif // PESSOA_H_INCLUDED

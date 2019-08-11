#include "Pessoa.h"
#include <iostream>
#include <string>

using namespace std;

void Pessoa::set_nome(string nome){
      this -> nome = nome;
}

void Pessoa::set_cpf(float cpf){
      this -> cpf = cpf;
}

void Pessoa::set_rg(int rg){
      this -> rg = rg;
}

string Pessoa::get_nome(){
    return nome;
}

float Pessoa::get_cpf(){
    return cpf;
}

int Pessoa::get_rg(){
    return rg;
}






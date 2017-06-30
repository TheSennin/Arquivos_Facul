#include "Pessoa.h"
#include <string.h>
#include <iostream>

using namespace std;

void Pessoa::set_nome(string nome){
    this-> nome = nome;
}

void Pessoa::set_telefone(int telefone){
    this ->telefone = telefone;
}

void Pessoa::set_cpf(int cpf){
    this-> cpf = cpf;
}

void Pessoa::set_rg(int rg){
    this ->rg = rg;
}

string Pessoa::get_nome(){
   return nome;
}

int Pessoa::get_telefone(){
   return telefone;
}

int Pessoa::get_cpf(){
   return cpf;
}

int Pessoa::get_rg(){
   return rg;
}

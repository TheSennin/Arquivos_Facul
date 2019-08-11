#include <iostream>
#include "Pessoa.h"

using namespace std;

Pessoa::Pessoa(){
    idade=0;
    nome="";
}
void Pessoa::setNome(string nome){
  this->nome = nome;
}
string Pessoa::getNome(){
  return this->nome;
}
void Pessoa::setIdade(int idade){
    this->idade = idade;
}
int Pessoa::getIdade(){
    return idade;
}
void Pessoa::mostra(){
    cout << "Pessoa: " << this->nome << " " << this->idade << endl;
}

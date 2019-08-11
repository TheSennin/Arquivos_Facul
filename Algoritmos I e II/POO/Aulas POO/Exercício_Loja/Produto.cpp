#include "Produto.h"
#include <iostream>
#include <string>

using namespace std;

Produto::Produto(){
   string nome = "";
   float preco = 0;
}

Produto::Produto(string nome, float preco){
   this -> nome = nome;
   this -> preco = preco;
}

void Produto::set_nome(string nome){
   this -> nome = nome;
}

void Produto::set_preco(float preco){
   this -> preco = preco;
}

string Produto::get_nome(){
   return nome;
}

float Produto::get_preco(){
   return preco;
}










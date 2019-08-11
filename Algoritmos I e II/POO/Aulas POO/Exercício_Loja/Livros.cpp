#include "Livros.h"
#include <iostream>
#include <string>

using namespace std;

Livros::Livros(){
   autor = "";
}

Livros::Livros(string nome, float preco, string autor) : Produto(nome, preco){
   this -> autor = autor;
}

void Livros::set_autor(string autor){
   this -> autor = autor;
}

string Livros::get_autor(){
   return autor;
}

void Livros::mostra(){
   cout << "Nome: "  << get_nome()  << endl;
   cout << "Preco: " << get_preco() << " R$" << endl;
   cout << "autor: " << get_autor() << endl;
}




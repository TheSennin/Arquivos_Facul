#include "DVDS.h"
#include <iostream>
#include <string>

DVDS::DVDS(){
   duracao = 0;
}

DVDS::DVDS(string nome, float preco, int duracao) : Produto(nome, preco){
   this -> duracao = duracao;
}

void DVDS::set_duracao(int numFaixas){
   this -> duracao = duracao;
}

int DVDS::get_duracao(){
   return duracao;
}

void DVDS::mostra(){
   cout << "Nome: "   << get_nome()    << endl;
   cout << "Preco: "  << get_preco()  << " R$" << endl;
   cout << "Duracao " << get_duracao() << endl;

}

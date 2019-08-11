#include "CDS.h"
#include <iostream>
#include <string>

using namespace std;

CDS::CDS(){
   numFaixas = 0;
}

CDS::CDS(string nome, float preco, int numFaixas) : Produto(nome, preco){
   this -> numFaixas = numFaixas;
}

void CDS::set_numFaixas(int numFaixas){
   this -> numFaixas = numFaixas;
}

int CDS::get_numFaixas(){
   return numFaixas;
}

void CDS::mostra(){
   cout << "Nome: "  << get_nome()  << endl;
   cout << "Preco: " << get_preco() << " R$" << endl;
   cout << "Numero de Faixas " << get_numFaixas() <<endl;
}

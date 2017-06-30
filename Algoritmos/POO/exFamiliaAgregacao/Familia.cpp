#include <iostream>
#include "Familia.h"

using namespace std;

Familia::Familia(){
    tamanho=0;
    sobrenome="";
}
int Familia::getTamanho(){
    return tamanho;
}
void Familia::setSobrenome(string s){
  sobrenome = s;
}
string Familia::getSobrenome(){
  return sobrenome;
}
void Familia::adicionaMembro(Pessoa &p){
    if(tamanho<5){
        membro[tamanho]=&p;
        tamanho++;
    }
}
void Familia::mostra(){
    cout << "Familia " << sobrenome << " :\n";
    cout << tamanho << " membros." << endl;
    for(int i=0;i<tamanho;i++){
        membro[i]->mostra();
        cout << "Endereco: " << membro[i] << endl;
    }
}









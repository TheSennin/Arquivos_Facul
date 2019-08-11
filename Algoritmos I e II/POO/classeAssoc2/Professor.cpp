#include "Professor.h"
//class Orientacao;
Professor::Professor(string nome, int idade, long matricula){
    this->nome = nome;
    this->idade = idade;
    this->matricula = matricula;
}
string Professor::getNome(){
    return this->nome;
}
int Professor::getIdade(){
    return this->idade;
}
long Professor::getMatricula(){
    return this->matricula;
}
void Professor::addOrientacao(Orientacao& o){
    orientacoes.push_back(&o);
}
void Professor::delOrientacao(Aluno& a){

}
void Professor::mostra(){
    cout << "\n---------------------------------\n";
    cout << "Professor: " << getNome();
    cout << "\nIdade: " << getIdade();
    cout << "\nMatricula: " << getMatricula();
}

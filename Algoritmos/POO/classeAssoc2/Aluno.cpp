#include "Aluno.h"
Aluno::Aluno(string nome, string curso, int idade, long matricula){
    this->nome = nome;
    this->curso = curso;
    this->idade = idade;
    this->matricula = matricula;
    orientacao = NULL;
}
string Aluno::getNome(){
    return this->nome;
}
string Aluno::getCurso(){
    return this->curso;
}
int Aluno::getIdade(){
    return this->idade;
}
long Aluno::getMatricula(){
    return this->matricula;
}
void Aluno::setOrientacao(Orientacao& o){
    orientacao = &o;
}
void Aluno::mostra(){
    cout << "\n---------------------------------\n";
    cout << "Aluno: " << getNome();
    cout << "\nIdade: " << getIdade();
    cout << "\nMatricula: " << getMatricula();
    cout << "\nCurso: " << getCurso();
    cout << "\n---------------------------------\n\n";
}

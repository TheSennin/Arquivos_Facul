#include "Orientacao.h"
Orientacao::Orientacao(Professor& p, Aluno& a, string tituloTrabalho){
    this->tituloTrabalho = tituloTrabalho;
    orientador = &p;
    orientando = &a;
}
string Orientacao::getTituloTrabalho(){
    return tituloTrabalho;
}
Aluno Orientacao::getOrientando(){
    return *orientando;
}
Professor Orientacao::getOrientador(){
    return *orientador;
}
void Orientacao::setTituloTrabalho(string tituloTrabalho){
    this->tituloTrabalho = tituloTrabalho;
}
void Orientacao::setOrientador(Professor& p){
    orientador = &p;
}
void Orientacao::setOrientando(Aluno& a){
    orientando = &a;
}
void Orientacao::mostra(){
    cout << "---------------------------------\nOrientacao\n";
    cout << "---------------------------------\nTitulo do trabalho: " << getTituloTrabalho();
    orientador->mostra();
    orientando->mostra();
}

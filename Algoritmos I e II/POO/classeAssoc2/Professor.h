#ifndef PROFESSOR_H
#define PROFESSOR_H
#include "Aluno.h"
#include <iostream>
#include <string>
#include <vector>
using namespace std;
class Orientacao;

class Professor{
    string nome;
    int idade;
    long matricula;
    vector<Orientacao *> orientacoes; // relacao com a classe de assoc
    public:
        Professor(string nome = "", int idade = 0, long matricula = 0);
        string getNome();
        int getIdade();
        long getMatricula();
        void addOrientacao(Orientacao&);
        void delOrientacao(Aluno &);
        void mostra();
};
#endif /* PROFESSOR_H */


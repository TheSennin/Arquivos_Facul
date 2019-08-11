#ifndef ALUNO_H
#define ALUNO_H
#include <iostream>
#include <string>
class Orientacao;
using namespace std;
class Aluno{
    string nome;
    string curso;
    int idade;
    long matricula;
    Orientacao* orientacao; // esta ou nao sendo orientado
    public:
        Aluno(string nome = "", string curso = "", int idade = 0, long matricula = 0);
        string getNome();
        string getCurso();
        int getIdade();
        long getMatricula();
        void setOrientacao(Orientacao&);
        void mostra();
};
#endif /* ALUNO_H */


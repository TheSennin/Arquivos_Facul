#ifndef PESSOA_H_INCLUDED
#define PESSOA_H_INCLUDED
#include <string.h>
#include <iostream>

using namespace std;

class Pessoa {
    private:
        string nome;
        int telefone;
        int cpf;
        int rg;

    public:
        void set_nome(string nome);
        void set_telefone(int telefone);
        void set_cpf(int cpf);
        void set_rg(int rg);

        string get_nome();
        int get_telefone();
        int get_cpf();
        int get_rg();

};

#endif // PESSOA_H_INCLUDED

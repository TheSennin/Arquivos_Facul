#ifndef PRODUTO_H_INCLUDED
#define PRODUTO_H_INCLUDED
#include <string>
#include <iostream>

using namespace std;

class Produto {
        string nome;
        float preco;
     public:
        Produto();
        Produto(string, float);
        void set_nome(string);
        void set_preco(float);
        string get_nome();
        float get_preco();
        virtual void mostra() = 0;
};

#endif // PRODUTO_H_INCLUDED

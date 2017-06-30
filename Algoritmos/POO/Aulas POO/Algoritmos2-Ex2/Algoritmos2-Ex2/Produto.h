#ifndef PRODUTO_H_INCLUDED
#define PRODUTO_H_INCLUDED

#include <string>

class Produto
{
    private:
        std::string nome;
        float preco;
    public:
        Produto();
        Produto(std::string, float);
        void set_nome(std::string);
        void set_preco(float);
        std::string get_nome();
        float get_preco();
        virtual void mostra()=0;
};

#endif // PRODUTO_H_INCLUDED

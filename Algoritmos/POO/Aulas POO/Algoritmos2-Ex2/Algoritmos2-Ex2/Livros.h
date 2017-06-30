#ifndef LIVROS_H_INCLUDED
#define LIVROS_H_INCLUDED

#include "Produto.h"

class Livros : public Produto
{
    private:
        std::string autor;
    public:
        Livros();
        Livros(std::string, float, std::string);
        void set_autor(std::string);
        std::string get_autor();
        void mostra();
};

#endif // LIVROS_H_INCLUDED

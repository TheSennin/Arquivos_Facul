#ifndef LIVROS_H_INCLUDED
#define LIVROS_H_INCLUDED
#include "Produto.h"


class Livros : public Produto {
       string autor;
     public:
       Livros();
       Livros(string, float, string);
       void set_autor(string);
       string get_autor();
       void mostra();
};


#endif // LIVROS_H_INCLUDED

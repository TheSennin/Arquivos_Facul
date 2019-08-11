#ifndef DVDS_H_INCLUDED
#define DVDS_H_INCLUDED

#include <string>
#include "Produto.h"

class DVDS : public Produto
{
    private:
        int duracao;
    public:
        DVDS();
        DVDS(std::string, float, int);
        void set_duracao(int);
        int get_duracao();
        void mostra();
};

#endif // DVDS_H_INCLUDED

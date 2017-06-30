#ifndef CDS_H_INCLUDED
#define CDS_H_INCLUDED

#include "Produto.h"

class CDS : public Produto
{
    private:
        int num_faixas;
    public:
        CDS();
        CDS(std::string, float, int);
        void set_num_faixas(int);
        int get_num_faixas();
        void mostra();
};

#endif // CDS_H_INCLUDED

#ifndef DVDS_H_INCLUDED
#define DVDS_H_INCLUDED
#include "Produto.h"

class DVDS : public Produto {
       int duracao;
     public:
       DVDS();
       DVDS(string, float, int);
       void set_duracao(int);
       int get_duracao();
       void mostra();
};


#endif // DVDS_H_INCLUDED

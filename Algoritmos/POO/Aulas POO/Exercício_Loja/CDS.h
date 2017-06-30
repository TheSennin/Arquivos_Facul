#ifndef CDS_H_INCLUDED
#define CDS_H_INCLUDED
#include "Produto.h"

class CDS : public Produto {
      int numFaixas;
    public:
      CDS();
      CDS(string, float, int);
      void set_numFaixas(int);
      int get_numFaixas();
      void mostra();
};

#endif // CDS_H_INCLUDED

#ifndef ALUNO_H_INCLUDED
#define ALUNO_H_INCLUDED
#include "Pessoa.h"

class Aluno : public Pessoa {
 private:
    int matricula;
 public:
    void set_matricula(int matricula);
    int get_matricula();

};


#endif // ALUNO_H_INCLUDED

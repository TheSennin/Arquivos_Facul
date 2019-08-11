#include "Orientacao.h"
int main(){
    Professor professor("Eduardo", 41, 15151);
    Aluno aluno("Ana", "Computacao", 21, 201713333);
    Orientacao orientacao(professor, aluno, "TCC 2017-1");
    orientacao.mostra();
    return 0;
}


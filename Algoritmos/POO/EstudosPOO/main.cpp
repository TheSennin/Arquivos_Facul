#include <iostream>
#include "tipo_aluno.h"

using namespace std;

int main(){
    char nome[50];
    tipo_aluno Aluno1;

    if(Aluno1.set_nome("Fulano da Silva")){
        Aluno1.get_nome(nome);
        if(Aluno1.set_nota(5.5,0)){
           cout<<"Nota 1: "<<Aluno1.get_nota(0)<<endl;
        }else{
           cout<<"Nao foi possivel alterar a nota!";
        }
    }

    if(Aluno1.set_nota(7,1)){
           cout<<"Nota 2: "<<Aluno1.get_nota(1)<<endl;
        }else{
           cout<<"Nao foi possivel alterar a nota!";
        }

    if(Aluno1.set_nota(8,2)){
           cout<<"Nota 3: "<<Aluno1.get_nota(2)<<endl;
        }else{
           cout<<"Nao foi possivel alterar a nota!";
        }

    return 0;
}

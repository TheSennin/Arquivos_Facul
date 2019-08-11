#include <iostream>
#include "Pessoa.h"
#include "Aluno.h"

using namespace std;

int main(){
    Pessoa Ciclano;
    Aluno Fulano;

    Fulano.set_nome("Gustavo Xavier Pereira");
    Fulano.set_cpf(11331243998);
    Fulano.set_rg(6100298);
    Fulano.set_matricula(1312345);
    cout << Fulano.get_nome() << endl;
    cout << Fulano.get_cpf() << endl;
    cout << Fulano.get_rg() << endl;
    cout << Fulano.get_matricula() << endl <<endl;

    Ciclano.set_nome("José João Japão");
    Ciclano.set_cpf(11331243998);
    Ciclano.set_rg(6100298);
    cout << Ciclano.get_nome() << endl;
    cout << Ciclano.get_cpf() << endl;
    cout << Ciclano.get_rg() << endl;

    return 0;
}

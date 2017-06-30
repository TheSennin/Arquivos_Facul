#include "Aluno.h"
#include <iostream>
#include <string>

using namespace std;

void Aluno::set_matricula(int matricula){
    this -> matricula = matricula;
}

int Aluno::get_matricula(){
    return matricula;
}

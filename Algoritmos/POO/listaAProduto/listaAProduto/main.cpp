#include <iostream>
#include "Produto.h"

using namespace std;

int main()
{
    Produto p1, p2;
    p1.setNome("banana");
    p1.setPrecoCusto(1.50);
    p1.setPrecoVenda(2.00);
    p1.calculaMargemLucro();
    cout << p1.getNome() <<"  "<< p1.getPrecoCusto() <<"  "<< p1.getPrecoVenda() <<"  "<< p1.getMargemLucro() << endl;
    cout << p1.getMargemLucroPorcentagem() <<"%" <<endl;

    p2.setNome("maca");
    p2.setPrecoCusto(2.00);
    p2.setPrecoVenda(3.00);
    p2.calculaMargemLucro();
    cout << p2.getNome() <<"  "<< p2.getPrecoCusto() <<"  "<< p2.getPrecoVenda() <<"  "<< p2.getMargemLucro() << endl;
    cout << p2.getMargemLucroPorcentagem() <<"%" <<endl;
    return 0;
}

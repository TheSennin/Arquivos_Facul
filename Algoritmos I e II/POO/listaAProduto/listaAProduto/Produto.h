/*
1)	Implemente a classe Produto, com atributos nome, pre�o de custo, pre�o de venda,
margem de lucro, e os m�todos get e set para os atributos acima.
Modifique o m�todo setPrecoVenda() para que o pre�o de venda n�o seja inferior ao pre�o de compra.
Caso isso aconte�a, exiba uma mensagem alertando o usu�rio.
Ainda, crie um m�todo chamado calcularMargemLucro() que calcular� a margem de lucro do produto,
um m�todo chamado getMargemLucroPorcentagem() que retornar� a margem de lucro como percentual.
*/
#ifndef PRODUTO_H_INCLUDED
#define PRODUTO_H_INCLUDED

#include <iostream>
#include <string>
using namespace std;

class Produto{
    string nome;
    float precoCusto, precoVenda, margemLucro;
    // O CORRETO SERIA o atributo margemLucro ser VIRTUAL, ou seja, nao declarado e apenas calculado!!!!!
public:
    void setNome(string nome);
    void setPrecoCusto(float p);
    void setPrecoVenda(float p);
    void calculaMargemLucro();
    string getNome();
    float getPrecoCusto();
    float getPrecoVenda();
    float getMargemLucro();
    float getMargemLucroPorcentagem();
};

#endif // PRODUTO_H_INCLUDED


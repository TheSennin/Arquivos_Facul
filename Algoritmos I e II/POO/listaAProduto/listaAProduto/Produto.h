/*
1)	Implemente a classe Produto, com atributos nome, preço de custo, preço de venda,
margem de lucro, e os métodos get e set para os atributos acima.
Modifique o método setPrecoVenda() para que o preço de venda não seja inferior ao preço de compra.
Caso isso aconteça, exiba uma mensagem alertando o usuário.
Ainda, crie um método chamado calcularMargemLucro() que calculará a margem de lucro do produto,
um método chamado getMargemLucroPorcentagem() que retornará a margem de lucro como percentual.
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


/*
1)	Implemente a classe Produto, com atributos nome, pre�o de custo, pre�o de venda,
margem de lucro, e os m�todos get e set para os atributos acima.
Modifique o m�todo setPrecoVenda() para que o pre�o de venda n�o seja inferior ao pre�o de compra.
Caso isso aconte�a, exiba uma mensagem alertando o usu�rio.
Ainda, crie um m�todo chamado calcularMargemLucro() que calcular� a margem de lucro do produto,
um m�todo chamado getMargemLucroPorcentagem() que retornar� a margem de lucro como percentual.
*/
#include <iostream>
#include <string>
#include "Produto.h"

using namespace std;

void Produto::setNome(string nome){
    this->nome = nome;
}

void Produto::setPrecoCusto(float p){
    precoCusto = p;
}
void Produto::setPrecoVenda(float p){
    if(p >= precoCusto)
        precoVenda = p;
    else {
        precoVenda = precoCusto; // poderia atribuir 0 ou -1 para indicar q deu problema.
        cout << "ALERTA: Preco Venda nao aceito"<< endl;
    }
}
void Produto::calculaMargemLucro(){
    margemLucro = precoVenda - precoCusto;
}
string Produto::getNome(){
    return nome;
}
float Produto::getPrecoCusto(){
    return precoCusto;
}
float Produto::getPrecoVenda(){
    return precoVenda;
}
float Produto::getMargemLucro(){
    return margemLucro;
}
float Produto::getMargemLucroPorcentagem(){ // alterado apos a aula
    if(precoCusto<precoVenda)
        return margemLucro*100/precoCusto; // calcula se precos sao diferentes
    return 0;                               // senao margem de lucro eh 0
}





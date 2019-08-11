#include "Produto.h"
#include <string>

Produto::Produto()
{
    this->nome = "";
    this->preco = 0;
}

Produto::Produto(std::string nome, float preco)
{
    this->nome = nome;
    this->preco = preco;
}

void Produto::set_nome(std::string nome)
{
    this->nome = nome;
}

void Produto::set_preco(float preco)
{
    this->preco = preco;
}

float Produto::get_preco()
{
    return this->preco;
}

std::string Produto::get_nome()
{
    return this->nome;
}

#include <iostream>
#include "DVDS.h"

DVDS::DVDS()
{
    this->duracao;
}

DVDS::DVDS(std::string nome, float preco, int duracao) : Produto(nome,preco)
{
    this->duracao = duracao;
}

void DVDS::set_duracao(int duracao)
{
    this->duracao = duracao;
}

int DVDS::get_duracao()
{
    return this->duracao;
}

void DVDS::mostra()
{
    std::cout << "Nome: " << this->get_nome() << std::endl;
    std::cout << "Preco: " << this->get_preco() << std::endl;
    std::cout << "Duracao: " << this->duracao << std::endl;
}

#include "CDS.h"
#include <iostream>

CDS::CDS()
{
    this->num_faixas = 0;
}

CDS::CDS(std::string nome, float preco, int num_faixas) : Produto(nome, preco)
{
    this->num_faixas = 0;
}
void CDS::set_num_faixas(int num_faixas)
{
    this->num_faixas = num_faixas;
}
int CDS::get_num_faixas()
{
    return this->num_faixas;
}
void CDS::mostra()
{
    std::cout << "Nome: " << this->get_nome() << std::endl;
    std::cout << "Preco: " << this->get_preco() << std::endl;
    std::cout << "Numero de Faixas: " << this->get_num_faixas() << std::endl;
}

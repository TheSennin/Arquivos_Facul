#include <string>
#include <iostream>
#include "Livros.h"

Livros::Livros()
{
    this->autor = "";
}

Livros::Livros(std::string nome, float preco, std::string autor) : Produto(nome, preco)
{
    this->autor = autor;
}

void Livros::set_autor(std::string autor)
{
    this->autor = autor;
}

std::string Livros::get_autor()
{
    return this->autor;
}

void Livros::mostra()
{
    std::cout << "Nome: " << this->get_nome() << std::endl;
    std::cout << "Preco: " << this->get_preco() << std::endl;
    std::cout << "Autor: " << this->get_autor() << std::endl;
}

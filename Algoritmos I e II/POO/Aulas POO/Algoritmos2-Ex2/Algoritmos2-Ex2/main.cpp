#include <ostream>
#include <iostream>
#include "DVDS.h"
#include "CDS.h"
#include "Livros.h"

std::ostream& operator << (std::ostream &out, Produto& obj)
{
    obj.mostra();
    return out;
}

int main()
{
    std::cout << "Hello World";
    return 0;
}

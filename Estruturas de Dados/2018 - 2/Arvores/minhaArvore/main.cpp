#include <iostream>
#include "ABB.cpp"

using namespace std;

int main()
{
    ABB<int> arvoreInt;

    arvoreInt.insertElement(10);
    arvoreInt.show();
    cout << endl;
    arvoreInt.insertElement(15);
    arvoreInt.show();
    cout << endl;
    arvoreInt.insertElement(5);
    arvoreInt.show();
    cout << endl;
    if (arvoreInt.hasElement(5))
        cout << "Elemento existe" << endl;
    else
        cout << "Elemento nao existe" << endl;

    ABB<char> arvoreChar;

    arvoreChar.insertElement('A');
    arvoreChar.insertElement('B');
    arvoreChar.insertElement('C');
    arvoreChar.insertElement('D');
    arvoreChar.insertElement('E');
    return 0;
}

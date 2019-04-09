#include <iostream>
#include "Pilha.cpp"

using namespace std;

int main()
{
    Pilha<int> pilha[50];
    int i, elemento;


    cout << "elemento = ";
    cin >> elemento;
    while (elemento != -1)
    {
        pilha[elemento / 10].empilha(elemento);
        cout << "elemento = ";
        cin >> elemento;
    }

    for (i = 0; i < 50; i++)
        if (!pilha[i].ehVazia())
        {
            cout << "pilha " << i+1 << " = ";
            pilha[i].mostra();
            cout << endl;
        }
    return 0;
}

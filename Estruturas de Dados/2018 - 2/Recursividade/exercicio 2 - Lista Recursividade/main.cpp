
//2. Desenvolva uma fun��o recursiva para calcular a soma dos n�meros naturais de 1 a n.
#include <iostream>

using namespace std;

int Soma(int n){
    if(n == 2){
        return 3;
    }
    else{
        return n + Soma(n-1);
    }
}

int main()
{
    int n;
    cout << "Entre com n (condicao de parada): ";
    cin >> n;
    cout << "A soma de 1 a " << n << " eh " << Soma(n);
    return 0;
}

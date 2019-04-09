#include <iostream>

using namespace std;

int fatorial(int n){
        if(n == 0){
            return 1;
        }
        else
            return n * fatorial(n - 1);
}
int main()
{
int n;
    cout << "Entre com o numero a ser calculado: ";
    cin >> n;
    cout << "O fatorial de " << n << " eh " << fatorial(n);
    return 0;
}

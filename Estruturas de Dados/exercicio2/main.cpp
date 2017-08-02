#include <iostream>

using namespace std;

void calcula(int n, int *resultado){
    if(n==1){
        *resultado = 1;
    }
    else{
        calcula(n-1, resultado);
        *resultado += n;
    }
}

int main(){
    int n, resultado;
    cout << "Informe n: ";
    cin >> n;
    calcula(n, &resultado);
    cout << "o resultado eh: " << resultado;

    return 0;
}

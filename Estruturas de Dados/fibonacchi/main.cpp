#include <iostream>

using namespace std;

int fibonacchi(int n){
    if(n == 1)
        return 0;
    else if(n == 2)
        return 1;
    else
        return fibonacchi(n-1) + fibonacchi(n-2);
};

int main(){
    int pos;
    cout << "informe a posicao: " << endl;
    cin >> pos;
    cout << "Resultado na posicao: " << pos << " eh: " << fibonacchi(pos);
    return 0;
}

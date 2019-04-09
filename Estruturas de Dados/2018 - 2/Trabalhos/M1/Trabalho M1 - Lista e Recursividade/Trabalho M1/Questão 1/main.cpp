#include <iostream>
#include <cmath>

using namespace std;

//Elabore uma fun��o recursiva que retorne a multiplica��o de dois n�meros inteiros quaisquer,
//a partir dessa t�cnica.

int multiplicacao(int X, int Y){
    if(floor(X) == 1){  //quando X chegar a 1 (arredondado), mostra os valores e retorna o Y
        cout << X;
        cout << "         " << Y << "       " << Y << endl;
        return Y;
    }
    else
        if(X%2 != 0){ //Se X for �mpar, mostra os valores e retorna a soma de Y + nova chamada da func�o.
            cout << X;
            cout << "         " << Y << "        " << Y << endl;
            return Y + multiplicacao(X/2, Y*2);
        }
        else{  //Sen�o, apenas mostra os valores e executa nova chamada da fun��o.
            cout << X;
            cout << "         " << Y << "       " << endl;
            return multiplicacao(X/2,Y*2);
        }
}

int main(){
    int a,b;
    cout << "Primeiro numero: ";
    cin >> a;
    cout << endl << "Segundo numero: ";
    cin >> b;
    cout << "Soma:                " << multiplicacao(a,b);
    cout << endl;
    cout << endl;
    return 0;
}

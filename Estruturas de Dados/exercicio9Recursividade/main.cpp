#include <iostream>

using namespace std;

void verificaExistencia(int x[], int y, int n){
    if(n >= 0){
        if(y==x[n]){
            cout << "Existe!";
        }
        else{
            verificaExistencia(x, y, n-1);
        }
    }else{
        cout << "nao existe!";
    }

}

int main(){
    int y, x[]={1,2,3,4,5};
    cout << "Y: ";
    cin >> y;
    /*for(int i=0;i<5;i++){
        cout << x[i] << " ";
    }*/
    verificaExistencia(x, y, 5);
    return 0;
}

#include <iostream>
#include <cmath>

using namespace std;

int lin,col,i,j,m,n;
float matA[3][3], matB[3][3], matC[3][3];
bool simetrica=true;
int main()
{
for(lin=0;lin<3;lin++){
    for(col=0;col<3;col++){
    cout <<"Informe o elemento ["<<lin+1<<","<<col+1<<"] para a matriz A: ";
    cin >> matA[lin][col];
    }
}
for(lin=0;lin<3;lin++){
    for(col=0;col<3;col++){
    cout <<"Informe o elemento ["<<lin+1<<","<<col+1<<"] para a matriz B: ";
    cin >> matB[lin][col];
    }
}
for(lin=0;lin<3;lin++){
    for(m=0;m<3;m++){
        for(col=0;col<3;col++){
    matC[m][lin] = matC[m][lin]+matA[lin][col]*matB[col][m];
        }
    }
}
cout <<endl<<"Multiplicacao AxB = "<< endl;
for(m=0; m < 3; m++) {
    for(lin=0; lin < 3; lin++) {
cout << matC[lin][m] << " ";
}
cout << endl;
}
cout <<endl<<"Transposta de A = "<< endl;
for(lin=0; lin < 3; lin++) {
    for(col=0; col < 3; col++) {
cout << matA[col][lin] << " ";
}
cout << endl;
}
cout <<endl<<"Transposta de B = "<< endl;
for(lin=0; lin < 3; lin++) {
    for(col=0; col < 3; col++) {
cout << matB[col][lin] << " ";
}
cout << endl;
}
for (i=0;i<3;i++){
    for (j=0;j<3;j++){
       if (matC[i][j] != matC[j][i]){
        simetrica = false;
break;
       }
    }
}
if (simetrica){
    cout<<" eh simetrica";
}
else
    cout<<"nao simetrica";

    return 0;
}

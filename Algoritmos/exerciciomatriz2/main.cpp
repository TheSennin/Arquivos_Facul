#include <iostream>
#include <cmath>

using namespace std;

int main()
{
int n,j;
int lin,col,MatrizA[10][10];

lin = 0;
col = 0;
n = 2;
j = 2;
for (n=2;n<11;n++)
     for (j=2;j<11;j++)
     {
     cout << "Informe o elemento: ["<<lin+1<<","<<col+1<<"]"<<endl;
     cin >> MatrizA[lin][col];
     }
    return 0;
}

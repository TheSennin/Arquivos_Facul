#include <iostream>

using namespace std;

int i,j,m,n;
int main()
{
float matA[m][n];
    cout<<"Informe n lin"<<endl;
    cin >> m;
    cout<<"Informe n col"<<endl;
    cin >> n;
for(i=0;i<m;i++){
    for(j=0;j<n;j++){
    cout << "Temperaturas:" << endl;
    cin >> matA[i][j];
    }
}

for(i=0; i<m; i++) {
    for(j=0; j<n; j++) {
cout << matA[i][j] << " ";
}
cout << endl;
}





    return 0;
}

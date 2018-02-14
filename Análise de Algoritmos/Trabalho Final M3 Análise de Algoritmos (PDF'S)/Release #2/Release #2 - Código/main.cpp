#include <iostream>
#include <fstream>

using namespace std;

int main(){
    FILE *infile;
    char mem[20][20][20];
    int w,h,z,comp=0;

    infile = fopen("10x12x13.dat","r"); //leitura do arquivo
    if(infile==NULL){
        cout << "Falha ao abrir o arquivo." << endl;
        return 1;
    }else{
        for(int z=0;z<13;z++){
            for(int h=0;h<12;h++){
                for(int w=0;w<11;w++){
                    mem[w][h][z] = fgetc(infile); //varre o arquivo para popular o vetor
                    if (mem[w][h][z] == '1')  //se houver o caracter 1, acrescenta comprimento
                        comp++;
                }
            }
        }
        fclose(infile);
    }
    w=0;
    h=0;
    z=0;
    int i=1;
    bool coordw=true, coordh=true, coordz=true;
    do{
        if (w<11 && mem[w+1][h][z] == '1' && coordw == true){
            i++;
            w++;
            coordh = true;
            coordz = true;
        }
        else
        if (w>0 && mem[w-1][h][z] == '1'){
            w--;
            i++;
            coordw = false;
            coordh = true;
            coordz = true;
        }
        if (h<12 && mem[w][h+1][z] == '1' && coordh == true){
            i++;
            h++;
            coordw = true;
            coordz = true;
        }
        else
        if (h>0 && mem[w][h-1][z] == '1'){
            i++;
            h--;
            coordw = true;
            coordh = false;
            coordz = true;
        }
        if (z<13 && mem[w][h][z+1] == '1' && coordz == true){
            i++;
            z++;
            coordw = true;
            coordh = true;
        }
        else
        if (z>0 && mem[w][h][z-1] == '1'){
            i++;
            z--;
            coordw = true;
            coordh = true;
            coordz = false;
        }
    }while (i<comp);

    cout << "Comprimento: " << comp << endl;
    cout << "W = " << w << endl;
    cout << "H = " << h << endl;
    cout << "Z = " << z << endl;

    return 0;
}

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    ifstream arq;
    ofstream arq2;
    char ch;
    string nomearq, nomearq2;
    cout << "\nNome do arquivo a ser aberto";
    getline(cin, nomearq);
    arq.open(nomearq.c_str());

    nomearq2 = nomearq;
    for(int i=nomearq2.size()-1;i>0;i--)
    {
        if(nomearq2.at(i)!='.')
        {
            nomearq2.at(i)='x';
        }
        else break;
    }
    cout << nomearq2 << endl;
    arq2.open(nomearq2.c_str());
    //Cria e abre pra leitura

    if(!arq||!arq2)
    {
        cout << "Não foi possivel abrir o arquivo";
        cin.get();
        return 0;
    }
    while(arq.get(ch)) //enquanto le caracter
    {
        if(ch!='/') arq2<<ch; //grava caracter normal no arq2
        else{ //leitura anterior indicou possivel comentario
            arq.get(ch); // le segundo caracter
            if(ch!=';'&& ch!='*'){ // indica que nao era caractere
                arq2<<'/'<<ch;
            }
            else //confirmando comentario
                if(ch=='/'){ //de linha
                while(arq.get()!='\n'); // le-descarta resto de linha
                arq2<<'\n'; //grava o final para pular linha arq2
            }
            else{ //de bloco, sai procurando */ agora
                do{
                    arq.get(ch); // le caracter
                    if(ch=='*');
                        arq.get(ch); // le segundo caracter
                        if(ch=='/') break;
                } // achou
            }while(1);
        }
        }
    }
    return 0;
}

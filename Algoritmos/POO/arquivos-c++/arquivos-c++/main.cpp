#include <iostream>
#include <fstream>
#include <string>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

void contaLinha(){
    ifstream fin;
    string linha, nomearq;
    int i=0;
    cout << "\nNome do arquivo a ser aberto: ";
    getline(cin,nomearq);
    fin.open(nomearq.c_str());
    if (!fin) {
        cout << "Nao foi possível abrir o arquivo.";
        cin.get();
    }

    while (getline(fin,linha)){
        cout << ++i << " " << linha;
        cin.get();
    }
    fin.close();
}

void criaArquivo(){
    string nomearq,conteudo;
    cout << "\nInforme o nome do arquivo a ser criado: ";
    getline(cin,nomearq);
    ofstream file;
    file.open(nomearq.c_str(), ios::binary);
    if(!file){
        cout << "Nao foi possivel criar o arquivo.";
    }
    else {
       cout << "\nArquivo criado com sucesso!" << endl;
       cout << "\nO que deseja escrever no arquivo?";
       getline(cin,conteudo);
       file << conteudo;
    }
}

void lerChaves(){
    char carac;
    string nomearq;
    int contChaves=0;

    cout << "\nNome do arquivo a ser aberto: ";
    getline(cin,nomearq);

    ifstream f(nomearq.c_str());
    if(!f) {
        cout << "Não foi possível abrir o arquivo.";
        system("pause");
    }
    while (f.get(carac)){
        if(carac=='}') contChaves++;
        else if(carac=='{') contChaves--;
    }
    if(contChaves == 0){
        cout << "\nNumero de chaves OK.";
    }
    else {
        cout << "\nNumero de chaves inconsistente.";
    }
    f.close();
}

void lerOpcao(){
    int opcao;
    cout << "Informe a opção desejada: 1- criar arquivo, 2 - ler arquivo, 3 - ler chaves " << endl;
    opcao = getch();
    switch (opcao) {
        case '1':
            criaArquivo();
            break;
        case '2':
            contaLinha();
            break;
        case '3':
            lerChaves();
            break;
        default:
            system("cls");
            cout << "Opcao invalida!";
            break;

    }
}

int main(){

    lerOpcao();

    return 1;
}

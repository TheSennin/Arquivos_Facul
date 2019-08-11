#include <iostream>
#include "Pessoa.h"
#include "Familia.h"

using namespace std;

int main(){
	Pessoa alguem;
    alguem.setNome("Maria");
	alguem.setIdade(35);
	alguem.mostra();
	cout << "Endereco desse objeto: " << &alguem;

	Pessoa outroalguem;
	outroalguem = alguem;
	outroalguem.setNome("Joao");
	outroalguem.mostra();
	cout << "Endereco desse objeto: " << &outroalguem;

	Familia * umaFamilia = new Familia;
	umaFamilia->adicionaMembro(alguem);
	umaFamilia->adicionaMembro(outroalguem);
	umaFamilia->mostra();
	delete umaFamilia;
	alguem.mostra();
	outroalguem.mostra();
	return 0;
}
/*

#include <iostream>
#include "Pessoa.h"
using namespace std;
int main(){
	cout << Pessoa::getProxId()<< endl;
	Pessoa alguem;
	cout << alguem.getId()<< endl;
	cout << alguem.getProxId()<< endl;
	cin.get();
	return 0;
}

#include <iostream>
#include "Date.h"
#include "Pessoa.h"

using namespace std;

int main()
{
	int Month, Day, Year;
	cout << "Please enter a month (between 1 - 12) " << endl;
	cin >> Month;
	cout << "Please enter a day (between 1 - 31) " << endl;
    cin >> Day;
	cout << "Please enter a year (between 1950 - 2020) " << endl;
	cin >> Year;
	Date newDate(Month, Day, Year);
	newDate.showDate1();
	cin.get();
	cout << Pessoa::getProxId()<< endl;
	Pessoa eu;
	eu.setDataNascimento(newDate);
	cout << eu.getIdade()<< endl;
	cout << eu.getProxId()<< endl;
	cin.get();
	return 0;
}*/


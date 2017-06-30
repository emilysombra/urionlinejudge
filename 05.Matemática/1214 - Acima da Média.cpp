#include <iostream>
#include <iomanip>

using namespace std;

int main(){
	int casos, alunos, cont;
	double media, porcentagem;
	cin >> casos;
	while(casos-- > 0){
		media = 0;
		porcentagem = 0;
		cont = 0;
		cin >> alunos;
		int notas[alunos];
		for(int i = 0; i < alunos; i++){
			cin >> notas[i];
			media += notas[i];
		}
		media /= alunos;
		for(int i = 0; i < alunos; i++){
			if(notas[i] > media)
				cont++;
		}
		porcentagem = (100.0 * cont)/alunos;
		cout << fixed << setprecision(3) << porcentagem << "%" <<endl;
	}
	return 0;
}
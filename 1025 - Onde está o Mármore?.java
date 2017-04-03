import java.util.Scanner; //import scan
import java.util.Arrays; //import arrays

public class Main{
	//método de busca O(n)
	static int search(int[] array, int n){
		for(int i = 0; i < array.length; i++){
			if(array[i] == n)
				return i;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//cria objeto scanner
		//declara variaveis
		int n, q, index, qAux;
		//inicio for geral
		for(int i = 1;; i++){
			//lê as variaveis
			n = scan.nextInt();
			q = scan.nextInt();
			//condição de quebra do laço
			if(n == 0 && q == 0)
				break;
			//imprime o cabeçalho da saída
			System.out.println("CASE# " + i + ':');
			//cria vetor de marmores
			int[] marmores = new int[n];
			//for que inicializa o vetor
			for(int j = 0; j < n; j++)
				marmores[j] = scan.nextInt();
			//ordena o vetor
			Arrays.sort(marmores);
			//busca o indice de q numeros
			for(int j = 0; j < q; j++){
				//lê o valor a ser buscado
				qAux = scan.nextInt();
				//busca o valor e salva o indice na variavel index
				index = search(marmores, qAux);
				//caso o valor não for encontrado, imprime que não foi encontrado
				if(index < 0)
					System.out.println(qAux + " not found");
				//caso contrario, imprime o indice
				else
					System.out.println(qAux + " found at " + (index + 1));
			}
		}//fim for geral
	}
}
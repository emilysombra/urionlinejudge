//imports
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) throws IOException{
		//cria o objeto bufferedreader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//criação de variaveis
		int t = Integer.parseInt(br.readLine()), n;
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		//for para ler os t valores
		while(t-- > 0){
			//lê um inteiro
			n = Integer.parseInt(br.readLine());
			//checa a paridade e adiciona no arraylist correspondente
			if(n % 2 == 0)
				pares.add(n);
			else
				impares.add(n);
		}
		//ordena as listas (pares na ordem crescente e impares na ordem decrescente)
		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());
		//dois for, um pra imprimir cada lista
		for(int i : pares)
			System.out.println(i);
		for(int i : impares)
			System.out.println(i);
	}
}
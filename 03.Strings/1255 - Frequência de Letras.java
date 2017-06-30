import java.util.Scanner; //import scan
import java.util.Arrays; //import arrays

public class uri1255{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); //cria objeto scanner
		//declara variaveis
		int qtdCasos = scan.nextInt(), freqMaior, len;
		char c;
		String entrada, resultado;
		int[] contLetras = new int[26]; // array que conta a frequencia das letras
		//linha para evitar bugs
		scan.nextLine();
		//while
		while(qtdCasos-- > 0){
			//inicializa a variavel resultado como string vazia
			resultado = "";
			//recebe a entrada do caso de teste
			entrada = scan.nextLine();
			//inicializa a variavel da maior frequencia como 0
			freqMaior = 0;
			//preenche o array de contadores com zeros
			Arrays.fill(contLetras, 0);
			//transforma a entrada em minusculas
			entrada = entrada.toLowerCase();
			//inicializa a variavel pra guardar o tamanho da entrada
			len = entrada.length();
			//inicio do for que percorre a entrada (1)
			for(int i = 0; i < len; i++){
				//inicializa a variavel c como o caractere atual do for
				c = entrada.charAt(i);
				//checa se c é uma letra, se sim, incrementa seu repectivo contador
				if(c >= 'a' && c <= 'z'){
					contLetras[c-97]++;
					//checa se a frequencia da letra atual ultrapassou a maior frequencia
					if(contLetras[c-97] > freqMaior)
						freqMaior = contLetras[c-97];
				}
			}//fim do for (1)
			//inicio do for que percorre o array de contadores (2)
			for(int i = 0; i < 26; i++){
				//checa se a frequencia da letra é a maior
				if(contLetras[i] == freqMaior)
					resultado += (char) ('a' + i);
			}//fim do for (2)
			System.out.println(resultado);
		}//fim do while
	}//fim do método main
}//fim da classe Main

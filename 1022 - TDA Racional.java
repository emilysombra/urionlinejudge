//imports
import java.util.Scanner;

public class Main{
	static int mdc(int a, int b){
		if(b == 0)
			return a;
		else
			return mdc(b, a%b);
	}

	public static void main(String[] args){
		//cria o objeto bufferedreader
		Scanner scan = new Scanner(System.in);
		//criação de variaveis
		int c = scan.nextInt(), n1, d1, n2, d2, num, den, simp;
		char op;
		//while para executar os c casos
		while(c-- > 0){
			//lê as frações e a operação
			n1 = scan.nextInt();
			scan.next();
			d1 = scan.nextInt();
			op = scan.next().charAt(0);
			n2 = scan.nextInt();
			scan.next();
			d2 = scan.nextInt();
			//realiza a operação
			if(op == '+'){
				num = n1 * d2 + n2 * d1;
				den = d1 * d2;
				simp = mdc(num, den); //calcula o mdc para simpificar
				if(simp < 0)
					simp *= -1;				
				System.out.println(num + "/" + den + " = " + (num / simp) + "/" + (den / simp));
			}else if(op == '-'){
				num = n1 * d2 - n2 * d1;
				den = d1 * d2;
				simp = mdc(num, den); //calcula o mdc para simpificar
				if(simp < 0)
					simp *= -1;
				System.out.println(num + "/" + den + " = " + (num / simp) + "/" + (den / simp));
			}else if(op == '*'){
				num = n1 * n2;
				den = d1 * d2;
				simp = mdc(num, den); //calcula o mdc para simpificar
				if(simp < 0)
					simp *= -1;
				System.out.println(num + "/" + den + " = " + (num / simp) + "/" + (den / simp));
			}else if(op == '/'){
				num = n1 * d2;
				den = n2 * d1;
				simp = mdc(num, den); //calcula o mdc para simpificar
				if(simp < 0)
					simp *= -1;
				System.out.println(num + "/" + den + " = " + (num / simp) + "/" + (den / simp));
			}
		}
	}
}
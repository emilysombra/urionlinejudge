import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int par, j1, j2, r, a;
		par = scan.nextInt();
		j1 = scan.nextInt();
		j2 = scan.nextInt();
		r = scan.nextInt();
		a = scan.nextInt();
		if(r != a)
			System.out.println("Jogador 1 ganha!");
		else if(r == 1)
			System.out.println("Jogador 2 ganha!");
		else{
			if(par == 1 && ((j1+j2) % 2) == 0)
				System.out.println("Jogador 1 ganha!");
			else if(par == 0 && ((j1+j2) % 2) == 1)
				System.out.println("Jogador 1 ganha!");
			else
				System.out.println("Jogador 2 ganha!");
		}
	}
}
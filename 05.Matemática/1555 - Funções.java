import java.util.Scanner;
class Main{
	static double r(int x, int y){
		return Math.pow(3*x, 2) + Math.pow(y, 2);
	}

	static double b(int x, int y){
		return 2 * Math.pow(x, 2) + Math.pow(5*y, 2);
	}

	static double c(int x, int y){
		return -100*x + Math.pow(y, 3);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), x, y;
		double rafa, beto, carlos, maiorRB, maiorRBC;
		while(n-- > 0){
			x = scan.nextInt();
			y = scan.nextInt();
			rafa = r(x, y);
			beto = b(x, y);
			carlos = c(x, y);
			maiorRB = (rafa + beto + (Math.abs(rafa - beto)))/2;
			maiorRBC = (maiorRB + carlos + (Math.abs(maiorRB - carlos)))/2;
			if(maiorRBC == rafa)
				System.out.println("Rafael ganhou");
			else if(maiorRBC == carlos)
				System.out.println("Carlos ganhou");
			else if(maiorRBC == beto)
				System.out.println("Beto ganhou");
		}
	}
}
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String nome;
		double sal, vendas;
		nome = scan.next();
		sal = scan.nextDouble();
		vendas = scan.nextDouble();
		sal += (vendas * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", sal);
	}
}

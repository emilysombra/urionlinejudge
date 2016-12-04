import java.util.Scanner;
class uri1010{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int qtd1, qtd2, cod1, cod2;
		double valor1, valor2, valorFinal;
		cod1 = scan.nextInt();
		qtd1 = scan.nextInt();
		valor1 = scan.nextDouble();
		cod2 = scan.nextInt();
		qtd2 = scan.nextInt();
		valor2 = scan.nextDouble();
		valorFinal = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.print("VALOR A PAGAR: R$ ");
		System.out.printf("%.2f", valorFinal);
		System.out.print("\n");
	}
}

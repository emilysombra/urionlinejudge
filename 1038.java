import java.util.Scanner;
class uri1038{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cod, qtd;
		double valor, total;
		cod = scan.nextInt();
		qtd = scan.nextInt();
		switch(cod){
			case 1:
				valor = 4;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 2:
				valor = 4.5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 3:
				valor = 5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 4:
				valor = 2;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 5:
				valor = 1.5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			default:
				break;
		}
		
	}
}
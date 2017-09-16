import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double valor, valorMoedas;
		int valorint, notas100, notas50, notas20, notas10, notas5, notas2, moedas1, moedas050, moedas025, moedas010, moedas005, moedas001;
		valor = scan.nextDouble();
		valorint = (int) valor;
		valorMoedas = valor - valorint;
		valorMoedas = Math.round(valorMoedas * 100);
		notas100 = valorint/100;
		notas50 = (valorint%100)/50;
		notas20 = ((valorint%100)%50)/20;
		notas10 = (((valorint%100)%50)%20)/10;
		notas5 = ((((valorint%100)%50)%20)%10)/5;
		notas2 = (((((valorint%100)%50)%20)%10)%5)/2;
		moedas1 = (((((valorint%100)%50)%20)%10)%5)%2;
		moedas050 = (int) valorMoedas/50;
		moedas025 = ((int) valorMoedas%50)/25;
		moedas010 = (((int) valorMoedas%50)%25)/10;
		moedas005 = ((((int) valorMoedas%50)%25)%10)/5;
		moedas001 = ((((int) valorMoedas%50)%25)%10)%5;
		System.out.println("NOTAS:\n" + notas100 + " nota(s) de R$ 100.00\n" + notas50 + " nota(s) de R$ 50.00\n" + notas20 + " nota(s) de R$ 20.00\n"
			 + notas10 + " nota(s) de R$ 10.00\n" + notas5 + " nota(s) de R$ 5.00\n" + notas2 + " nota(s) de R$ 2.00\nMOEDAS:\n" + moedas1 +
			 " moeda(s) de R$ 1.00\n" + moedas050 + " moeda(s) de R$ 0.50\n" + moedas025 + " moeda(s) de R$ 0.25\n" + moedas010 + " moeda(s) de R$ 0.10\n"
			  + moedas005 + " moeda(s) de R$ 0.05\n"+ moedas001 + " moeda(s) de R$ 0.01");
	}
}

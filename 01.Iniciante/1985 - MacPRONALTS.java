import java.util.Scanner;
class uri1985{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int qtd = scan.nextInt(), cod, qtdProd;
		int[] cods = {1001, 1002, 1003, 1004,1005};
		double[] precos = {1.5, 2.5, 3.5, 4.5, 5.5};
		double precoFinal = 0;
		while(qtd-- > 0){
			cod = scan.nextInt();
			qtdProd = scan.nextInt();
			for(int i = 0; i < cods.length; i++){
				if(cod == cods[i])
					precoFinal += (precos[i] * qtdProd);
			}
		}
		System.out.printf("%.2f\n", precoFinal);
	}
}
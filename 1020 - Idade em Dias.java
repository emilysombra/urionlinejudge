import java.util.Scanner;
class uri1020{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int idade, dias, meses, anos;
		idade = scan.nextInt();
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		System.out.print(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)\n");
	}
}

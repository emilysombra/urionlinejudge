import java.util.Scanner;

public class uri1170{
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args){
		int casos, dias;
		double qtd;
		casos = s.nextInt();
		while(casos-- > 0){
			dias = 0;
			qtd = s.nextDouble();
			while(qtd > 1){
				qtd/=2;
				dias++;
			}
			System.out.println(dias + " dias");
		}
	}
}

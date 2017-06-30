import java.util.Scanner;

public class uri1103{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int horaD = scan.nextInt(), minD = scan.nextInt();
		int horaA = scan.nextInt(), minA = scan.nextInt();
		int qtdMin;
		while(horaA != 0 || horaD != 0 || minA != 0 || minD != 0){
			qtdMin = (horaA * 60 + minA) - (horaD * 60 + minD);
			if(qtdMin < 0)
				qtdMin += 1440;
			System.out.println(qtdMin);
			horaD = scan.nextInt(); minD = scan.nextInt();
			horaA = scan.nextInt(); minA = scan.nextInt();
		}
	}
}

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tempo, horas, min, seg;
		tempo = scan.nextInt();
		horas = tempo/3600;
		min = (tempo%3600)/60;
		seg = tempo%60;
		System.out.println(horas + ":" + min + ":" + seg);
	}
}

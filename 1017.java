import java.util.Scanner;
class uri1017{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tempo, vel;
		double dist, consumo;
		tempo = scan.nextInt();
		vel = scan.nextInt();
		dist = vel*tempo;
		consumo = dist/12;
		System.out.printf("%.3f", consumo);
		System.out.print("\n");
	}
}
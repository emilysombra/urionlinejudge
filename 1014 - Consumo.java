import java.util.Scanner;
class uri1014{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int dist;
		double totalKm, consumo;
		dist = scan.nextInt();
		totalKm = scan.nextDouble();
		consumo = dist / totalKm;
		System.out.printf("%.3f", consumo);
		System.out.print(" km/l\n");
	}
}

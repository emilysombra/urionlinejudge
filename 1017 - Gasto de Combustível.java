import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tempo, vel;
		tempo = scan.nextInt();
		vel = scan.nextInt();
		System.out.printf("%.3f\n", (vel*tempo)/12.0);
	}
}

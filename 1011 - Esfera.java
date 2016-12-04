import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double raio, volume;
		raio = scan.nextDouble();
		volume = (4.0/3) * 3.14159 * raio * raio * raio;
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}

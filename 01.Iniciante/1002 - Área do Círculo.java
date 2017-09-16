import java.util.Scanner; 
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double raio, area;
		raio = scan.nextDouble();
		area = 3.14159 * (Math.pow(raio,2));
		System.out.printf("A=%.4f\n", area);
	}
}

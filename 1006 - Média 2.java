import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c, med;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		med = ((a * 2) + (b * 3) + (c * 5))/10;
		System.out.printf("MEDIA = %.1f\n", med);
	}
}

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, med;
		a = scan.nextDouble();
		b = scan.nextDouble();
		med = ((a * 3.5) + (b * 7.5))/11;
		System.out.printf("MEDIA = %.5f\n", med);
	}
}

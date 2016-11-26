import java.util.Scanner;
class uri1005{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double A, B, MEDIA;
		A = scan.nextDouble();
		B = scan.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5))/11;
		System.out.print("MEDIA = ");
		System.out.printf("%.5f", MEDIA);
		System.out.print("\n");
	}
}

import java.util.Scanner;
class uri1006{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double A, B, C, MEDIA;
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		MEDIA = ((A * 2) + (B * 3) + (C * 5))/10;
		System.out.print("MEDIA = ");
		System.out.printf("%.1f", MEDIA);
		System.out.print("\n");
	}
}
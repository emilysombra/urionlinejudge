import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b, p;
		a = scan.nextInt();
		b = scan.nextInt();
		p = a * b;
		System.out.print("PROD = " + p + "\n");
	}
}

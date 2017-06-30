import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt(), r = scan.nextInt();
		while(l != 0 && r != 0){
			System.out.println(l + r);
			l = scan.nextInt();
			r = scan.nextInt();
		}
	}
}
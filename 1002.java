import java.util.Scanner;
import java.util.*;  
class uri1002{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double raio, area;
		raio = scan.nextDouble();
		area = 3.14159 * (Math.pow(raio,2));
		System.out.print("A=");
		System.out.printf("%.4f", area);
		System.out.print("\n");
	}
}
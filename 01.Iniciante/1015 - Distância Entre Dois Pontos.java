import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2, dist, x, y;
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		dist = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		System.out.printf("%.4f\n", dist);
	}
}

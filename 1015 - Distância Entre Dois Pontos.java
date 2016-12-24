import java.util.Scanner;
class uri1015{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2, dist, x, y;
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		x = x2 - x1;
		y = y2 - y1;
		dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		System.out.printf("%.4f", dist);
		System.out.print("\n");
	}
}

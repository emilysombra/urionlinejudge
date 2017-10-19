import java.util.Scanner;
//import java.util.Math;
class uri1043{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		if((a < (b + c)) && (b < (a + c)) && (c < (a + b))){
			System.out.printf("Perimetro = %.1f\n", a + b + c);
		}else{
			System.out.printf("Area = %.1f\n", ((a + b)*c)/2);
		}
	}
}
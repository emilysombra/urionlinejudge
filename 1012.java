import java.util.Scanner;
class uri1012{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		areaTri = (a * c)/2;
		areaCirc = 3.14159 * c * c;
		areaTrap = ((a + b) * c)/2;
		areaQuad = b * b;
		areaRet = a * b;
		
		System.out.print("TRIANGULO: ");
		System.out.printf("%.3f", areaTri);
		System.out.print("\n");

		System.out.print("CIRCULO: ");
		System.out.printf("%.3f", areaCirc);
		System.out.print("\n");

		System.out.print("TRAPEZIO: ");
		System.out.printf("%.3f", areaTrap);
		System.out.print("\n");

		System.out.print("QUADRADO: ");
		System.out.printf("%.3f", areaQuad);
		System.out.print("\n");

		System.out.print("RETANGULO: ");
		System.out.printf("%.3f", areaRet);
		System.out.print("\n");
	}
}
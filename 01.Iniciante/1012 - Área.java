import java.util.Scanner;
class Main{
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
		
		System.out.printf("TRIANGULO: %.3f\n", areaTri);
		System.out.print("CIRCULO: %.3f\n", areaCirc);
		System.out.print("TRAPEZIO: %.3f\n", areaTrap);
		System.out.print("QUADRADO: %.3f\n", areaQuad);
		System.out.print("RETANGULO: %.3f\n", areaRet);
	}
}

import java.util.Scanner;
import java.util.Arrays;
class uri1045{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double lados[] = new double[3];
		double a, b, c;
		lados[0] = scan.nextDouble();
		lados[1] = scan.nextDouble();
		lados[2] = scan.nextDouble();
		Arrays.sort(lados);
		c = lados[0];
		b = lados[1];
		a = lados[2];
		if(a >= (b + c)){
			System.out.print("NAO FORMA TRIANGULO\n");
		}else{
			if((a*a) == ((b*b) + (c*c))){
				System.out.print("TRIANGULO RETANGULO\n");
			}

			if((a*a) > ((b*b) + (c*c))){
				System.out.print("TRIANGULO OBTUSANGULO\n");
			}

			if((a*a) < ((b*b) + (c*c))){
				System.out.print("TRIANGULO ACUTANGULO\n");
			}

			if((a==b) && (b==c)){
				System.out.print("TRIANGULO EQUILATERO\n");
			}

			if(((a==b) && (b!=c)) || ((a!=b) && (b==c))){
				System.out.print("TRIANGULO ISOSCELES\n");
			}
		}

		
	}
}
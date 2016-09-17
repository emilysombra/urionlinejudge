import java.util.Scanner;
class uri1041{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x, y;
		x = scan.nextDouble();
		y = scan.nextDouble();
		if((x == 0) && (y == 0)){
			System.out.print("Origem\n");
		}else if(x == 0){
			System.out.print("Eixo Y\n");
		}else if(y == 0){
			System.out.print("Eixo X\n");
		}else if((x > 0) && (y > 0)){
			System.out.print("Q1\n");
		}else if((x < 0) && (y > 0)){
			System.out.print("Q2\n");
		}else if((x < 0) && (y < 0)){
			System.out.print("Q3\n");
		}else if((x > 0) && (y < 0)){
			System.out.print("Q4\n");
		}
	}
}
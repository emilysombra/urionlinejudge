import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num, h;
		double sal;
		num = scan.nextInt();
		h = scan.nextInt();
		sal = scan.nextDouble();
		sal *= h;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", sal);
	}
}

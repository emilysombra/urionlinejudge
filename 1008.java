import java.util.Scanner;
class uri1008{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num, hours;
		double salary;
		num = scan.nextInt();
		hours = scan.nextInt();
		salary = scan.nextDouble();
		salary = salary * hours;
		System.out.println("NUMBER = " + num);
		System.out.print("SALARY = U$ ");
		System.out.printf("%.2f", salary);
		System.out.print("\n");
	}
}
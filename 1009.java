import java.util.Scanner;
class uri1009{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String name;
		double salary, sales;
		name = scan.next();
		salary = scan.nextDouble();
		sales = scan.nextDouble();
		salary = salary + (sales * 0.15);
		System.out.print("TOTAL = R$ ");
		System.out.printf("%.2f", salary);
		System.out.print("\n");
	}
}
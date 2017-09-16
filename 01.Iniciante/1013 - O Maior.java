import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		double maiorAB, maiorABC;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		maiorAB = (a + b + (Math.abs(a - b)))/2;
		maiorABC = (maiorAB + c + (Math.abs(maiorAB - c)))/2;
		if(maiorABC == a)
			System.out.println(a + " eh o maior");
		else if(maiorABC == b)
			System.out.println(b + " eh o maior");
		else if(maiorABC == c)
			System.out.println(c + " eh o maior");
	}
}

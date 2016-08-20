import java.util.Scanner;
class uri1013{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		double maiorAB, maiorABC;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		maiorAB = (a + b + (Math.abs(a - b)))/2;
		maiorABC = (maiorAB + c + (Math.abs(maiorAB - c)))/2;
		if(maiorABC == a){
			System.out.print(a + " eh o maior\n");
		}
		if(maiorABC == b){
			System.out.print(b + " eh o maior\n");
		}
		if(maiorABC == c){
			System.out.print(c + " eh o maior\n");
		}
	}
}
import java.util.Scanner;
class uri1044{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if((a%b == 0) || (b%a==0)){
			System.out.print("Sao Multiplos\n");
		}else{
			System.out.print("Nao sao Multiplos\n");
		}
	}
}
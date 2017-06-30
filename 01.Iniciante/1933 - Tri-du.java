import java.util.Scanner;

class uri1933{
	static Scanner scan = new Scanner(System.in);

	static int whichCard(int a, int b){
		if(b>a)
			 return b;
		return a;
	}
	public static void main(String[] args){
		System.out.println(whichCard(scan.nextInt(), scan.nextInt()));
	}
}

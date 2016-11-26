import java.util.Scanner;
class uri2006{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int c = 0, cha = scan.nextInt(), resp;
		for(int i = 0; i < 5; i++){
			resp = scan.nextInt();
			if(resp == cha)
				c++;
		}
		System.out.println(c);
	}
}
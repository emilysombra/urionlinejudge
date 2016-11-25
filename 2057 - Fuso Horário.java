import java.util.Scanner;
class uri2057{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int part = scan.nextInt(), dur = scan.nextInt(), fuso = scan.nextInt();
		int chegada = (part + dur + fuso)%24;
		if(chegada < 0)
			chegada += 24;
		System.out.println(chegada);
	}
}
import java.util.Scanner;

public class uri1329{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt(), maria, joao, num;
		while(n != 0){
			maria = 0;
			joao = 0;
			while(n-- > 0){
				num = scan.nextInt();
				if(num == 0)
					maria++;
				else
					joao++;
			}
			System.out.println("Mary won " + maria + " times and John won " + joao + " times");
			n = scan.nextInt();
		}
	}
}

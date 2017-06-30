import java.util.Scanner;
class uri1035{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		if(b>c && d>a && (c+d)>(a+b) && c>0 && d>0 && a%2==0){
			System.out.print("Valores aceitos\n");
		}else{
			System.out.print("Valores nao aceitos\n");
		}
		
	}
}

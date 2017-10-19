import java.util.Scanner;
class uri1042{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		if((x >= y) && (y >= z)){
			System.out.print(z + "\n" + y + "\n" + x + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if((x <= y) && (y <= z)){
			System.out.print(x + "\n" + y + "\n" + z + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if((x >= z) && (z >= y)){
			System.out.print(y + "\n" + z + "\n" + x + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if((x <= z) && (z <= y)){
			System.out.print(x + "\n" + z + "\n" + y + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if((z <= x) && (x <= y)){
			System.out.print(z + "\n" + x + "\n" + y + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}

		else if((y <= x) && (x <= z)){
			System.out.print(y + "\n" + x + "\n" + z + "\n\n" + x + "\n" + y + "\n" + z + "\n");
		}
	}
}
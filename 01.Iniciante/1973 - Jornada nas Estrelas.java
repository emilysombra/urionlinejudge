import java.util.Scanner;
import java.math.BigInteger;

public class uri1973{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt(), atkStars = 0;
		BigInteger totalCarneiros = BigInteger.valueOf(0);
		int[] carneiros = new int[n];
		int[] roubados = new int[n];
		boolean lad = true;
		for(int i = 0; i < carneiros.length; i++){
            carneiros[i] = scan.nextInt();
            totalCarneiros = totalCarneiros.add(BigInteger.valueOf(carneiros[i]));
            roubados[i] = 0;
		}
		for(int i = 0; lad;){
			if(carneiros[i]>0){
				if(roubados[i]==0)
					atkStars++;
				roubados[i]++;
				carneiros[i]--;
				totalCarneiros = totalCarneiros.subtract(BigInteger.valueOf(1));
				if(carneiros[i]%2==0)
					i++;
				else
					i--;
			}else
				i--;

			if(i<0 || i>=n)
				lad=false;
		}
		System.out.println(atkStars + " " + totalCarneiros);
	}
}

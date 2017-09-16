import java.util.*;
class uri1079{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i<n; i++){
        	double x, y, z;
			x = scan.nextDouble();
			y = scan.nextDouble();
			z = scan.nextDouble();
            System.out.printf("%.1f\n", (x*2+y*3+z*5)/10);
        }
    }
}
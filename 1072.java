import java.util.*;
class uri1072{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, in = 0, out = 0, n = scan.nextInt();
        for(int i = 0; i<n; i++){ 
        	x = scan.nextInt();
            if((x >= 10) && (x <= 20)){
                 in++;
            }else{
            	out++;
            }
        }
        System.out.print(in + " in\n" + out + " out\n");
    }
}
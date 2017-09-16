import java.util.*;
class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, n = scan.nextInt();
        for(int i = 0; i<n; i++){
        	x = scan.nextInt();
            if((x % 2 == 0) && (x > 0)){
                System.out.println("EVEN POSITIVE");
            }else if((x % 2 == 0) && (x < 0)){
            	System.out.println("EVEN NEGATIVE");
            }else if((x % 2 != 0) && (x > 0)){
            	System.out.println("ODD POSITIVE");
            }else if((x % 2 != 0) && (x < 0)){
            	System.out.println("ODD NEGATIVE");
            }else{
            	System.out.println("NULL");
            }
        }
    }
}
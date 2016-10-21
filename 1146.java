import java.util.*;
class uri1146{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while(x!=0){
        	for(int i = 1; i < x; i++)
        		System.out.print(i + " ");
        	System.out.println(x);
        	x = scan.nextInt();
        }
    }
}
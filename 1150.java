import java.util.*;
class uri1150{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), z = scan.nextInt(), cont = 0, soma = 0;
        while(z<=x)
        	z = scan.nextInt();
        for(int i = 0; soma < z; i++){
        	soma += x+i;
    		cont++;
        }
    	System.out.println(cont);
    }
}
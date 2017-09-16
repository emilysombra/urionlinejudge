import java.util.*;
class uri1070{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i = x; i<(x+12); i++){ 
            if(i % 2 != 0){
                 System.out.println(i);
            }
        }
    }
}
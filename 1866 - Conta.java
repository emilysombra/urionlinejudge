import java.util.*;
class uri1865{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt(), x;
        while(n-- > 0){
            x = scan.nextInt();
            if(x%2 == 0)
                System.out.println(0);
            else
                System.out.println(1);
        }     
    }
}
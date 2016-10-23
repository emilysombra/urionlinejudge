import java.util.*;
class uri1153{
    public static int fatorial(int n){
        int res = 1;
        for(int i = n; i > 0; i--)
            res*=i;
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fatorial(n));
    }
}
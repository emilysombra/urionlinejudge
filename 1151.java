import java.util.*;
class uri1151{
    public static long fibo(int n){
        int f = 0, ant = 0;
         for(int i = 1; i<=n; i++){
            if(i==1){
                f = 1;
                ant = 0;
            }
            else{
                f += ant;
                ant = f - ant;
            }
        }
        return f;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n-1; i++)
    	   System.out.print(fibo(i) + " ");
        System.out.println(fibo(n-1));
    }
}
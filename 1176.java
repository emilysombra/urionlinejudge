import java.util.*;
import java.math.BigInteger;
class uri1176{
    public static BigInteger fibo(int n){
        BigInteger f = new BigInteger("0");
        BigInteger ant = new BigInteger("0");
        for(int i = 1; i<=n; i++){
            if(i==1)
                f = new BigInteger("1");
            else{
                f = f.add(ant);
                ant = f.subtract(ant);
            }
        }
        return f;
    }
    public static BigInteger[] fiboArray(int n){
        BigInteger[] array = new BigInteger[n];
        for(int i = 0; i < array.length; i++)
            array[i] = fibo(i);
        return array;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x;
        BigInteger[] fib = fiboArray(61);
        for(int i = 0; i < n; i++){
            x = scan.nextInt();
            System.out.println("Fib(" + x + ") = " + fib[x]);
        }
    }
}
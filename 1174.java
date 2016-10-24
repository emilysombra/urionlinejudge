import java.util.*;
class uri1174{
    public static double[] readArray(int n){
        Scanner scan = new Scanner(System.in);
        double[] array = new double[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextDouble();
        }
        return array;
    }
    public static void main(String[] args){
        double n[] = readArray(100);
        for(int i = 0; i<100; i++){
            if(n[i]<=10)
                System.out.printf("A[%d] = %.1f\n", i, n[i]);
        }
    }
}
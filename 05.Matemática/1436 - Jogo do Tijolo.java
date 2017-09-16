import java.util.Scanner;

public class uri1436{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int c = scan.nextInt(), n;
        int[] array;
        for(int i = 1; i <= c; i++){
            n = scan.nextInt();
            array = new int[n];
            for(int j = 0; j < n; j++)
                array[j] = scan.nextInt();
            System.out.print("Case " + i + ": ");
            System.out.println(array[(n-1)/2]);
        }
    }
}
import java.util.*;
class uri1172{
    public static int[] readArray(int n){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static void main(String[] args){
        int n[] = readArray(10);
        for(int i = 0; i<10; i++){
            if(n[i]<1)
                n[i] = 1;
            System.out.println("X[" + i + "] = " + n[i]);
        }
    }
}
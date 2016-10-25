import java.util.*;
class uri1175{
    public static int[] readArray(int n){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static int[] reverseArray(int[] array){
        int aux = 0;
        for(int i = 0, j = array.length-1; i<j;i++, j--){
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
        return array;
    }
    public static void main(String[] args){
        int n[] = readArray(20);
        n = reverseArray(n);
        for(int i = 0; i < 20; i++)
            System.out.println("N[" + i + "] = " + n[i]);
    }
}
import java.util.Scanner;
class uri1858{
    public static Scanner scan = new Scanner(System.in);
    public static int[] readArray(int n){
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();
        return array;
    }
    public static int indiceMenor(int[] array){
        int menor = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[menor])
                menor = i;
        }
        return menor;
    }
    public static void main(String[] args){
        int n = scan.nextInt(), theon = 1;
        int resp[] = readArray(n);
        theon += indiceMenor(resp);
        System.out.println(theon);        
    }
}
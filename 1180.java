import java.util.*;
class uri1180{
    public static int indiceMenor(int[] array){
        int menor = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[menor])
                menor = i;
        }
        return menor;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), menor;
        int array[] = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        menor = indiceMenor(array);
        System.out.println("Menor valor: " + array[menor]);
        System.out.println("Posicao: " + menor);
    }
}
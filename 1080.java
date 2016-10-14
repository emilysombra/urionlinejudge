import java.util.*;
class uri1080{
    //função para ler o array
    public static int[] readArray(int n){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }
    //função para retornar o maior valor do array
    public static int maior(int[] array){
        int maior = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }
    //função para retornar o indice do maior elemento
    public static int indice(int[] array, int n){
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return i+1;
            }
        }
        return 0;
    }
	public static void main(String[] args){
        int nums[] = readArray(100);
        System.out.println(maior(nums));
        System.out.println(indice(nums, maior(nums)));
    }
}

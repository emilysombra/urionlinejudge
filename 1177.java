import java.util.*;
class uri1177{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[1000];
        int n = scan.nextInt();
        for(int i = 0, j = 0; i < 1000; i++, j++){
            vet[i] = j;
            System.out.println("N[" + i + "] = " + vet[i]);
            if(j==n-1)
                j = -1;
        }
    }
}
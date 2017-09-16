import java.util.*;
class uri1178{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double vet[] = new double[100];
        vet[0] = scan.nextDouble();
        System.out.printf("N[0] = %.4f\n", vet[0]);
        for(int i = 1; i < 100; i++){
            vet[i] = vet[i-1]/2;
            System.out.printf("N[%d] = %.4f\n", i, vet[i]);
        }
    }
}
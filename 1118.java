import java.util.*;
class uri1118{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n1, n2;
        int control = 1;
        while(control==1){
            n1 = scan.nextDouble();
            while(n1<0 || n1>10){
                System.out.println("nota invalida");
                n1 = scan.nextDouble();
            }
            n2 = scan.nextDouble();
            while(n2<0 || n2>10){
                System.out.println("nota invalida");
                n2 = scan.nextDouble();
            }
            System.out.printf("media = %.2f\nnovo calculo (1-sim 2-nao)\n", (n1+n2)/2);
            control = scan.nextInt();
            if(control!=1 && control!=2){
                while(control!=1 && control!=2){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    control = scan.nextInt();
                }
            }
        } 
    }
}
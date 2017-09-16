import java.util.*;
class uri1117{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n1, n2;
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
        System.out.printf("media = %.2f\n", (n1+n2)/2);
    }
}
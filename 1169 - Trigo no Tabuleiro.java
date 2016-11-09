import java.util.Scanner;
class uri1169{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x;
        double qtd;
        while(n-- > 0){
            x = scan.nextInt();
            qtd = 1;
            for(int i = 0; i<x; i++)
                qtd *= 2;
            qtd = Math.floor((qtd/12)/1000);
            System.out.printf("%.0f kg\n", qtd);
        }
    }
}
import java.util.Scanner;

public class uri1871{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(), n2 = scan.nextInt();
        String soma;
        while(n1 != 0 && n2 != 0){
            soma = Integer.toString(n1 + n2);
            System.out.println(soma.replaceAll("0", ""));
            n1 = scan.nextInt();
            n2 = scan.nextInt();
        }
    }
}
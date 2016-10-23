import java.util.*;
class uri1154{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(), qtd = 0;
        double soma = 0;
        while(age >= 0){
            soma += age;
            qtd++;
            age = scan.nextInt();
        }
        System.out.printf("%.2f\n", soma/qtd);
    }
}
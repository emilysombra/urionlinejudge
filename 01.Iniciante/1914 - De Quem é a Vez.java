import java.util.Scanner;
import java.util.Objects;
class uri1914{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt();
        String nome1, nome2, escolha1, escolha2;
        int num1, num2;
        boolean res;
        while(n-- > 0){
            nome1 = scan.next();
            escolha1 = scan.next();
            nome2 = scan.next();
            escolha2 = scan.next();
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            res = (num1+num2)%2 == 0;
            if(Objects.equals("PAR", escolha1)){
                if(res)
                    System.out.println(nome1);
                else
                    System.out.println(nome2);
            }else{
                if(res)
                    System.out.println(nome2);
                else
                    System.out.println(nome1);  
            }     
        }
    }
}
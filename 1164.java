import java.util.*;
class uri1164{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x, soma;
        for(int i = 0; i < n; i++){
            x = scan.nextInt();
            soma = 0;
            for(int c = 1; c < x; c++){
                if(x%c==0)
                    soma+=c;
            }
            if(soma==x)
                System.out.println(x + " eh perfeito");
            else
                System.out.println(x + " nao eh perfeito");
        }
    }
}
import java.util.*;
class uri1165{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x, qtd;
        for(int i = 0; i < n; i++){
            x = scan.nextInt();
            qtd = 0;
            for(int c = 1; c < x; c++){
                if(x%c==0)
                    qtd++;
            }
            if(qtd==1)
                System.out.println(x + " eh primo");
            else
                System.out.println(x + " nao eh primo");
        }
    }
}
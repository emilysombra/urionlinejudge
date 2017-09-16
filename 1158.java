import java.util.*;
class uri1158{
    public static int soma(int in, int fn){
        int soma = 0;
        for(int i = in; i<fn; i++){
            if(i%2 != 0){
                soma+=i;
            }
        }
        return soma;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x, y, soma = 0;
        for(int i = 0; i<n; i++){
            x = scan.nextInt();
            y = scan.nextInt();
            System.out.println(soma(x, x+(y*2)));
        }
    }
}
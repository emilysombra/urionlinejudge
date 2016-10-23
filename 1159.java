import java.util.*;
class uri1159{
    public static int soma(int in, int fn){
        int soma = 0;
        for(int i = in; i<fn; i++){
            if(i%2 == 0){
                soma+=i;
            }
        }
        return soma;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while(x != 0){
            System.out.println(soma(x, x+10));
            x = scan.nextInt();
        }
    }
}
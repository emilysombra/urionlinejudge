import java.util.*;
class uri1071{
    public static int soma(int in, int fn){
        int soma = 0;
        for(int i = (in+1); i<fn; i++){
            if(i%2 != 0){
                soma+=i;
            }
        }
        return soma;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        if(x > y){
            System.out.println(soma(y, x));
        }else{
            System.out.println(soma(x, y));
        }
    }
}
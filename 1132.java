import java.util.*;
class uri1132{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, soma = 0;
        x = scan.nextInt();
        y = scan.nextInt();
        if(x>y){
            for(int i = y; i<=x; i++){
                if(i%13!=0)
                    soma+=i;
            }
        }else{
            for(int i = x; i<= y; i++){
                if(i%13!=0)
                    soma+=i;
            }
        }
        System.out.println(soma);
    }
}
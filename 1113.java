import java.util.*;
class uri1113{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        while(x!=y){
            if(x>y){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }
    }
}
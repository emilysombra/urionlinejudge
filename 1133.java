import java.util.*;
class uri1133{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        if(x>y){
            for(int i = y+1; i<x; i++){
                if(i%5==2 || i%5==3)
                    System.out.println(i);
            }
        }else{
            for(int i = x+1; i< y; i++){
                if(i%5==2 || i%5==3)
                    System.out.println(i);
            }
        }
    }
}
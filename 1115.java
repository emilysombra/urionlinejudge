import java.util.*;
class uri1115{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        while(x!=0 && y!=0){
            if(x>0 && y>0)
                System.out.println("primeiro");
            else if(x>0 && y<0)
                System.out.println("quarto");
            else if(x<0 && y<0)
                System.out.println("terceiro");
            else
                System.out.println("segundo");
            x = scan.nextInt();
            y = scan.nextInt();
        }
    }
}
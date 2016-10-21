import java.util.*;
class uri1145{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        for(int i = 1, j = 1; i <= y; i++, j++){
            if(j!=x)
                System.out.print(i + " ");
            else{
                System.out.println(i);
                j = 0;
            }
        }
    }
}
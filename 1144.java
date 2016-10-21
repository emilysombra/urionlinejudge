import java.util.*;
class uri1144{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
            System.out.println(i + " " + (i*i+1) + " " + (i*i*i+1));
        }

    }
}
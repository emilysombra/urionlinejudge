import java.util.*;
class uri1116{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        double x, y;
        n = scan.nextInt();
        for(int i = 0; i<n; i++){
            x = scan.nextDouble();
            y = scan.nextDouble();
            if(y==0)
                System.out.println("divisao impossivel");
            else
                System.out.printf("%.1f\n", x/y);
        }
    }
}
import java.util.*;
class uri1160{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), c;
        double a, b, cresA, cresB;
        for(int i = 0; i < n; i++){
            a = scan.nextDouble();
            b = scan.nextDouble();
            cresA = scan.nextDouble();
            cresB = scan.nextDouble();
            cresA/=100;
            cresB/=100;
            for(c = 0; a <= b; c++){
                a = Math.floor(a+(a*cresA));
                b = Math.floor(b+(b*cresB));
                if(c>100)
                    break;
            }
            if(c>100)
                System.out.println("Mais de 1 seculo.");
            else
                System.out.println(c + " anos.");
        }
    }
}
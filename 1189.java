import java.util.Scanner;
class uri1189{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double soma = 0;    
        double mat[][] = new double[12][12];
        String op;
        int dp = 0, ds = 11;
        op = scan.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = scan.nextDouble();
                if(j<dp && j<ds)
                    soma+=mat[i][j];
            }
            ds--;
            dp++;
        }
        if(op.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else if(op.equals("M")){
            System.out.printf("%.1f\n", soma/30);
        }
    }
}
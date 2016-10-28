import java.util.Scanner;
class Main{
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lin;
        float soma = 0;    
        float mat[][] = new float[12][12];
        String op;
        lin = scan.nextInt();
        op = scan.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = scan.nextFloat();
            }
        }
        for (int j = 0; j < 12; j++) {
            soma +=  mat[lin][j];
        }
        if(op.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else if(op.equals("M")){
            System.out.printf("%.1f\n", soma/12);
        }
    }
}
import java.util.Scanner;
class uri1182{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int col;
        float soma = 0;    
        float mat[][] = new float[12][12];
        String op;
        col = scan.nextInt();
        op = scan.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = scan.nextFloat();
            }
        }
        for (int j = 0; j < 12; j++) {
            soma +=  mat[j][col];
        }
        if(op.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else if(op.equals("M")){
            System.out.printf("%.1f\n", soma/12);
        }
    }
}
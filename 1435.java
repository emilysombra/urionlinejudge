import java.util.Scanner;
class uri1435{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    
        while(n > 0){
            int mat[][] = new int[n][n];
            int cont = 1, ini = 0, fim = n-1;
            for(int j = 0; j < (n+1) / 2; j++){
                for(int i = ini; i <= fim; i++){
                    mat[i][ini] = cont;
                    mat[ini][i] = cont;
                    mat[i][fim] = cont;
                    mat[fim][i] = cont;
                }
                cont++;
                ini++;
                fim--;
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(j == (n-1))
                        System.out.printf("%3d\n", mat[i][j]);
                    else
                        System.out.printf("%3d ", mat[i][j]);
                }
            }
            System.out.print("\n");
            n = scan.nextInt();
        }
    }
}
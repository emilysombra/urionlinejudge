import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class uri2028{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        String entrada;
        int n, casos = 1;
        while((entrada = br.readLine()) != null){
            n = Integer.parseInt(entrada);
            System.out.print("Caso " + casos++ + ": ");
            if(n==0){
                System.out.println("1 numero");
                System.out.printf("0\n\n");
            }
            else{
                System.out.println((((n * (1 + n))/2)+1) + " numeros");
                System.out.print("0 ");
                for(int i = 1; i <= n; i++){
                    for(int j = 0; j < i; j++){
                        if(i==n && j==i-1)
                            System.out.printf("%d\n\n", i);
                        else
                            System.out.print(i + " ");
                    }
                }
            }

        }
    }
}
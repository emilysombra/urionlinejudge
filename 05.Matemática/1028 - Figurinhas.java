import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1028{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int gcd(int a, int b){
        return (a==0)? b : gcd(b % a, a);
    }

    public static int[] getNums(String line, int qtd){
        StringBuilder bodybuilder = new StringBuilder();
        int[] nums = new int[qtd];
        int len = line.length(), cont = 0;
        char c;
        for(int i = 0; i < len; i++){
            c = line.charAt(i);
            if(c>=48 && c<=57){
                bodybuilder.append(c);
                if(i == len-1)
                    nums[cont] = Integer.parseInt(bodybuilder.toString());
            }
            else{
                nums[cont] = Integer.parseInt(bodybuilder.toString());
                cont++;
                bodybuilder.delete(0, bodybuilder.length());
            }
        }
        return nums;
    }

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] nums;
        while(n-- > 0){
            nums = getNums(br.readLine(), 2);
            System.out.println(gcd(nums[0], nums[1]));
        }
    }
}
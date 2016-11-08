import java.io.*;
import java.math.BigInteger;
class uri1161{
    public static int[] getNums(String line, int qtd){
        StringBuilder bodybuilder = new StringBuilder();
        int[] nums = new int[qtd];
        int len = line.length(), cont = 0;
        char c;
        for(int i = 0; i< len; i++){
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
    public static BigInteger fatorial(int n){
        BigInteger res = new BigInteger("1");
        for(int i = n; i > 0; i--)
            res = res.multiply(new BigInteger(i + ""));
        return res;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            int n[] = getNums(line, 2);
            BigInteger fat = new BigInteger("0");
            for(int i = 0; i<n.length; i++)
                fat = fat.add(fatorial(n[i]));
            System.out.println(fat);
        }
    }
}
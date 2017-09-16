import java.io.*;
import java.util.Arrays;
class uri1198{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[] getNums(String line, int qtd){
        StringBuilder bodybuilder = new StringBuilder();
        long[] nums = new long[qtd];
        int len = line.length(), cont = 0;
        char c;
        for(int i = 0; i< len; i++){
            c = line.charAt(i);
            if(c>=48 && c<=57){
                bodybuilder.append(c);
                if(i == len-1)
                    nums[cont] = Long.parseLong(bodybuilder.toString());
            }
            else{
                nums[cont] = Long.parseLong(bodybuilder.toString());
                cont++;
                bodybuilder.delete(0, bodybuilder.length());
            }
        }
        return nums;
    }
    public static void main(String[] args) throws IOException{    
        String line;
        long[] nums;
        while((line = br.readLine()) != null){
            nums = getNums(line, 2);
            Arrays.sort(nums);
            System.out.println(nums[1] - nums[0]);
        }
    }
}
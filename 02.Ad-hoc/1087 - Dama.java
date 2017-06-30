import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1087{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int[] getNums(String line, int qtd){
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

    static int moveQueen(int x1, int y1, int x2, int y2){
    	if(x1 == x2 && y1 == y2)
    		return 0;
    	else if((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2))
    		return 1;
    	else if(Math.abs(x1 - x2) == Math.abs(y1 - y2))
    		return 1;
    	return 2;
    }

	public static void main(String[] args) throws IOException{
		String entrada = br.readLine();
		int[] nums;
		while(!(entrada.equals("0 0 0 0"))){
			nums = getNums(entrada, 4);
			System.out.println(moveQueen(nums[0], nums[1], nums[2], nums[3]));
			entrada = br.readLine();
		}
	}
}

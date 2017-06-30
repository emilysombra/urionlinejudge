import java.io.*;

public class uri1241{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static void encaixa(String str1, String str2){
		if(str1.endsWith(str2))
			System.out.println("encaixa");
		else
			System.out.println("nao encaixa");
	}

	public static void main(String[] args) throws IOException{
        String entrada = br.readLine();
        String[] nums;
        int casos = Integer.parseInt(entrada);
        while(casos-- > 0){
            entrada = br.readLine();
            nums = entrada.split(" ");
            if(nums[0].equals(nums[1]))
                System.out.println("encaixa");
            else if(nums[0].length() < nums[1].length())
            	System.out.println("nao encaixa");
            else
            	encaixa(nums[0], nums[1]);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uri1069{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int countDiam(String str){
		int len = str.length(), open = 0, diam = 0;
		char c;
		for(int i = 0; i < len; i++){
			c = str.charAt(i);
			if(c == '<')
				open++;
			else if(c == '>' && open > 0){
				open--;
				diam++;
			}
		}
		return diam;
	}

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		String str;
		while(n-- > 0){
			str = br.readLine();
			System.out.println(countDiam(str));
		}
	}
}
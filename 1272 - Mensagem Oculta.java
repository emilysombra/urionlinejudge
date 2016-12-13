import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1272{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static String hiddenMessage(String str){
		StringBuilder sb = new StringBuilder();
		int len;
		str = str.trim();
		if(str.equals(""))
			return "\n";
		len = str.length();
		sb.append(str.charAt(0));
		for(int i = 1; i < len; i++){
			if(str.charAt(i) != ' ' && str.charAt(i-1) == ' ')
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0)
			System.out.println(hiddenMessage(br.readLine()));
	}
}


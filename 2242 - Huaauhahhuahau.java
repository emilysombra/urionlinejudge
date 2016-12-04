import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri2242{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static boolean risada(String str){
		String sovogal = "", reverse;
		int len = str.length();
		char c;
		for(int i = 0; i < len; i++){
			c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				sovogal += c;
		}
		reverse = new StringBuilder(sovogal).reverse().toString();
		if(reverse.equals(sovogal))
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException{
		String entrada = br.readLine();
		if(risada(entrada))
			System.out.println('S');
		else
			System.out.println('N');
	}
}

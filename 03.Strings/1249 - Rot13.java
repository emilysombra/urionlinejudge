import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uri1249{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static String rot13(String str){
		int len = str.length();
		String retorno = "";
		char c;
		for(int i = 0; i < len; i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				c = (char) (str.charAt(i) + 13);
				if(c > 'z')
					c = (char) (c - 26);
				retorno += c;
			}else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				c = (char) (str.charAt(i) + 13);
				if(c > 'Z')
					c = (char) (c - 26);
				retorno += c;
			}else
				retorno += str.charAt(i);
		}
		return retorno;
	}

	public static void main(String[] args) throws IOException{
		String entrada;
		while((entrada = br.readLine()) != null){
			System.out.println(rot13(entrada));
		}
	}
}
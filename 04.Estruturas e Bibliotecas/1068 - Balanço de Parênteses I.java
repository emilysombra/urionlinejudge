import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
	static boolean checkParen(String str){
		int len = str.length(), cont = 0;
		char c;
		boolean openclose = true;
		for(int i = 0; i < len; i++){
			c = str.charAt(i);
			if(c == '(')
				cont++;
			else if(c == ')' && cont > 0)
				cont--;
			else if(c == ')' && cont <= 0){
				openclose = false;
				cont--;
			}
		}
		if(cont == 0 && openclose)
			return true;
		return false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null){
			if(checkParen(str))
				System.out.println("correct");
			else
				System.out.println("incorrect");
		}
	}
}
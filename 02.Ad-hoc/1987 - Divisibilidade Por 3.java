import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static void div3(String str){
		int somaAlg = 0, len = str.length();
		char c;
		for(int i = 0; i < len; i++){
			c = str.charAt(i);
			somaAlg += Character.getNumericValue(c);
		}
		if(somaAlg%3==0)
			System.out.println(somaAlg + " sim");
		else
			System.out.println(somaAlg + " nao");
	}

	public static void main(String[] args) throws IOException{
		String ent;
		while((ent = br.readLine()) != null){
			String entrada[] = ent.split(" ");
			div3(entrada[1]);
		}
	}
}

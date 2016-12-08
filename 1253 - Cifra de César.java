import java.io.*;

public class uri1253{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static String cifraCesar(String msg, int cifra){
		String retorno = "";
		int len = msg.length();
		char c;
		for(int i = 0; i < len; i++){
			c = msg.charAt(i);
			if(((char) (c - cifra)) >= 'A'){
				c = (char) (c - cifra);
				retorno += c;
			}
			else{
				c = (char) (c - cifra);
				c = (char) (c + 26);
				retorno += c;
			}
		}
		return retorno;
	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine()), cifra;
		String msg;
		while(n-- > 0){
			msg = br.readLine();
			cifra = Integer.parseInt(br.readLine());
			System.out.println(cifraCesar(msg, cifra));
		}
	}
}

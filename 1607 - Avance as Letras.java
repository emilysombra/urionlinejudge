import java.io.*;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		String entrada = br.readLine();
		String[] str;
		int n = Integer.parseInt(entrada), len, a, b, trocas;
		while(n-- > 0){
			trocas = 0;
			entrada = br.readLine();
			str = entrada.split(" ");
			len = str[1].length();
			for(int i = 0; i < len; i++){
				a = (int) str[0].charAt(i);
				b = (int) str[1].charAt(i);
				if (b > a) {
					trocas += b - a;
				} else if(a > b){
					trocas += 26 - a + b;
				}
			}
			System.out.println(trocas);
		}
	}
}


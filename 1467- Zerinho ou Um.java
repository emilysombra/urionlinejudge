import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1467{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String entrada;
		int a, b, c;
		while((entrada = br.readLine()) != null){
			a = entrada.charAt(0) - 48;
			b = entrada.charAt(2) - 48;
			c = entrada.charAt(4) - 48;
			if(a == 0 && b == 0 && c == 0)
				System.out.println('*');
			else if(a == 1 && b == 0 && c == 0)
				System.out.println("A");
			else if(a == 0 && b == 1 && c == 0)
				System.out.println("B");
			else if(a == 0 && b == 0 && c == 1)
				System.out.println("C");
			else if(a == 0 && b == 1 && c == 1)
				System.out.println("A");
			else if(a == 1 && b == 0 && c == 1)
				System.out.println("B");
			else if(a == 1 && b == 1 && c == 0)
				System.out.println("C");
			else
				System.out.println('*');
		}
	}
}

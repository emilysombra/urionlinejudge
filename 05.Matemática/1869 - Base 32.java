import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class uri1869{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		String entrada = br.readLine();
		BigInteger bi = new BigInteger(entrada, 10);
		while(true){
			System.out.println(bi.toString(32).toUpperCase());
			if(bi.equals(BigInteger.valueOf(0)))
				break;
			entrada = br.readLine();
			bi = new BigInteger(entrada, 10);
		}
	}
}

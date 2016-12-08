import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class uri2158{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		String entrada;
		String[] faces;
		int cont = 1;
		BigInteger fp, fh, ligs, atomos;
		while((entrada = br.readLine()) != null){
			faces = entrada.split(" ");
			fp = new BigInteger(faces[0]);
			fh = new BigInteger(faces[1]);
			//ligs = ((fp*5) + (fh*6))/2;
			ligs = (fp.multiply(BigInteger.valueOf(5)));
			ligs = ligs.add(fh.multiply(BigInteger.valueOf(6)));
			ligs = ligs.divide(BigInteger.valueOf(2));
			//atomos = 2 + ligs - fp - fh;
			atomos = ((BigInteger.valueOf(2).add(ligs)).subtract(fp)).subtract(fh);
			System.out.println("Molecula #" + (cont++) + ".:.");
			System.out.println("Possui " + atomos + " atomos e " + ligs + " ligacoes\n");
		}
	}
}

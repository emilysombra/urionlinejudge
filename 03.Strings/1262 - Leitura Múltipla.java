import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1262{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	public static void main(String[] args) throws IOException{
		String rastro;
		int processos, r, ciclo, len;
		char c;
		while((rastro = br.readLine()) != null){
			processos = Integer.parseInt(br.readLine());
			r = 0;
			ciclo = 0;
			len = rastro.length();
			for(int i = 0; i<len;i++){
				c = rastro.charAt(i);
				if(c=='W'){
					ciclo++;
					if(r>0){
						r = 0;
						ciclo++;
					}
				}
				else if(c=='R'){
					r++;
					if(r==processos){
						ciclo++;
						r = 0;
					}
				}
			}
			if(r>0)
				ciclo++;
			System.out.println(ciclo);
		}
	}
}

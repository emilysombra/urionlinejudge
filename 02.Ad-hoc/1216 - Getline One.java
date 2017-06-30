import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1216{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String entrada1, entrada2;
		int qtd = 0;
		double dist = 0;
		while((entrada1 = br.readLine()) != null){
			entrada2 = br.readLine();
			dist+= Integer.parseInt(entrada2);
			qtd++;
		}
		dist /= qtd;
		System.out.printf("%.1f\n", dist);
	}
}

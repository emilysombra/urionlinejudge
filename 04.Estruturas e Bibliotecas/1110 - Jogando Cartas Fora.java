import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class uri1110{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws IOException{
		String line, remove;
		int n, base, num;
		while(!(line = br.readLine()).equals("0")){
			n = Integer.parseInt(line);
			if(n==1){
				pw.println("Discarded cards:");
				pw.println("Remaining card: 1");
			}else{
				List<Integer> cartas = new ArrayList<>();
				for(int i = 1; i <= n; i++)
					cartas.add(i);
				base = 2;
				remove = "";
				while(cartas.size() > 1){
					for(Iterator<Integer> iterator = cartas.iterator(); iterator.hasNext();){
						num = iterator.next();
						if(base == 2){
							base = 0;
							remove += num + ", ";
							iterator.remove();
						}
						base++;
					}
				}
				pw.println("Discarded cards: " + remove.substring(0, remove.length() - 2));
				pw.println("Remaining card: " + cartas.get(0));
			}
		}
		pw.close();
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1273{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		int n, align, len;
		String[] names;
		for(int i = 0; ; i++){
			n = Integer.parseInt(br.readLine());
			align = 0;
			if(n==0)
				break;
			else{
				if(i!=0)
					System.out.print('\n');
				names = new String[n];
				for(int k = 0; k < n; k++){
					names[k] = br.readLine();
					len = names[k].length();
					if(len>align)
						align = len;
				}
				for(int k = 0; k < n; k++)
					System.out.printf("%" + align + "s\n", names[k]);
			}
		}
	}
}

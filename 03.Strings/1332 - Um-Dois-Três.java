import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class uri1332{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int wichNum(String str){
		int len = str.length();
		String one = "one", two = "two";
		int compOne = 0, compTwo = 0;
		if(len>3)
			return 3;
		for(int i = 0; i<len; i++){
			if(str.charAt(i)==one.charAt(i))
				compOne++;
			else if(str.charAt(i)==two.charAt(i))
				compTwo++;
			if(compOne==2)
				return 1;
			else if(compTwo==2)
				return 2;
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0)
			System.out.println(wichNum(br.readLine()));
	}
}


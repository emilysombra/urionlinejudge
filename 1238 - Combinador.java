import java.util.Scanner;
class uri1238{
	static String strCombiner(String str1, String str2){
		String retorno = "";
		int len1 = str1.length(), len2 = str2.length(), lenMenor, i;
		if(len1 > len2)
			lenMenor = len2;
		else
			lenMenor = len1;
		for(i = 0; i < lenMenor; i++){
			retorno += str1.charAt(i);
			retorno += str2.charAt(i);
		}
		if(lenMenor == len1)
			retorno += str2.substring(i, len2);
		if(lenMenor == len2)
			retorno += str1.substring(i, len1);
		return retorno;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str1, str2;
		while(n-- > 0){
			str1 = scan.next();
			str2 = scan.next();
			System.out.println(strCombiner(str1, str2));
		}
	}
}
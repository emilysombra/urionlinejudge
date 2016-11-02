import java.io.*;
class uri1234{
    public static String dancing(String str){
        StringBuilder bodybuilder = new StringBuilder();
        int strlen = str.length(), count = 1;
        for(int i = 0; i < strlen; i++){
            char c = str.charAt(i);
            if(c == 32)
                bodybuilder.append(c);
            else if(c>=97 && c<=122){
                if(count%2 == 1)
                    c = (char) (str.charAt(i) - 32);
                bodybuilder.append(c);
                count++;
            }else if(c>=65 && c<=90){
                if(count%2 == 0)
                    c = (char) (str.charAt(i) + 32);
                bodybuilder.append(c);
                count++;
            }else
                bodybuilder.append(c);
        }
        return bodybuilder.toString();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null)
            System.out.println(dancing(line));
    }
}
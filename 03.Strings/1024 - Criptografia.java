import java.util.*;
class Main{
    public static String crip1(String msg){
        StringBuilder bodybuilder = new StringBuilder();
        for(int i = 0; i<msg.length(); i++){
            char c = msg.charAt(i);
            if(((c>=65) && (c<=90)) || (c>=97) && (c<=122)){
                c = (char) (msg.charAt(i) + 3);
                bodybuilder.append(c);
            }else{
                bodybuilder.append(c);
            }
        }
        return bodybuilder.reverse().toString();
    }
    public static String crip2(String msg){
        StringBuilder bodybuilder = new StringBuilder();
        for(int i = 0; i< msg.length(); i++){
            if(i<msg.length()/2){
                char c = (char) msg.charAt(i);
                bodybuilder.append(c); 
            }else{
                char c = (char) (msg.charAt(i) - 1);
                bodybuilder.append(c);
            }
        }
        return bodybuilder.toString();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s[] = new String[n+1];
        for(int i = 0; i < s.length; i++)
            s[i] = scan.nextLine();
        for(int i = 1; i < s.length; i++)
            System.out.println(crip2(crip1(s[i])));
    }
}

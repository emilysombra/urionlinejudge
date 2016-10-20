import java.util.*;
class uri1235{
    public static String reverse(String str){
        StringBuilder bodybuilder = new StringBuilder();
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            bodybuilder.append(str.charAt(i));
        }
        return bodybuilder.toString();
    }
    public static String avast(String str){
        int len = str.length();
        char halfbeg[] = new char[len/2];
        char halfend[] = new char[len/2];
        for(int i = 0; i<len/2; i++)
            halfbeg[i] = str.charAt(i);
        for(int i = len/2, j = 0; i<len; i++, j++)
            halfend[j] = str.charAt(i);
        String part1 = new String(halfbeg), part2 = new String(halfend);
        return reverse(part1) + reverse(part2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        String s[] = new String[n+1];
        for(int i = 0; i<s.length; i++)
            s[i] = scan.nextLine();
        for(int i = 1; i<s.length; i++)
            System.out.println(avast(s[i]));
    }
}
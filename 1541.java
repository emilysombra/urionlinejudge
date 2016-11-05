import java.util.*;
import java.text.*;
class uri1541{
    public static String customFormat(String pattern, double x){
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(x);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b, c, area;
        double pc, tt;   
        while(a != 0){
            b = scan.nextInt();
            c = scan.nextInt();
            area = a*b;
            pc = 100.0/c;
            tt = area*pc;
            tt = Math.floor(Math.sqrt(tt));
            System.out.println(customFormat("#.#", tt));
            a = scan.nextInt();  
        }
    }
}
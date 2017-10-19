import java.util.*;
class uri1168{
    public static int countled(String x){
        char[] alg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] qtdled = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int leds = 0, len = x.length();
        for(int i = 0; i<len; i++){
            for(int j = 0; j<10; j++){
                if(x.charAt(i) == alg[j]){
                    leds += qtdled[j];
                    break;
                }
            }
        }
        return leds;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i<n; i++){
            String x = scan.next();
            System.out.println(countled(x) + " leds");
        }
    }
}
import java.util.Scanner;
class uri1240{
    static void encaixa(int a, int b){
        String stra = Integer.toString(a), strb = Integer.toString(b);
        int len1 = stra.length(), len2 = strb.length(), lendif = len1-len2, j = 0;
        char c1, c2;
        for(int i = 0; i < len1; i++){
            if(i >= lendif){
                c1 = stra.charAt(i);
                c2 = strb.charAt(j);
                if(c1==c2)
                    j++;
                else
                    break;
            }
        }
        if(j==len2)
            System.out.println("encaixa");
        else
            System.out.println("nao encaixa");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt(), a, b;
        while(casos-- > 0){
            a = scan.nextInt();
            b = scan.nextInt();
            if(a == b)
                System.out.println("encaixa");
            else if( a < b)
                System.out.println("nao encaixa");
            else
                encaixa(a, b);
        }
    }
}
import java.util.Scanner;
class uri1960{
    static Scanner scan = new Scanner(System.in);
    static String toRoman(int n){
        String roman = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        if(n>3999 || n<1)
            return "Valor não permitido";
        else{
            for(int i = 0; i < values.length; i++){
                while(n >= values[i]){
                    roman += romans[i];
                    n -= values[i];
                }
            }
        }
        return roman;
    }
    public static void main(String[] args){    
        int n = scan.nextInt();
        System.out.println(toRoman(n));
    }
}
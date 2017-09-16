import java.util.Scanner;
class uri1864{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String soren = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
            System.out.print(soren.charAt(i));
        System.out.println("");       
    }
}
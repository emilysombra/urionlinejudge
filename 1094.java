import java.util.Scanner;
class uri1094{
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), coelho = 0, rato = 0, sapo = 0, x, total;
        String cobaia;
        while(n-- > 0){
            x = scan.nextInt();
            cobaia = scan.next();
            if(cobaia.equals("C"))
                coelho+=x;
            else if(cobaia.equals("R"))
                rato+=x;
            else if(cobaia.equals("S"))
                sapo+=x;
        }
        total = coelho+rato+sapo;
        double percentc = (100.0*coelho)/total, percentr = (100.0*rato)/total, percents = (100.0*sapo)/total;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentc);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentr);
        System.out.printf("Percentual de sapos: %.2f %%\n", percents);
    }
}
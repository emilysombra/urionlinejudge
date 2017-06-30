import java.util.*;
class uri1873{
    public static int jokenpo(String p1, String p2){
        //os dois iguais - dá empate
        if(p1.equals(p2))
            return 0;
        //são diferentes
        else{
            //palavra 1 = tesoura
            if(p1.equals("tesoura")){
                if(p2.equals("papel"))
                    return 1;
                else if(p2.equals("Spock") || p2.equals("spock"))
                    return 2;
                else if(p2.equals("pedra"))
                    return 2;
                else if(p2.equals("lagarto"))
                    return 1;
                else
                    return -1;
            }
            //palavra 1 = papel
            else if(p1.equals("papel")){
                if(p2.equals("tesoura"))
                    return 2;
                else if(p2.equals("Spock") || p2.equals("spock"))
                    return 1;
                else if(p2.equals("pedra"))
                    return 1;
                else if(p2.equals("lagarto"))
                    return 2;
                else
                    return -1;
            }
            //palavra 1 = pedra
            else if(p1.equals("pedra")){
                if(p2.equals("tesoura"))
                    return 1;
                else if(p2.equals("Spock") || p2.equals("spock"))
                    return 2;
                else if(p2.equals("papel"))
                    return 2;
                else if(p2.equals("lagarto"))
                    return 1;
                else
                    return -1;
            }
            //palavra 1 = Spock ou spock
            else if(p1.equals("Spock") || p1.equals("spock")){
                if(p2.equals("tesoura"))
                    return 1;
                else if(p2.equals("pedra"))
                    return 1;
                else if(p2.equals("papel"))
                    return 2;
                else if(p2.equals("lagarto"))
                    return 2;
                else
                    return -1;
            }
            //palavra 1 = lagarto
            else if(p1.equals("lagarto")){
                if(p2.equals("tesoura"))
                    return 2;
                else if(p2.equals("Spock") || p2.equals("spock"))
                    return 1;
                else if(p2.equals("papel"))
                    return 1;
                else if(p2.equals("pedra"))
                    return 2;
                else
                    return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x; 
        String sheldon, raj;
        while(n-- > 0){
            sheldon = scan.next();
            raj = scan.next();
            x = jokenpo(sheldon, raj);
            if(x==0)
                System.out.println("empate");
            else if(x==1)
                System.out.println("rajesh");
            else if(x==2)
                System.out.println("sheldon");
            else
                System.out.println("ERRO!");
        }
    }
}
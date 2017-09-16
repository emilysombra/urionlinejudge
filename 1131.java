import java.util.*;
class uri1131{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int control = 1, winInt = 0, winGre = 0, emp = 0;
        while(control==1){
            int golsInt = scan.nextInt(), golsGre = scan.nextInt();
            if(golsInt > golsGre)
                winInt++;
            else if(golsGre > golsInt)
                winGre++;
            else
                emp++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            control = scan.nextInt();
        }
        System.out.println((winGre+winInt+emp) + " grenais");
        System.out.println("Inter:" + winInt);
        System.out.println("Gremio:" + winGre);
        System.out.println("Empates:" + emp);
        if(winGre==winInt)
            System.out.println("Nao houve vencedor");
        else if(winGre>winInt)
            System.out.println("Gremio venceu mais");
        else
           System.out.println("Inter venceu mais"); 
    }
}
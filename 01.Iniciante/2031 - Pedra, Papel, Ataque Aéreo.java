import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
class uri2031{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int pedPapAt(String p1, String p2){
        if(Objects.equals(p1, p2)){
            if(Objects.equals(p1, "papel"))
                return 3;
            else if(Objects.equals(p1, "pedra"))
                return 0;
            else if(Objects.equals(p1, "ataque"))
                return 4;
            else
                return -1;
        }else{
            if(Objects.equals(p1, "ataque"))
                return 1;
            else if(Objects.equals(p1, "pedra")){
                if(Objects.equals(p2, "ataque"))
                    return 2;
                else if(Objects.equals(p2, "papel"))
                    return 1;
                else
                    return -1;
            }else if(Objects.equals(p1, "papel"))
                return 2;
            else
                return -1;
        }
    }
    public static void main(String[] args) throws IOException{
        String entrada = br.readLine(), p1, p2;
        int casos = Integer.parseInt(entrada), x;
        while(casos-- > 0){
            p1 = br.readLine();
            p2 = br.readLine();
            x = pedPapAt(p1, p2);
            if(x==0)
                System.out.println("Sem ganhador");
            else if(x==1)
                System.out.println("Jogador 1 venceu");
            else if(x==2)
                System.out.println("Jogador 2 venceu");
            else if(x==3)
                System.out.println("Ambos venceram");
            else if(x==4)
                System.out.println("Aniquilacao mutua");
            else
                System.out.println("ERRO!"); 
        }
    }
}
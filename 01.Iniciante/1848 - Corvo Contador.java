import java.io.*;
import java.util.Objects;
class uri1848{
    public static int blink(String corvo){
        double n = 0;
        int pot[] = {2, 1, 0};
        for(int i = 0; i<3; i++){
            if(corvo.charAt(i)=='*')
                n += Math.pow(2, pot[i]);
        }
        int x = (int) n;
        return x;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String corvo;
        int n = 0;
        while((corvo = br.readLine()) != null){
            if(Objects.equals(corvo, "caw caw ") || Objects.equals(corvo, "caw caw")){
                System.out.println(n);
                n = 0;
            }
            else
                n += blink(corvo);
        }
    }
}
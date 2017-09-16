import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class uri1237{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int strComp(String str1, String str2){
        //verificar qual é a maior e a menor string
        String max, min;
        if(str1.length() > str2.length()){
            max = str1;
            min = str2;
        }else{
            max = str2;
            min = str1;
        }
        // obtem o tamanho da menor string e cria uma variável com o tamanho da maior substring comum (maxS)
        int minLen = min.length(), maxS = minLen;
        //variavel para quebrar o while
        boolean f = true;
        //inicio do laço de repetição
        //enquanto maxS for positiva e f for verdadeira
        while(maxS > 0 && f){
            //diferença entre o tamanho da maior substring e o tamanho da menor string
            //a diferença começa sendo 0 e atualiza conforme o laço vai rodando
            int dif = minLen - maxS;
            for(int i = 0; i<=dif; i++){
                //verifica se a string maior contém uma substring de tamanho maxS
                //se verdadeira, muda f para false, soma um no maxS e sai do for
                if(max.contains(min.substring(i, i + maxS))){
                    f = false;
                    maxS++;
                    break;
                }
            }
            //atualiza o valor de maxS
            maxS--;
        }
        return maxS;
    }
    public static void main(String[] args) throws IOException{
        String line1, line2;
        while((line1 = br.readLine()) != null){
            line2 = br.readLine();
            System.out.println(strComp(line1, line2));
        }     
    }
}
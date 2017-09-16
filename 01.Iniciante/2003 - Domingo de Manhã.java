import java.io.*;
class uri2003{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        String entrada;
        String[] acordar = new String[2];
        int hora, min;
        while((entrada = br.readLine()) != null){
            acordar = entrada.split(":");
            hora = Integer.parseInt(acordar[0]) + 1;
            min = Integer.parseInt(acordar[1]);
            if(hora >= 8)
                System.out.println("Atraso maximo: " + ((hora - 8)*60 + min));
            else
                System.out.println("Atraso maximo: 0");
        }
    }
}
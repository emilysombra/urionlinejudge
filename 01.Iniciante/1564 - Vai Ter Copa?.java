import java.io.*;
class uri1564{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int n;
        while((line = br.readLine()) != null){
            n = Integer.parseInt(line);
            if(n==0)
                System.out.println("vai ter copa!");
            else
                System.out.println("vai ter duas!");
        }
    }
}
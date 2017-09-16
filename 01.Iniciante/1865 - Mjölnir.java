import java.util.*;
class uri1865{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt(), forca;
        while(n-- > 0){
            String nome = scan.next();
            forca = scan.nextInt();
            if(Objects.equals(nome, "Thor"))
                System.out.println("Y");
            else
                System.out.println("N");
        }     
    }
}
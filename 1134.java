import java.util.*;
class uri1134{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), alc = 0, gas = 0, di = 0;
        while(n!=4){
            if(n==1){
                alc++;
                n = scan.nextInt();
            }else if(n==2){
                gas++;
                n = scan.nextInt();
            }else if(n==3){
                di++;
                n = scan.nextInt();
            }else{
                while(n!=1 && n!=2 && n!=3 && n!= 4)
                   n = scan.nextInt(); 
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + di);

    }
}
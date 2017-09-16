import java.util.*;
class uri1179{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int par[] = new int[5];
        int impar[] = new int[5];
        int cPar = 0, cImpar = 0;
        for(int i = 0; i < 15; i++){
            int x = scan.nextInt();
            if(x%2==0)
                par[cPar++] = x;
            else
                impar[cImpar++] = x;
            if(cPar==5){
                for(int j = 0; j<5; j++)
                    System.out.println("par[" + j + "] = " + par[j]);
                cPar = 0;
            }
            if(cImpar==5){
                for(int j = 0; j<5; j++)
                    System.out.println("impar[" + j + "] = " + impar[j]);
                cImpar = 0;
            }
        }
        if(cImpar>0){
            for(int i = 0; i < cImpar; i++)
                System.out.println("impar[" + i + "] = " + impar[i]);
        }
        if(cPar>0){
            for(int i = 0; i < cPar; i++)
                System.out.println("par[" + i + "] = " + par[i]);
        }
    }
}
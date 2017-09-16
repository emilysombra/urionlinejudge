import java.util.*;
class uri1066{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;
        for(int i = 0; i<5; i++){
            x = scan.nextInt();
            if(x % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
            if(x > 0){
                contPos++;
            }
            if(x < 0){
                contNeg++;
            }
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPos + " valor(es) positivo(s)");
        System.out.println(contNeg + " valor(es) negativo(s)");
	}
}
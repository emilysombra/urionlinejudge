import java.util.*;
class uri1051{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double salario;
		salario = scan.nextDouble();
		if(salario <= 2000){
            System.out.printf("Isento\n");
        }else if((salario > 2000) && (salario <= 3000)){
            double valorImposto = salario - 2000;
            valorImposto *= 0.08;
            System.out.printf("R$ %.2f\n", valorImposto);
        }else if((salario > 3000) && (salario <= 4500)){
            salario -= 3000;
            double valorImposto = (salario*0.18)+80;
            System.out.printf("R$ %.2f\n", valorImposto);
        }else{
            salario -= 4500;
            double valorImposto = (salario*0.28)+350;
            System.out.printf("R$ %.2f\n", valorImposto);
        }
	}
}
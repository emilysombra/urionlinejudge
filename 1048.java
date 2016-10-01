import java.util.*;
class uri1048{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double salario;
		salario = scan.nextDouble();
		if(salario <= 400){
			double novoSalario = salario + (salario*0.15);
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", novoSalario, novoSalario-salario);
		}else if((salario > 400) && (salario <= 800)){
			double novoSalario = salario + (salario*0.12);
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", novoSalario, novoSalario-salario);
		}else if((salario > 800) && (salario <= 1200)){
			double novoSalario = salario + (salario*0.1);
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", novoSalario, novoSalario-salario);
		}else if((salario > 1200) && (salario <= 2000)){
			double novoSalario = salario + (salario*0.07);
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", novoSalario, novoSalario-salario);
		}else{
			double novoSalario = salario + (salario*0.04);
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", novoSalario, novoSalario-salario);
		}
	}
}
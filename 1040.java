import java.util.Scanner;
import java.text.*;
class uri1040{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		n4 = scan.nextDouble();
		media = ((n1*2) + (n2*3) + (n3*4) + n4)/10;
		if(media >= 7){
			customFormat("##.0", media);
			System.out.print("Aluno aprovado.\n");
		}else if(media >= 5){
			customFormat("##.0", media);
			System.out.print("Aluno em exame.\n");
			double nExam = scan.nextDouble();
			format("##.0", nExam);
			media = (media + nExam)/2;
			if(media >= 5){
				System.out.print("Aluno aprovado.\n");
				finalFormat("##.0", media);
			}else{
				System.out.print("Aluno reprovado.\n");
				finalFormat("##.0", media);
			}
		}else{
			customFormat("##.0", media);
			System.out.print("Aluno reprovado.\n");
		}
		
	}

	static public void customFormat(String pattern, double value){
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.print("Media: " + output + "\n");
	}
	static public void format(String pattern, double value){
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.print("Nota do exame: " + output + "\n");
	}
	static public void finalFormat(String pattern, double value){
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.print("Media final: " + output + "\n");
	}
}
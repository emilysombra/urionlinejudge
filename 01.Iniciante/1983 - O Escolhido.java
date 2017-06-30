import java.util.Scanner;
class uri1983{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int alunos = scan.nextInt(), numMaior = 0, numAtual;
		double notaMaior = 0, notaAtual;
		while(alunos-- > 0){
			numAtual = scan.nextInt();
			notaAtual = scan.nextDouble();
			if(notaAtual > notaMaior){
				notaMaior = notaAtual;
				numMaior = numAtual;
			}
		}
		if(notaMaior < 8)
			System.out.println("Minimum note not reached");
		else
			System.out.println(numMaior);
	}
}
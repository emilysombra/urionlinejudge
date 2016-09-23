import java.util.Scanner;
class uri1047{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int horaInicio, horaFim, minInicio, minFim, totalMin, totalHoras;
		horaInicio = scan.nextInt();
		minInicio = scan.nextInt();
		horaFim = scan.nextInt();
		minFim = scan.nextInt();
		totalMin = minFim - minInicio;
		totalHoras = horaFim - horaInicio;
		if((totalHoras==0) && (totalMin==0)){
			System.out.print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
		}else{
			if((totalMin < 0) && (totalHoras < 0)){
				totalHoras += 24;
				System.out.print("O JOGO DUROU " + (--totalHoras) + " HORA(S) E " + (totalMin + 60)+ " MINUTO(S)\n");
			}else if((totalMin >= 0) && (totalHoras < 0)){
				System.out.print("O JOGO DUROU " + (totalHoras + 24) + " HORA(S) E " + (totalMin)+ " MINUTO(S)\n");
			}else if((totalMin < 0) && (totalHoras >= 0)){
				System.out.print("O JOGO DUROU " + (--totalHoras) + " HORA(S) E " + (totalMin + 60)+ " MINUTO(S)\n");
			}else{
				System.out.print("O JOGO DUROU " + (totalHoras) + " HORA(S) E " + (totalMin)+ " MINUTO(S)\n");
			}
		}
	}
}
import java.util.Scanner;
class uri1214{
    static Scanner scan = new Scanner(System.in);  
    public static void main(String[] args){    
        int numCasos = scan.nextInt(), numAlunos, cont;
        double mediaTurma, porcentagem;
        while(numCasos-- > 0){
            mediaTurma = 0;
            porcentagem = 0;
            cont = 0;
            numAlunos = scan.nextInt();
            int[] notas = new int[numAlunos];
            for(int i = 0; i < numAlunos; i++){
                notas[i] = scan.nextInt();
                mediaTurma += notas[i];
            }
            mediaTurma /= numAlunos;
            for(int i = 0; i < numAlunos; i++){
                if(notas[i] > mediaTurma)
                    cont++;
            }
            porcentagem = (100.0 * cont)/numAlunos;
            System.out.printf("%.3f%%\n", porcentagem);
        }
    }
}
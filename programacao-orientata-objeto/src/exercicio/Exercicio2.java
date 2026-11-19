
package exercicio;
import java.util.Scanner;


public class Exercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        int j=0, ind=1;
        
        Escola alunos[] = new Escola[3];
        alunos[0] = new Escola();
        alunos[1] = new Escola();
        alunos[2] = new Escola();
        
        System.out.println("=================== Registrar Aluno ===================");
            for (Escola aluno : alunos) {
                System.out.println("\n"+ind+"- Aluno");
                System.out.println("Nome: ");
                aluno.nome = sc.nextLine();

                System.out.println("Matricula: ");
                aluno.matricula = sc.nextInt();
                while(j==0){
                    System.out.println("1- Nota: ");
                    a = sc.nextDouble();

                    System.out.println("2- Nota: ");
                    b = sc.nextDouble();

                    System.out.println("3- Nota: ");
                    c = sc.nextDouble();

                    System.out.println("4- Nota: ");
                    d = sc.nextDouble();

                    if (a >= 0 && a <= 10 && b >= 0 && b <= 10 && c >= 0 && c <= 10 && d >= 0 && d <= 10) {
                        aluno.registrarNotas(a, b, c, d);
                        System.out.println("Aluno Registrado");
                        j++;
                    } else {
                        System.out.println("Aluno nao registrado registre as notas novamente!  \n(Notas devem ser entre 0 e 10)");
                    }
                }
                ind++;
                j=0;
                sc.nextLine();
            }
        
        
        System.out.println("\n\n========================= Registros =========================");
        
        for (int i=0; i<3; i++) {
            System.out.println("\n============= "+(i+1)+"- Aluno =============");
            alunos[i].exibirAluno();
        }
        sc.close();
    }
}
    

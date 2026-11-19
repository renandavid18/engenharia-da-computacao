// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package Aluno;

import java.util.Scanner;

public class aluno_test {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int c = 0;
      int d = 0;

      int j;
      for(j = 0; c <= 0; c = sc.nextInt()) {
         System.out.println("Ir� adicionar quantos alunos? ");
      }

      aluno[] aluno = new aluno[d];
      aluno[d] = new aluno();

      while(j == 0) {
         System.out.println("Selecione: ");
         System.out.println("1- Cadastrar Aluno");
         System.out.println("2- Ver Alunos");
         System.out.println("3- Sair");
         int op = sc.nextInt();
         switch (op) {
            case 1:
               if (d < c) {
                  aluno[d].cadastrar_aluno();
                  ++d;
               } else {
                  System.out.println("Maximo de Alunos atingidos!");
               }
               break;
            case 2:
               if (d < c) {
                  for(int i = 0; i < d; ++i) {
                     aluno[i].exibir_aluno();
                  }
                  break;
               }

               System.out.println("N�o tem Alunos cadastrados!");
               break;
            case 3:
               System.out.println("Fechando o Sistema");
               ++j;
               break;
            default:
               System.out.println("op��o incorreta");
         }
      }

      sc.close();
   }
}

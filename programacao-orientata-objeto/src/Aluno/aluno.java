package Aluno;

import java.util.Scanner;

public class aluno {
   public Scanner sc;
   public String nome;
   public String sexo;
   public String matricula;
   public int idade;
   public double[][] notas;
   public double[] soma;
   public double[] media;

   public aluno() {
      this.sc = new Scanner(System.in);
      this.notas = new double[4][4];
      this.soma = new double[4];
      this.media = new double[4];
   }

   public void cadastrar_aluno() {
      System.out.println("Nome: ");
      this.nome = this.sc.nextLine();
      System.out.println("Sexo: ");
      this.sexo = this.sc.nextLine();
      System.out.println("Matricula: ");
      this.matricula = this.sc.nextLine();
      System.out.println("Idade: ");
      this.idade = this.sc.nextInt();
      this.sc.nextLine();
      this.nota_mat();
      this.nota_port();
      this.nota_hist();
      this.nota_geo();
   }

   public void exibir_aluno() {
      System.out.println("Nome: " + this.nome);
      System.out.println("Sexo: " + this.sexo);
      System.out.println("Matricula: " + this.matricula);
      System.out.println("Idade: " + this.idade);
      this.exibir_mat();
      this.exibir_port();
      this.exibir_hist();
      this.exibir_geo();
   }

   public void nota_mat() {
      System.out.println("Notas Matemática");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: ");
         this.notas[0][i] = this.sc.nextDouble();
         double[] var10000 = this.soma;
         var10000[0] += this.notas[2][i];
      }

      this.media[0] = this.soma[0] / (double)4.0F;
      this.sc.nextLine();
   }

   public void nota_port() {
      System.out.println("Notas Português");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: ");
         this.notas[1][i] = this.sc.nextDouble();
         double[] var10000 = this.soma;
         var10000[1] += this.notas[2][i];
      }

      this.media[1] = this.soma[1] / (double)4.0F;
      this.sc.nextLine();
   }

   public void nota_hist() {
      System.out.println("Notas História");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: ");
         this.notas[2][i] = this.sc.nextDouble();
         double[] var10000 = this.soma;
         var10000[2] += this.notas[2][i];
      }

      this.media[2] = this.soma[2] / (double)4.0F;
      this.sc.nextLine();
   }

   public void nota_geo() {
      System.out.println("Notas Geografia");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: ");
         this.notas[3][i] = this.sc.nextDouble();
         double[] var10000 = this.soma;
         var10000[3] += this.notas[2][i];
      }

      this.media[3] = this.soma[3] / (double)4.0F;
      this.sc.nextLine();
   }

   public void exibir_mat() {
      System.out.println("Notas Matemática");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: " + this.notas[0][i]);
         System.out.println("Media: " + this.media[0]);
      }

   }

   public void exibir_port() {
      System.out.println("Notas Português");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: " + this.notas[1][i]);
         System.out.println("Media: " + this.media[1]);
      }

   }

   public void exibir_hist() {
      System.out.println("Notas História");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: " + this.notas[2][i]);
         System.out.println("Media: " + this.media[2]);
      }

   }

   public void exibir_geo() {
      System.out.println("Notas Geografia");

      for(int i = 0; i < 4; ++i) {
         System.out.println(i + 1 + "- Nota: " + this.notas[3][i]);
         System.out.println("Media: " + this.media[3]);
      }

   }
}

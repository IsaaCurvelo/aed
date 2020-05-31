package br.uema.mestrado.lista2;

import java.util.Arrays;

public class Q2 {

  private static class Aluno {
    private final double[] notas;

    public Aluno(double... notas) {
      this.notas = notas;
    }

    public void getSituacaoAluno() {
      double media = Arrays.stream(notas).reduce(0, (a, b) -> a + b) / notas.length;

      if (media >= 7d) {
        System.out.println("o aluno foi aprovado");
      } else if (media >= 5d) {
        System.out.println("o aluno ficou de recuperação");
      } else {
        System.out.println("o aluno foi reprovado");
      }
    }
  }

  public static void main(String[] args) {
    Aluno aluno1 = new Aluno(7.5, 6d, 10d);
    aluno1.getSituacaoAluno();

    Aluno aluno2 = new Aluno(7.5, 6d, 10d, 9.4, 1);
    aluno2.getSituacaoAluno();

    Aluno aluno3 = new Aluno(7.5, 1d, 3d);
    aluno3.getSituacaoAluno();
  }
}

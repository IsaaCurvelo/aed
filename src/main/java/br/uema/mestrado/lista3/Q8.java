package br.uema.mestrado.lista3;

import java.util.Arrays;

public class Q8 {

  private static class Turma {
    private final int qtdAlunos;

    public Turma(int qtdAlunos) {
      if (qtdAlunos > 40)
        throw new RuntimeException("a quantidade de alunos por turma não pode ser maior que 40");

      this.qtdAlunos = qtdAlunos;
    }

  }

  public static void main(String[] args) {
    int numeroTurmas = 4;
    int[] alunosPorTurma = {31, 12, 24, 40};

    Turma[] turmas = new Turma[numeroTurmas];

    for (int i = 0; i < numeroTurmas; i++) {
      turmas[i] = new Turma(alunosPorTurma[i]);
    }

    double media = Arrays.stream(turmas)
            .map(t -> (double) t.qtdAlunos)
            .reduce(0d, (a, b) -> a + b)
            / numeroTurmas;
    System.out.println("o número médio de alunos por turma é: " + media);

  }
}

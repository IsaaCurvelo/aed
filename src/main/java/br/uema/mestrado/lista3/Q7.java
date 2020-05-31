package br.uema.mestrado.lista3;

import java.util.Arrays;

public class Q7 {
  private final int numeroEleitores;

  public Q7(int n) {
    this.numeroEleitores = n;
    int cand1 = 0, cand2 = 0, cand3 = 0;

    for (int i = 0; i < n; i++) {
      if (i % 3 == 0) {
        cand1++;
      } else if (i % 2 == 0 && i % 5 != 0) {
        cand2++;
      } else {
        cand3++;
      }
    }
    System.out.println("número de votos do candidato 1: " + cand1);
    System.out.println("número de votos do candidato 2: " + cand2);
    System.out.println("número de votos do candidato 3: " + cand3);
  }


  public static void main(String[] args) {
    new Q7(500);
  }
}

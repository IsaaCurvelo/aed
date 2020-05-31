package br.uema.mestrado.lista3;

import java.util.Arrays;

public class Q2 {

  private final int[] n;

  public Q2(int... n) {
    this.n = n;

    int soma = Arrays.stream(n).reduce(0, (a,b) -> a + b);
    System.out.println("soma: " + soma);
    System.out.println("média: " + soma / n.length);
  }


  public static void main(String[] args) {
    new Q2(1, 2, 3, 4, 5);
  }
}

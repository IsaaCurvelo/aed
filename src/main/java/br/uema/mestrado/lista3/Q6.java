package br.uema.mestrado.lista3;

import java.util.Arrays;

public class Q6 {
  private final int[] n;

  public Q6(int ... n1) {
    this.n = n1;
    double media = Arrays.stream(n).reduce(0, (a,b) -> a + b) / n.length;
    if (media <= 25d) {
      System.out.println("jovem");
    } else if(media <= 60) {
      System.out.println("adulta");
    } else {
      System.out.println("idosa");
    }
  }


  public static void main(String[] args) {
    new Q6(1, 50, 36, 22, 27, 26, 25, 23);
  }
}

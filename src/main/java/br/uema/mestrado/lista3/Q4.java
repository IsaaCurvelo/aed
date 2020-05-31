package br.uema.mestrado.lista3;

public class Q4 {
  private final int n1, n2;

  public Q4(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;


    for (int i = n1; i <= n2; i++) {
      if (i % 2 == 1)
        System.out.printf("%d ", i);
    }
  }


  public static void main(String[] args) {
    new Q4(1, 50);
  }
}

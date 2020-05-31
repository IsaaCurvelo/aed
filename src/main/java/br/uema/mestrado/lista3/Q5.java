package br.uema.mestrado.lista3;

public class Q5 {
  private final int n1, n2;

  public Q5(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
    int soma = 0;

    for (int i = n1; i <= n2; i++) {
      if (i % 2 == 1)
        soma += i;
      System.out.printf("%d ", i);
    }
    System.out.println("\nsoma = " + soma);
  }


  public static void main(String[] args) {
    new Q5(1, 50);
  }
}

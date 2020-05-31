package br.uema.mestrado.lista3;

public class Q1 {

  private final int n1, n2, n3, n4, n5;

  public Q1(int n1, int n2, int n3, int n4, int n5) {
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    this.n4 = n4;
    this.n5 = n5;

    int maior = n1;

    if (n2 > maior) {
      maior = n2;
    }
    if (n3 > maior) {
      maior = n3;
    }
    if (n4 > maior) {
      maior = n4;
    }
    if (n5 > maior) {
      maior = n5;
    }

    System.out.println(maior);
  }


  public static void main(String[] args) {
    new Q1(1, 2, 3, 4, 5);
  }
}

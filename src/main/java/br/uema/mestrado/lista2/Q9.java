package br.uema.mestrado.lista2;

public class Q9 {

  private final double n1, n2, n3;

  private Q9(double n1, double n2, double n3) {
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;

    double maior = n1;

    if (n2 > maior) {
      maior = n2;
    } if (n3 > maior) {
      maior = n3;
    }

    System.out.println(maior);
  }


  public static void main(String[] args) {
    new Q9(3d, 1d, 2d);
  }
}

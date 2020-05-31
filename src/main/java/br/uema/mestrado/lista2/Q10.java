package br.uema.mestrado.lista2;

public class Q10 {

  private final double n;

  private Q10(double n) {
    this.n = n;
    if (n > 0) {
      System.out.println("positivo");
    } else if (n < 0) {
      System.out.println("negativo");
    }
  }


  public static void main(String[] args) {
    new Q10(3);
    new Q10(-3);
  }
}


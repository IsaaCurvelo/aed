package br.uema.mestrado.lista2;

public class Q3 {

  private final int n1, n2;
  private final double n3;


  public Q3(int n1, int n2, double n3) {
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  public void computar() {
    System.out.println("o produto do dobro do primeiro com metade do segundo " + n1 * n2);
    System.out.println("a soma do triplo do primeiro com o terceiro " + 3 * n1 + n3);
    System.out.println("o produto do dobro do primeiro com metade do segundo " + n3 * n3 * n3);
  }


  public static void main(String[] args) {
    new Q3(2, 3, 3.d).computar();
  }
}


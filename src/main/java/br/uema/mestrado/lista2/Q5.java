package br.uema.mestrado.lista2;

public class Q5 {

  private static class Pintura {
    private final double area;

    public Pintura(double area) {
      this.area = area;
    }

    public void computar() {
      double coberturaLata = 3d * 18;
      double qtdLatas = Math.ceil(area/coberturaLata);

      System.out.println("quantidades de latas de tinta a serem compradas: " + qtdLatas);
      System.out.println("preço total: " + qtdLatas * 80d);
    }
  }


  public static void main(String[] args) {
    new Pintura(20d).computar();
  }
}

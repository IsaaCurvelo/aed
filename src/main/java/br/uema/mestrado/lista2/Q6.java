package br.uema.mestrado.lista2;

public class Q6 {

  private static class Pintura {
    private final double area;

    public Pintura(double area) {
      this.area = area;
    }

    public void computar() {
      double coberturaLata = 6d * 18d;
      double coberturaGalao = 6d * 3.6;
      double qtdLatas = Math.ceil(area/coberturaLata);
      double qtdGaloes = Math.ceil(area/coberturaGalao);

      double valorApenasLatas = qtdLatas * 80d;
      double valorApenasGaloes = qtdLatas * 25d;

      System.out.println("apenas latas de 18 litros: " + qtdLatas);
      System.out.println("preço total: " + valorApenasLatas);
      System.out.println("\n\napenas galões de 3,6 litros: " + qtdGaloes);
      System.out.println("preço total: " + valorApenasGaloes);
    }
  }


  public static void main(String[] args) {
    new Pintura(200d).computar();
  }
}


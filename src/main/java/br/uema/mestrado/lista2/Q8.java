package br.uema.mestrado.lista2;

public class Q8 {

  private static class Download {
    private final double tamArquivo, velocidadeLink;

    private Download(double tamArquivo, double velocidadeLink) {
      this.tamArquivo = tamArquivo;
      this.velocidadeLink = velocidadeLink;
    }


    public void computar() {
      System.out.println("Tempo estimado para download de " + (tamArquivo/velocidadeLink/60) + " min");
    }
  }


  public static void main(String[] args) {
    new Download(2000d, 5d).computar();
  }
}

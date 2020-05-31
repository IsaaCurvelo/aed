package br.uema.mestrado.lista3;

import java.util.Arrays;

public class Q9 {

  private static class Colecao {
    private final double[] precosDiscos;

    public Colecao(double... precosDiscos) {
      this.precosDiscos = precosDiscos;
    }

    public double media() {
      return Arrays.stream(precosDiscos).reduce(0.0, (a, b) -> a + b) / precosDiscos.length;
    }
  }

  public static void main(String[] args) {
    System.out.println("o valor médio gasto por disco é: " + new Colecao(10.0, 30.21, 12, 66.42, 5.50).media());
  }
}

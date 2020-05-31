package br.uema.mestrado.lista2;

import java.util.Arrays;

public class Q4 {

  private static class Salario {
    private final double salarioHora;
    private final int jornadaMensal;

    public Salario(double salarioHora, int jornadaMensal) {
      this.salarioHora = salarioHora;
      this.jornadaMensal = jornadaMensal;
    }

    public void computar() {
      double salarioBruto = salarioHora * jornadaMensal;
      double salLiq = salarioBruto
              - (salarioBruto * .11d) //IR
              - (salarioBruto * .08d) //INSS
              - (salarioBruto * .05d); //Sindicato

      System.out.println("salário bruto: " + salarioBruto);
      System.out.println("quanto pagou ao INSS: " + salarioBruto * .08d);
      System.out.println("quanto pagou ao sindicato: " + salarioBruto * .05d);
      System.out.println("quanto pagou ao sindicato: " + salLiq);
    }
  }

  public static void main(String[] args) {
    new Salario(15d, 176).computar();
  }
}

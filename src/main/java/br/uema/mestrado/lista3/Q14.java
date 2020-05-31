package br.uema.mestrado.lista3;

import java.util.Scanner;

public class Q14 {
  static class Pagamentos {

    double totalPago = 0d;
    int totalPagamentos = 0;

    public double valorPagamento(double valorPrestacao, int diasAtraso) {
      totalPagamentos++;

      if (diasAtraso == 0) {
        totalPago += valorPrestacao;
        return valorPrestacao;
      }

      double valorComJuros = valorPrestacao * 1.03; // multa

      for (int i = 0; i < diasAtraso; i++) {
        valorComJuros *= 1.01; // juros compostos sobre a multa
//        valorComJuros += valorPrestacao * .01; // juros simples sem a multa
      }
      totalPago += valorComJuros;
      return valorComJuros;
    }
  }


  public static void main(String[] args) {
    double valorPrestacao = 1;
    int diasAtraso = 0;

    Scanner scanner = new Scanner(System.in);
    Pagamentos pgmts = new Pagamentos();

    while (true) {
      System.out.print("Digite o valor da parcerla: ");
      valorPrestacao = Double.valueOf(scanner.nextLine()).doubleValue();
      if (valorPrestacao == 0) {
        break;
      }

      System.out.print("Digite os dias em atraso: ");
      diasAtraso = Integer.valueOf(scanner.nextLine()).intValue();

      double vlr = pgmts.valorPagamento(valorPrestacao, diasAtraso);
      System.out.println("valor a ser pago: " + vlr);
    }

    System.out.println("Relatorio prestacões pagas no dia:");
    System.out.println("valor total: " + pgmts.totalPago);
    System.out.println("número de pagamentos: " + pgmts.totalPagamentos);
  }

}

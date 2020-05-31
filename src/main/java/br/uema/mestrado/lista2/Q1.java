package br.uema.mestrado.lista2;

public class Q1 {

  private static class Emprestimo {
    private final double salarioBruto, descontosSalario, valorEmprestimo;

    public Emprestimo(double salarioBruto, double descontosSalario, double valorEmprestimo) {
      this.salarioBruto = salarioBruto;
      this.descontosSalario = descontosSalario;
      this.valorEmprestimo = valorEmprestimo;
    }

    public boolean isemprestimoAprovado() {
      return valorEmprestimo <= (salarioBruto - descontosSalario) * .3d;
    }
  }


  public static void main(String[] args) {
    Emprestimo emprestimo1 = new Emprestimo(5780, 1100, 3000);
    System.out.println(emprestimo1.isemprestimoAprovado());

    Emprestimo emprestimo2 = new Emprestimo(5780, 1100, 1400);
    System.out.println(emprestimo2.isemprestimoAprovado());
  }
}

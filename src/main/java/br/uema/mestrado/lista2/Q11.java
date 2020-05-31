package br.uema.mestrado.lista2;

public class Q11 {

  private final char n;

  private Q11(char n) {
    this.n = n;
    if (n == 'F') {
      System.out.println("F - Feminino");
    } else if (n == 'M') {
      System.out.println("M - Masculino");
    } else {
      System.out.println("Sexo Inválido");
    }
  }


  public static void main(String[] args) {
    new Q11('F');
    new Q11('M');
    new Q11('X');
  }
}


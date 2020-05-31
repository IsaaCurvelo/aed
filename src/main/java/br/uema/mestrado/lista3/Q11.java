package br.uema.mestrado.lista3;

public class Q11 {

  public static char metodo1Argumento(int n) {
    if (n > 0) {
      return 'P';
    }

    if (n < 0) {
      return 'N';
    }
    return 'þ';
  }

  public static void main(String[] args) {
    System.out.println("resultado: " + Q11.metodo1Argumento(1));
    System.out.println("resultado: " + Q11.metodo1Argumento(0));
    System.out.println("resultado: " + Q11.metodo1Argumento(-1));
  }
}


package br.uema.mestrado.lista2;

public class Q12 {

  private final char letra;

  private Q12(char l) {
    this.letra = l;

    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
      System.out.println("Vogal!");
    } else if (letra == 'q' || letra == 'w' || letra == 'r' || letra == 't' || letra == 'y' || letra == 'p' || letra == 's'
            || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j' || letra == 'k' || letra == 'l'
            || letra == 'z' || letra == 'x' || letra == 'c' || letra == 'v' || letra == 'b' || letra == 'n' || letra == 'm') {
      System.out.println("Consoante!");
    }
  }


  public static void main(String[] args) {
    new Q12('s');
    new Q12('e');
    new Q12('x');
  }
}


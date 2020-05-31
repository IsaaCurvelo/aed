package br.uema.mestrado.lista3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Q15 {

  static final Random random = new Random();

  static String[] lerArquivo() throws IOException {
    InputStream is = Q15.class.getResourceAsStream("/palavras.txt");
    InputStreamReader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
    BufferedReader bufferedReader = new BufferedReader(reader);

    List<String> palavras = new ArrayList<>();

    String linha = bufferedReader.readLine();
    while (linha != null) {
      palavras.add(linha);
      linha = bufferedReader.readLine();
    }

    return palavras.toArray(new String[0]);
  }

  static String sorteia(String[] palavras) {
    return palavras[random.nextInt(palavras.length)];
  }

  static String embaralha(String palavra) {
    if (palavra.length() < 2) {
      return palavra;
    } else {

      char[] arr = palavra.toCharArray();

      for (int i = 0; i < arr.length; i++) {
        int j = random.nextInt(arr.length);
        char swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
      }
      return new String(arr);
    }
  }


  public static void main(String[] args) throws IOException {
    int tentativas = 6;
    Scanner scanner = new Scanner(System.in);

    String[] palavras = lerArquivo();
    String palavraSorteada = sorteia(palavras);
    String palavraEmbaralhada = embaralha(palavraSorteada);

    String tentativa;

    System.out.println("palavra embaralhada: " + palavraEmbaralhada);

    while (tentativas > 0) {
      System.out.println("Tentativas restantes: " + tentativas);
      System.out.println("GO!");
      tentativa = scanner.nextLine();

      if (tentativa.equals(palavraSorteada)) {
        System.out.println("Acertou, mizeravi!");
        return;
      } else {
        tentativas--;
        System.out.println("Erooooou!!!!");
      }
    }


    System.out.println("a palavra era " + palavraSorteada + ", besta...");
  }
}

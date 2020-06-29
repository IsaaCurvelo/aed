package br.uema.mestrado.avaliacao.exerciciodeavaliacao;

public class Q2 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(String.format("somatório de 1 a %d é %d", n, somatorio(n)));
    }


    private static int somatorio(int n) {
        if (n <= 1) {
            return 1;
        }
        return somatorio(n - 1) + n;
    }
}

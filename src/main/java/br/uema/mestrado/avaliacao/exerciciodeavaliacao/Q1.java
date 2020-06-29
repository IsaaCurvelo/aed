package br.uema.mestrado.avaliacao.exerciciodeavaliacao;

public class Q1 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(String.format("fatorial de %d é %d", n, fatorial(n)));
    }


    private static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return fatorial(n - 1) * n;
    }
}

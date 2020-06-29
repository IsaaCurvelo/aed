package br.uema.mestrado.avaliacao.exerciciodeavaliacao;

public class Q3 {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(String.format("fibbonacci de %d é %d", n, fibbonacci(n)));
    }


    private static int fibbonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
}

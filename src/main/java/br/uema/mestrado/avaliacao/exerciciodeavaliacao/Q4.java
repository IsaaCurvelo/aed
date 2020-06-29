package br.uema.mestrado.avaliacao.exerciciodeavaliacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Q4 {

    private static final Logger log = LoggerFactory.getLogger(Q4.class);

    static final int MAX = 9;
    static final int MIN = -9;

    private static class Soldado {

        private final int chapeu;

        public Soldado(int chapeu) {
            this.chapeu = chapeu;
        }

        public int getChapeu() {
            return chapeu;
        }

        @Override
        public String toString() {
            return "chapeu=" + chapeu;
        }
    }


    public static void main(String[] args) {
        Soldado[] soldados = new Soldado[10];

        for (int i = 0; i < 10; i++) {
            soldados[i] = new Soldado(i);
        }

        int primeiro = ThreadLocalRandom.current().nextInt(0, 10);

        log.info("primeiro soldado aleatório: {}", primeiro);

        Soldado escolhido = josephus(soldados, primeiro);
        log.info("soldado de chapéu {} foi escolhido ao final", escolhido);
    }


    private static Soldado josephus(Soldado[] soldados, int ultimoEscolhido) {
        log.info("iniciando nova rodada...");
        if (soldados.length == 1) {
            return soldados[0];
        }

        int next = 0;

        do {
            next = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        } while (next == 0);

        log.info("número sorteado para contagem: {}", next);

        int escapou = Math.abs((ultimoEscolhido + next) % soldados.length);

        log.info("Soldado de chapéu {} removido do círculo", soldados[escapou].getChapeu());

        soldados = shorten(soldados, escapou);

        return josephus(soldados, escapou);
    }


    private static Soldado[] shorten(Soldado[] curr, int k) {
        int l = curr.length;
        Soldado[] newArr = new Soldado[l - 1];
        System.arraycopy(curr, 0, newArr, 0, k);
        System.arraycopy(curr, k + 1, newArr, k, l - 1 - k);
        return newArr;
    }


}

package br.uema.mestrado.avaliacao.exerciciodeavaliacao;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    static List<Integer> numeros = new ArrayList<Integer>();

    /* Iniciar Lista */
    public Lista() {
        numeros.add(5);
        numeros.add(10);
        numeros.add(32);
        numeros.add(54);
        numeros.add(44);
    }
    /*
     * d) Descritores são variáveis que facilitam o acesso a registros de um TAD, ou
     * seja, podem conter informações sobre o TAD. No caso de uma fila podemos
     * enumerar alguns exemplos como: primeiro, ultimo, maior, menor, etc. Para o
     * TAD ListaL implemente os descritores maior e menor que devem funcionar
     * utilizando uma estratégia EAGER;
     */

    /*
     * 2. Implemente uma função que busque ao mesmo tempo o Maior e o Menor elemento
     * de uma ListaRA. Observar as implementações da seção Medida de tempo de
     * execução de um programa do livro Projeto de algoritmos com implementação em
     * Pascal e C do professor Nivio Ziviane. Procure utilizar uma implementação
     * mais eficiente.
     */

    public static void ListaRA(List<Integer> numeros) {
        int maior = 0;
        int menor = 999999999;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
            }
        }
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }

    /*
     * 4. Escreva um programa que remova todos os elementos com chaves pares de uma
     * lista encadeada.
     */

    public List<Integer> removerChavesPares(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                numeros.remove(numeros.get(i));
            }
        }
        return numeros;
    }

    /*
     * 3. Considere uma coleção de nomes de sites da web e seus respectivos links na
     * Internet armazenados através de uma lista simplesmente encadeada. Escreva a
     * respectiva estrutura e um método que, dado o nome de um site, busque o seu
     * link correspondente na lista e ao mesmo tempo mova o não que contém o nome
     * buscado para o início da lista, de forma que ele possa ser encontrado mais
     * rapidamente na próxima vez que for buscado.
     */

    public List<String> buscarLink(String link) {
        String linkSelecionado = "";
        List<String> links = new ArrayList<String>();
        links.add("google.com");
        links.add("uol.com");
        links.add("facebook.com");
        links.add("globo.com");

        for (int i = 0; i < links.size(); i++) {
            if (links.get(i) == link) {
                linkSelecionado = links.get(i);

                String aux = links.get(i);

                links.set(i, links.get(0));
                links.set(0, aux);
            }
        }

        return links;

    }

    /*
     * 5. Escreva um programa que imprima todos os n�meros primos de uma lista
     * encadeada.
     */

    public void numerosPrimos() {
        int contador;
        int numero = 0;
        for (Integer i : numeros) {
            contador = 0;

            for (int u = 1; u <= i; u++) {
                if (i % u == 0) {
                    contador++;
                    numero = u;
                }
            }

            if (contador == 2) {
                System.out.println("O Número: " + numero + " é primo e seus primos são: 1 e " + numero);
            }
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.numerosPrimos();
    }

}

package br.uema.mestrado.avaliacao.exerciciodeavaliacao;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	private static int[] valores;
	private int primeiro;
	private int ultimo;
	private int total;

	List<Integer> myList = new ArrayList<Integer>();

	public Fila() {
		valores = new int[10];
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}

	public void inserir(int elemento) {
		valores[ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}

	public int retirar() {
		int elemento = valores[primeiro];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return elemento;
	}

	public boolean isEmpty() {
		return total == 0;
	}

	public boolean isFull() {
		return total == valores.length;
	}

	/*
	 * a)Faça a implementação de um método que sempre insira os elementos de maneira
	 * ordenada: sortedEnqueue();
	 */
	public void sortedEnqueue(int valores[]) {
		for (int i = 0; i < valores.length; i++)
			for (int j = i + 1; j < valores.length; j++)
				if (valores[i] < valores[j]) {
					int temp = valores[i];
					valores[i] = valores[j];
					valores[j] = temp;
				}
	}

	/*
	 * b)Implemente um cliente de teste da função sortedEnqueue que copie uma fila
	 * de valores aleatórios A para uma fila ordenada B e em seguida imprima o
	 * resultado;
	 */
	public void ordenandoValores(int valores[]) {
		sortedEnqueue(valores);
	}

	/*
	 * c) Faça uma pesquisa sobre algoritmos de ordenação e identifique qual dos
	 * algoritmos a sua implementação se assemelha? Justifique.
	 * 
	 * Resposta: Selection Sort A ordenação por seleção ou selection sort consiste
	 * em selecionar o menor item e colocar na primeira posição, selecionar o
	 * segundo menor item e colocar na segunda posição, segue estes passos até que
	 * reste um único elemento. Para todos os casos (melhor, médio e pior caso)
	 * possui complexidade C(n) = O(n) e no  um algoritmo est�vel.
	 */

	public static void main(String[] args) {
	}

}
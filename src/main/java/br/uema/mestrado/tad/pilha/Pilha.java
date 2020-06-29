package br.uema.mestrado.tad.pilha;

public class Pilha<T> {
    /*
     *1. Implemente o método size().
     * R: Implementado
     *2. Prove que o vetor a[] está sempre 25% cheio. (Antes, é preciso formular essa afirmação de maneira mais precisa.)
     * R: O vetor a[] dobra de tamanho sempre que é inserido um elemento e seu tamanho é igual a N. Ao remover,
     * quando o tamanho de a[] chega a 1/4 de N (vulgo 25%), é feito o redimensionamento de a pra 1/2 de N. Então há um
     * cenário no qual a[] está 25% cheio.
     *3. Redimensionamento.
     * Antes de cada inserir e cada remover, é verdade que a.length é potência de 2?
     * R: Sim, isso ocorre porque o vetor a[] ja é iniciado com tamanho igual a 2
     * É verdade que a.length ≥ 2?
     * R: Sim. É verdade que a.length é sempre maior que 2? também, se tentar remover algum elemento quando a.length = 2
     * acontece um erro.
     * É verdade que a.length/4 ≤ N ≤ a.length?
     * R: Sim, são os dois casos extremos que desencadeiam o redimensionamento de a[], de modo que após o redimensionamento
     * a.length = 2 * N
     * Pode acontecer a.length/4 == N?
     * R: Sim e quando isso acontece, redimensiona-se a[] para que a.length = 2 * N
     * Que acontece se N == 0 no começo de um remover?
     * R: out of bounds
     * */
    private T[] a;
    private int N;

    public Pilha() {
        a = (T[]) new Object[2];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(T item) {
        if (N == a.length)
            resize(2 * a.length);
        a[N++] = item;
    }

    public T pop() {
        T item = a[--N];
        if (N > 0 && N == a.length / 4)
            resize(a.length / 2);
        return item;
    }

    private void resize(int max) {
        T[] temp;
        temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    public int size() {
        return N;
    }

}

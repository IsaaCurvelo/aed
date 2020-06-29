package br.uema.mestrado.tad.fila;

public class Fila<T> {

    private T[] a;
    private int N;
    private int beg;
    private int end;


    public Fila() {
        a = (T[]) new Object[2];
        beg = end = N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void enqueue(T item) {
        if (N == a.length)
            resize(2 * a.length);

        a[end++] = item;

        if (end == a.length)
            end = 0;
    }

    public T dequeue() {
        T item = a[beg];

        N--;
        beg++;

        if (beg == a.length)
            beg = 0;

        if (N > 0 && N == a.length / 4)
            resize(a.length / 2);

        return item;
    }

    private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = a[(beg + i) % a.length];
        }
        a = copy;
        beg = 0;
        end = N;
    }

    public int size() {
        return N;
    }

}
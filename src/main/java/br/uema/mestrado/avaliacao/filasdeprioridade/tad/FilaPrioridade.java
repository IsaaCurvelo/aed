package br.uema.mestrado.avaliacao.filasdeprioridade.tad;

public class FilaPrioridade<T extends Comparable<T>> {

    private static class Node<T> {
        T content;
        Node<T> next = null;

        @Override
        public String toString() {
            return "" + content;
        }
    }

    private Node<T> head;
    private Integer size;


    public FilaPrioridade() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> n = new Node<>();
        n.content = element;

        if (isEmpty()) {
            this.head = n;
        } else {
            Node<T> nav = head;
            Node<T> prev = null;
            while (nav != null && nav.content.compareTo(element) <= 0) {
                prev = nav;
                nav = nav.next;
            }
            if (prev == null) {
                // n should be the new head
                n.next = head;
                head = n;
            } else {
                prev.next = n;
                n.next = nav;
            }
        }
        size++;
    }

    public T next() {
        if (head == null) {
            throw new IllegalStateException("Fila de prioridades vazia, impossivel retirar elemento");
        }
        T next = head.content;
        head = head.next;
        this.size--;

        return next;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void printList() {
        Node<T> n = head;
        while (n != null) {
            System.out.print(n.content + ", ");
            n = n.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        FilaPrioridade<Integer> fila = new FilaPrioridade<>();

        fila.add(3);
        fila.add(1);
        fila.add(7);
        fila.add(2);
        fila.add(2);
        fila.add(4);
        fila.add(4);
        fila.add(8);

        System.out.print("fila: ");
        fila.printList();

        System.out.println("removido: " + fila.next());
        System.out.println("removido: " + fila.next());
        System.out.println("removido: " + fila.next());

        System.out.print("fila: ");
        fila.printList();
    }
}

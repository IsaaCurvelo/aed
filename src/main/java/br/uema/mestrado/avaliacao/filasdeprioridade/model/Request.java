package br.uema.mestrado.avaliacao.filasdeprioridade.model;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Objects;

public class Request implements Comparable<Request> {

    /*
     * quanto maior o valor da prioridade, maior a prioridade
     * */
    private final Integer prioridade;

    private final Socket socket;

    private final DataInputStream dataInputStream;

    private final DataOutputStream dataOutputStream;


    public Request(Integer prioridade, Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {

        if (prioridade <= 0 || prioridade == null) {
            throw new IllegalArgumentException("a prioridade precisa ser um número " +
                    "inteiro positivo não nulo");
        }
        this.prioridade = prioridade;
        this.socket = socket;
        this.dataInputStream = dataInputStream;
        this.dataOutputStream = dataOutputStream;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return prioridade.equals(request.prioridade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prioridade);
    }

    @Override
    public int compareTo(Request o) {
        return o.prioridade - this.prioridade;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }

    public DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }

    public Socket getSocket() {
        return socket;
    }
}

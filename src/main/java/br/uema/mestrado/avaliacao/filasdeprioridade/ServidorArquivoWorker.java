package br.uema.mestrado.avaliacao.filasdeprioridade;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServidorArquivoWorker implements Runnable {

    private final Socket socket;

    public ServidorArquivoWorker(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try (InputStream inputStream = this.socket.getInputStream()) {
            while()

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

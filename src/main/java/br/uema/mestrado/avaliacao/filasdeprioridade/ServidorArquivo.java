package br.uema.mestrado.avaliacao.filasdeprioridade;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorArquivo implements Servidor {

    private final Integer porta;

    public ServidorArquivo(Integer porta) {
        this.porta = porta;
    }


    @Override
    public void runService() {
        try (ServerSocket serverSocket = new ServerSocket(porta)) {

            while (true) {

                Socket socket = serverSocket.accept();

                socket.close();

            }

        } catch (IOException e) {

        }
    }
}

package br.uema.mestrado.avaliacao.filasdeprioridade.servers;

import br.uema.mestrado.avaliacao.filasdeprioridade.model.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.PriorityBlockingQueue;

public class Servidor {

    private static final Logger log = LoggerFactory.getLogger(Servidor.class);

    // Usaríamos a nossa propria implementação, mas ela não é thread safe,
    // já que os clientes são adicionados e removidos em diferentes threads.
    // Acreditamos que fugiria do escopo da disciplina ter que implementar
    // algo nesse contexto. Nesse sentido, nós entendemos que fornecer uma
    // implementação própria de fila de prioridades e também uma aplicação que
    // utilize uma fila supre as duas facetas de uma estrutura de dados, sua
    // implementação e sua utilização.
    private final PriorityBlockingQueue<Request> requests;


    public Servidor(Integer porta) throws InterruptedException {
        this.requests = new PriorityBlockingQueue<>();
        log.info("servidor subindo...");

        // thread for accepting new clients
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(porta)) {
                while (true) {
                    Socket accepted = serverSocket.accept();

                    DataInputStream dis = new DataInputStream(accepted.getInputStream());
                    DataOutputStream dos = new DataOutputStream(accepted.getOutputStream());
                    Integer prioridade = dis.readInt();

                    Request request = new Request(prioridade, accepted, dis, dos);

                    log.info("novo cliente com prioridade {} conectado", prioridade);
                    requests.add(request);
                }
            } catch (IOException e) {
                log.error("erro!", e);
            }
        }).start();

        log.info("servidor aceitando requisicões. 60s para começar a atender");
        Thread.sleep(60000);

        // thread for handling waiting clients
        new Thread(() -> {
            while (true) {
                if (!requests.isEmpty()) {
                    Request request = requests.poll();
                    log.info("atendendo agora cliente de prioridade {}", request.getPrioridade());
                    new ServidorWorker(request).start();
                }
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        new Servidor(1313);
    }
}

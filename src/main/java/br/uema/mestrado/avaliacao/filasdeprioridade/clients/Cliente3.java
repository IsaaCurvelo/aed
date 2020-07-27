package br.uema.mestrado.avaliacao.filasdeprioridade.clients;

import br.uema.mestrado.avaliacao.filasdeprioridade.servers.Servidor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Cliente3 {
    private static final Logger log = LoggerFactory.getLogger(Servidor.class);

    private static final Integer PORTA = 1313;

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        try {
            Scanner scn = new Scanner(System.in);

            // getting localhost ip
            InetAddress ip = InetAddress.getByName("localhost");

            // establish the connection with server port 1313
            Socket s = new Socket(ip, PORTA);

            // obtaining input and out streams
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            Integer prioridade = random.nextInt((10 - 1) + 1) + 1;
            log.info("novo cliente com prioridade = {}", prioridade);

            dos.writeInt(prioridade);

            // the following loop performs the exchange of
            // information between client and client handler
            while (true) {
                System.out.println(dis.readUTF());
                String tosend = scn.nextLine();
                dos.writeUTF(tosend);

                // If client sends exit,close this connection
                // and then break from the while loop
                if (tosend.equals("Exit")) {
                    System.out.println("Closing this connection : " + s);
                    s.close();
                    System.out.println("Connection closed");
                    break;
                }

                System.out.println("Waiting...");
                // printing date or time as requested by client
                String received = dis.readUTF();
                System.out.println(received);
            }

            // closing resources
            scn.close();
            dis.close();
            dos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

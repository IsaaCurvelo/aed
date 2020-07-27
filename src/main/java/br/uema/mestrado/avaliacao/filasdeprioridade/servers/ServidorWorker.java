package br.uema.mestrado.avaliacao.filasdeprioridade.servers;

import br.uema.mestrado.avaliacao.filasdeprioridade.model.Request;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorWorker extends Thread {

    private final Request request;

    private final DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    private final DateFormat fortime = new SimpleDateFormat("hh:mm:ss");


    public ServidorWorker(Request request) {
        this.request = request;
    }


    @Override
    public void run() {
        String received;
        String toreturn;

        DataOutputStream dos = this.request.getDataOutputStream();
        DataInputStream dis = this.request.getDataInputStream();
        Socket socket = this.request.getSocket();


        while (true) {

            try {
                // Ask user what he wants
                dos.writeUTF("What do you want? [date | time | db | print | file]..\n" +
                        "Type Exit to terminate connection.");

                // receive the answer from client
                received = dis.readUTF();


                if (received.equals("Exit")) {
                    System.out.println("Client " + socket + " sends exit...");
                    System.out.println("Closing this connection.");
                    socket.close();
                    System.out.println("Connection closed");
                    break;
                }

                // creating Date object
                Date date = new Date();

                this.sleep(600);

                // write on output stream based on the
                // answer from the client
                switch (received) {
                    case "date":
                        toreturn = fordate.format(date);
                        dos.writeUTF(toreturn);
                        break;
                    case "time":
                        toreturn = fortime.format(date);
                        dos.writeUTF(toreturn);
                        break;
                    case "db":
                        toreturn = "MySql - Ok!";
                        dos.writeUTF(toreturn);
                        break;
                    case "print":
                        toreturn = "Lexmark - Ok!";
                        dos.writeUTF(toreturn);
                        break;
                    case "file":
                        toreturn = "File Server - Ok!";
                        dos.writeUTF(toreturn);
                        break;
                    default:
                        dos.writeUTF("Invalid input");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException ex) {
                Logger.getLogger(ServidorWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            // closing resources
            dis.close();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

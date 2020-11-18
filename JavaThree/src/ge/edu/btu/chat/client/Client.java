package ge.edu.btu.chat.client;

import ge.edu.btu.chat.server.ServerThread;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket client = new Socket("localhost", 8087);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());

        ServerThread serverThread = new ServerThread();

        Thread thread = new Thread(serverThread);

        thread.start();

        objectOutputStream.close();

        client.close();
    }
}

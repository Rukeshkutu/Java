package TCPSocket;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        serverSocket.setSoTimeout(100000);
        try{
            System.out.println("i am server waiting for client at port " + serverSocket.getLocalPort());
            Socket server = serverSocket.accept();
            System.out.println("i am just connected to client " + server.getRemoteSocketAddress());
            InputStream inputStream = server.getInputStream();
            DataInputStream dataInputStream = (new DataInputStream(inputStream));
            System.out.println("Data received form client::: " + dataInputStream.read());
            System.out.println("Radius value received form client ::: " + dataInputStream.readDouble());

            OutputStream outputStream = server.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello" + " Client I received all data. ");
        }
        catch (SocketTimeoutException e){
            e.printStackTrace();
        }

    }
}

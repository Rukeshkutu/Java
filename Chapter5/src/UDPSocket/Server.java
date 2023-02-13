package UDPSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8000);
        byte[] reveive = new byte[65507];
        DatagramPacket datagramPacket = new DatagramPacket(reveive, reveive.length);
        datagramSocket.receive(datagramPacket);

        String message = " ";
        int i = 0 ;

        while (reveive[i] != 0 ){
            message += (char)reveive[i];
            i++;
        }
        System.out.println(message);

    }
}

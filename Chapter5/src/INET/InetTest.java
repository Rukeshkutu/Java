package INET;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("ip => "+ local);
        System.out.println("Host Name => " + local.getHostName());
        System.out.println("Host Address => " + local.getHostAddress());

        System.out.println("--------------------------");

        InetAddress ipFacebook = InetAddress.getByName("www.facebook.com");
        System.out.println("ip => " + ipFacebook);
        System.out.println("Host Name : " + ipFacebook.getHostName());
        System.out.println("IP Address :" + ipFacebook.getHostAddress());

        System.out.println("Is Both ip equal? => " + ipFacebook.equals(local));
    }
}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
public class Client {
    private Socket socket=null;
    private DataInputStream input=null;
    private DataOutputStream out=null;
    public Client(String address,int port) throws IOException {
        try{
            socket=new Socket(address,port);
            System.out.println("Connected");
            input =new DataInputStream(System.in);
            out=new DataOutputStream(socket.getOutputStream());


        }
        catch (UnknownHostException u){
            System.out.println(u);

        }
        catch(IOException i){
            System.out.println(i);
        }
        //string  to read message from input
        String line="";
        //Keep reading until "Over is input"
        while (!line.equals("over")){
            try{
                line=input.readLine();
                out.writeUTF(line);
            }
            catch (IOException i){
                System.out.println(i);
            }

        }
//close the connection
        try{
            input.close();
            out.close();
            socket.close();

        }
        catch (IOException i){
            System.out.println(i);
        }

    }
    public static void main(String args[]) throws IOException {
        Client client=new Client("\""+InetAddress.getLocalHost().getHostAddress()+"\"",5000);
    }

}

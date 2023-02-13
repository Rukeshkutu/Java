package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AdderSerever {
    public static void main(String[] args) {
        try{
            AdderInterface adderInterface = new AdderRemote();
            //start the register service giving the port number.
            LocateRegistry.createRegistry(8000);
            //binds the remote object with the given name.
            Naming.bind("rmi://localhost:8000/add", adderInterface);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

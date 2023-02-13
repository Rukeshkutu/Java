package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements AdderInterface{
    AdderRemote() throws RemoteException
    {

    }
    public int add(int a, int b){
        return a+b;
    }
}

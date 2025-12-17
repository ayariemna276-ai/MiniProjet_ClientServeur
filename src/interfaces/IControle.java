package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IControle extends Remote {
    void reparerPanne(String idMachine) throws RemoteException;
    void superviserChaine(String idAssemblage) throws RemoteException;
}

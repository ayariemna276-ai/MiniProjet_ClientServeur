package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAssemblage extends Remote {
    void emmagasiner(String partie) throws RemoteException;
}

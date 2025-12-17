package assemblage;
import interfaces.IAssemblage;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class StationAssemblage extends UnicastRemoteObject implements IAssemblage {

    private String idAssemblage;

    public StationAssemblage(String id) throws RemoteException {
        this.idAssemblage = id;
    }

    @Override
    public void emmagasiner(String partie) throws RemoteException {
        System.out.println("Partie " + partie + " stockée dans " + idAssemblage);
    }
}

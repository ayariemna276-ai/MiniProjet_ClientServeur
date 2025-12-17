package controle;

import interfaces.IControle;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class StationControle extends UnicastRemoteObject implements IControle {

    private String idControle;

    public StationControle(String id) throws RemoteException {
        this.idControle = id;
    }

    @Override
    public void reparerPanne(String idMachine) throws RemoteException {
        System.out.println("Réparation de la machine " + idMachine);
    }

    @Override
    public void superviserChaine(String idAssemblage) throws RemoteException {
        System.out.println("Supervision de la station " + idAssemblage);
    }
}

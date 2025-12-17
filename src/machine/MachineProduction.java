package machine;
import interfaces.IControle;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MachineProduction extends UnicastRemoteObject {

    private String idMachine;
    private String etat;

    public MachineProduction(String id) throws RemoteException {
        this.idMachine = id;
        this.etat = "EN_MARCHE";
    }

    public void reglerStatut() {
        System.out.println("Machine " + idMachine + " état : " + etat);
    }

    public void detecterPanne(IControle controle) throws RemoteException {
        etat = "EN_PANNE";
        System.out.println("Panne détectée sur " + idMachine);
        controle.reparerPanne(idMachine);
    }
}

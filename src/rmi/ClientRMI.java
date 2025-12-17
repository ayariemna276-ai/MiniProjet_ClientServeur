package rmi;
import interfaces.IControle;
import machine.MachineProduction;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    public static void main(String[] args) throws Exception {
        // Scénario 1 : Panne d’une machine (RMI)

        Registry registry = LocateRegistry.getRegistry("localhost");

        IControle controle = (IControle) registry.lookup("Controle");

        MachineProduction m1 = new MachineProduction("M1");
        m1.detecterPanne(controle);
    }
}

package rmi;
import assemblage.StationAssemblage;
import controle.StationControle;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);

        StationControle controle = new StationControle("CTRL1");
        StationAssemblage assemblage = new StationAssemblage("SA1");

        registry.rebind("Controle", controle);
        registry.rebind("Assemblage", assemblage);

        System.out.println("Serveur RMI prêt");
    }
}

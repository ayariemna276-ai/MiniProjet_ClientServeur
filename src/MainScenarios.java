

import machine.MachineProduction;
import assemblage.StationAssemblage;
import controle.StationControle;
import interfaces.IControle;

public class MainScenarios {
    public static void main(String[] args) throws Exception {


        StationControle controle = new StationControle("CTRL1");
        StationAssemblage assemblage = new StationAssemblage("SA1");

        // Scénario 3 : Saturation du stock
        System.out.println("=== Scénario 3 : Saturation du stock ===");
        assemblage.emmagasiner("Piece1");
        assemblage.emmagasiner("Piece2");
        assemblage.emmagasiner("Piece3");
        System.out.println("Stock saturé – arrêt temporaire de la production\n");

        //  Scénario 4 : Production normale
        System.out.println("=== Scénario 4 : Production normale ===");
        MachineProduction m1 = new MachineProduction("M1");
        MachineProduction m2 = new MachineProduction("M2");
        System.out.println("Production normale en cours...");
        m1.reglerStatut();
        m2.reglerStatut();
        System.out.println("\nTous les scénarios sont testés.");
    }
}

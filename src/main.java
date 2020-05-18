import fr.emse.simulator.world.Cell;
import fr.emse.simulator.Simulator;
import projet.ConfigLoader;

import java.io.File;

public class main {
    public static void main(String[] args){

        ConfigLoader config = new ConfigLoader();

        config.load(new File("letexto.txt"));
        System.out.println("ok");
    }
}

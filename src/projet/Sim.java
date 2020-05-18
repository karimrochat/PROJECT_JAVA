package projet;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fr.emse.simulator.Simulator;
import fr.emse.simulator.world.*;


public class Sim extends Simulator {

    private static final int sleep = 500;
    private int step;
    private Worldmap world;

    public Sim(File file){
        super(file);
    }

    public boolean isOver(){ // va juste dire est-ce que la simulation est terminée
        return true;
    }

    public void loadMap(Worldmap world, File file){ // pour pouvoir charger le fichier(la carte)
        //world = new Worldmap(ConfigLoader.load(file));

    }


    public void run(){ // lance la simulation

    }

    @Override
    public void loadMap(File file) {

    }


    public void runOneStep(){ // lance une étape de la simulation

    }
}

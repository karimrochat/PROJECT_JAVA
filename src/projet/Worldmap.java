package projet;
import fr.emse.simulator.world.SimulationMap;
import fr.emse.simulator.world.Cell;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import fr.emse.simulator.world.*;


public class Worldmap implements SimulationMap {
    private int nbRows;
    private int nbCols;
    private ArrayList<ArrayList<Cellule>> cellule;

    // constructeur:
    public Worldmap (int nbRows, int nbCols, ArrayList < ArrayList<Cellule>> cellule){ // un worldmap c'est une cellule
        this.nbRows = nbRows;
        this.nbCols = nbCols;
        this.cellule = cellule;
    }

    public int getNbRows(){
        return nbRows;
    }

    public int getNbCols(){
        return nbCols;
    }

    public Cell get(int row, int col){
        return null;
    }

    public String toString(){
        return nbRows + " " + nbCols + " " + cellule;
    }
}

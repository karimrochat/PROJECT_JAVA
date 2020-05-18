package projet;
import fr.emse.simulator.world.Cell;
import fr.emse.simulator.world.Occupant;

public class Cellule implements Cell {
    private int row;
    private int col;
    private Occupant occupant;

    //constructeur:
    public Cellule(Occupant occupe, int row, int col){
        this.row = row;
        this.col = col;
        this.occupant = occupe;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public Occupant getOccupant(){
        return occupant;
    }

    public boolean isEmpty(){
        return false;
    }

    public String toString(){
        return occupant + " " + " pos ligne: " + row + " pos col: " + col;
    }
}

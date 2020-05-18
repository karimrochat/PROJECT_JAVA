package projet;
import fr.emse.simulator.world.Occupant;


public class Occ implements Occupant{

    private String ocuupe;
    public Occ(String ocuupe){
        this.ocuupe = ocuupe;
    }

    public String toString(){
        return ocuupe;
    }

}

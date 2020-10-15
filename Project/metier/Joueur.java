//package sokaban.metier;
import java.util.ArrayList;

public class Joueur extends Mobile{
	public ArrayList<Direction> histo;
	//Justifier par l'appel au getter de cet attribut au niveau de l'IHM fournie
	public int nbCoups;
    public Joueur(Configuration config, Position pos){
        super(Type.JOUEUR, config, pos);
        histo = new ArrayList<Direction>();
    }

    public Joueur(Configuration config, Joueur j){ //a verifier
        super(Type.JOUEUR, config, j.getPosition() );
        histo = new ArrayList<Direction>(); 

    }
    public ArrayList<Direction> getHisto(){
        return histo;
    }
    public int getNbCoups() {
    	return this.nbCoups;
    }
}

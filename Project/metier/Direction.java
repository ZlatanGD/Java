//package sokaban.metier;
import java.util.ArrayList;

public enum Direction {
    HAUT(new Position(0, -1)),
    BAS(new Position(0, 1)),
	GAUCHE(new Position(-1, 0)),
	DROITE(new Position(1, 0));
	public ArrayList<Direction> DIRECTIONS;

    public final Position label;
 
    private Direction(Position label) {
        this.label = label;
    }	public ArrayList<Direction> getDirection(){
		return DIRECTIONS;
	}
}/*
public enum Direction {
	GAUCHE,
	DROITE,
	HAUT,
	BAS;	
	public ArrayList<Direction> DIRECTIONS;
	public int dx;
	public int dy;
	
	private Direction() {
		//Je sais pas quoi mettre
		//c'est là qu'on doit definir les directions droite, gauche...
		//Ca doit donner quelque chose comme ca je pense
		
		/*switch(//quelque chose//) {
		 * 	case HAUT:
		 * 		dx=0;dy=-1;
		 * 		break;
		 * 	case BAS : 
		 * 		dx=0;dy=1;
		 * 		break;
		 * case GAUCHE:
		 * 		dx=-1;dy=0;
		 * 		break;
		 * 	case DROITE : 
		 * 		dx=1;dy=0;
		 * 		break;
		 * }
		}
	}
	private Direction(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;

		//DIRECTIONS.add(this);//Pas sure. Normalement il n'y a que quatre directions.
	}
	
	public ArrayList<Direction> getDirection(){
		return DIRECTIONS;
	}
}
*/
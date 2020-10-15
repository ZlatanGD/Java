//package sokaban.metier;
import java.util.ArrayList;
public class Niveau {

	protected Immobile[][] grille;
	protected ArrayList<Position> cibles;
	
	public Niveau(int x, int y) {
		grille = new Immobile[x][y];
		cibles = new ArrayList<Position>();
	}
	public int getX() {
		return grille.length;
	}
	public int getY() {
		return grille[0].length;
	}
	public boolean addMur(Position p) {
		if (grille[p.x][p.y] instanceof Mur) {
			return false;
		}
		grille[p.x][p.y] = new Mur();
		return true;
	}
	public boolean addCible(Position p) {
		if(grille[p.x][p.y] instanceof Mur) {
			System.out.println("POSITION MUR");
			return false;
			
		}
//		if (cibles.contains(p)){
//			System.out.println("POSITION CONTAINE");
//			return false;
//		}
		cibles.add(p);
		return true;
	}
	public boolean estCible(Position p) {
		for(Position c : cibles) {
			if(c.x == p.x && c.y == p.y) {
				return true;
			}
		}
		return false;

	}
	public boolean estVide(Position p) {
		if (grille[p.x][p.y] instanceof Mur) {
			return false;
		}
		/*if  (grille[p.x][p.y] instanceof Case){
			return false; //a finir 
		}*/
		return true;
	}
	public Immobile get(Position p) {
		return grille[p.x][p.y];
	}
} 





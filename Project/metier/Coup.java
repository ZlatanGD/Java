import java.util.LinkedList;
public class Coup{
	private Position p;
	private Direction d;

	public Coup(Position p, Direction d){
		this.p = p;
		this.d = d;
	}
	public Coup(Coup c){
		this(c.p, c.d);
	}

	public LinkedList<Coup> getTrajet(ListeCoup lc){
		LinkedList<Coup> trajet = [];
		trajet.add(this);
		Coup coupCur = this;
		while(lc.grille[coupCur.p.x][coupCur.p.y] != 1){//Posibilité boucle infinie //Il faut une exeption
			for(Direction dir : Direction.DIRECTIONS){
				if((lc.grille[coupCur.p.x][coupCur.p.y] = lc.grille[coupCur.add(dir).p.x][coupCur.add(dir).p.y] + 1) && !(lc.config.caisse.contains(coupCur.add(dir))){
					for(Direction direct : Direction.DIRECTIONS){
						if(p.add(dir).equals(p.sub(direct){
							Coup c = new Coup(coupCur.p.add(dir), direct);
							trajet.add(0, c);
							coupCur = c;
						}
					}
				}
			}
		}
		return trajet;
	}

}

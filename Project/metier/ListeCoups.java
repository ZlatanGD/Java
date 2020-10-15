import java.util.LinkedList;
public class ListeCoups{
	private Configuration config;
	private int [][] grille;
	private LinkedList<Position> enCours;
	private LinkedList<Position> coupsPos;
	//private LinkedList<LinkedList<Direction>> trajet;

	public ListeCoups(Configuration config){
		this.config = config;
		int large, longueur;
		config.niveau.grille.length = large;
		config.niveau.grille[0].length = longueur;
		grille = new int [large][longueur];
		for(int i =0; i<large;i++){
			for(int j =0; j<large;j++){
				grille[i][j]=0;
				if(config.niveau.grille[i][j] instanceof Mur){
					grille[i][j] = 100000;
				}
			}
		}//j'avais mis un cpt mais en réalité ça ne marche pas
		grille[config.joueur.position.x][config.joueur.position.y] = 1;
		enCours.add(config.joueur.position);
		while(enCours.isEmpty()){// On a maintenant une grille de dijkstra. //faire inverse de enCours.isEmpty
			Position posCur;
			posCur = enCours.remove();
			for(Direction dir : Direction.DIRECTIONS){// Il faut trouver un moyen de mettre les directions dans DIRECTIONS
				if(grille[posCur.add(dir).x][posCur.add(dir).y]==0){
					grille[posCur.add(dir).x][posCur.add(dir).y = grille[posCur.x][posCur.y]+1;
					enCours.add(posCur.add(dir));
				}
			}
		}
		for(Caisse c : config.caisse){
			Element haut = config.niveau.grille[c.position.add(HAUT).x][c.position.add(HAUT).y];
			Element bas = config.niveau.grille[c.position.add(BAS).x][c.position.add(BAS).y];
			Element droite = config.niveau.grille[c.position.add(DROITE).x][c.position.add(DROITE).y];
			Element gauche = config.niveau.grille[c.position.add(GAUCHE).x][c.position.add(GAUCHE).y];
			if(!(haut instanceof Mur) && !(bas instanceof Mur) && !(config.caisse.contains(haut)) && !(config.caisse.contains(bas)) ){
				coupsPos.add(new Coup(c.position.add(HAUT),BAS));
				coupsPos.add(new Coup(c.position.add(BAS), HAUT));
			}
			if(!(droite instanceof Mur) && !(gauche instanceof Mur) && !(config.caisse.contains(droite)) && !(config.caisse.contains(gauche)) ){
				coupsPos.add(new Coup(c.position.add(DROITE), GAUCHE));
				coupsPos.add(new Coup(c.position.add(GAUCHE), DROITE));
			}
		}
	}
//La methode pour obtenir le trajet pour un coup est dans Coup
	public LinkedList<Direction> getNextCoup(){
		int index = (int)(Math.random()*coupsPos.size());
		Coup c = coupsPos.get(index);
		LinkedList<Coup> trajetCoup = c.getTrajet(this);
		LinkedList<Direction> trajet = [];
		for(int i = 0; i<trajetCoup.size() - 1; i++){
			trajet.add(trajetCoup.get(i).d);
		}
		return trajet;
	}

}

//Est ce qu'il faut cloner la configuration en argument ?
//Si oui es ce qu'il faut une fonction clane() pour configuration ?






//package sokaban.metier;

import java.util.ArrayList;

public class Configuration {
	public ArrayList<Caisse> caisse;
	public Joueur joueur;
	public Niveau niveau;

	public Configuration(Niveau niveau, Position positionJoueur) {
		this.niveau = niveau;
		joueur = new Joueur(this, positionJoueur);
		caisse = new ArrayList<Caisse>();
	}

	public Configuration(Configuration c) {
		niveau = c.niveau;
		joueur = new Joueur(this, c.joueur);
		caisse = c.caisse;
	}

	public int getX() {
		return this.niveau.getX();
	}

	public int getY() {
		return this.niveau.getY();
	}

	public boolean addCaisse(Position p) {
		Caisse c = new Caisse(this, p);

		for(Caisse c1: caisse) {
			if(c1.getPosition().x == p.x && c1.getPosition().y == p.y) {
				return false;
			}
		}
		if (niveau.grille[p.x][p.y] instanceof Mur) {
			return false;
		}
		System.out.println("addCaisse");
	
		caisse.add(c);
		return true;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public boolean estCible(Position p) {
		return niveau.estCible(p);
	}

	public boolean estVide(Position p) {
		return (niveau.grille[p.x][p.y] instanceof Mur);
	}

	public Element get(Position p) {
	
		for(Caisse c : caisse) {
			if(c.getPosition().x == p.x && c.getPosition().y == p.y) {
				return c;
			}
		}


		if (niveau.grille[p.x][p.y] instanceof Mur) {
			return niveau.grille[p.x][p.y];
		}
		if (p.x == joueur.getPosition().x && p.y == joueur.getPosition().y) {
			return joueur;
		}

		return new Case();
	}

	public boolean bougerJoueurVers(Direction dir) {
		System.out.println("DEBUT bougerJoueurVers");
		if (dir == null){return false;}
		Position posCible = joueur.getPosition().add(dir);
		if (this.get(posCible) instanceof Mur) {
			System.out.println("devant un mur");
			return false;
		}
		else if (this.get(posCible) instanceof Caisse) {
			if (this.get(posCible.add(dir)) instanceof Caisse) {
				System.out.println("osbtacle caisse caisse");
				return false;
			}
			else if (this.get(posCible.add(dir)) instanceof Mur) {
				System.out.println("obstacle caisse mur");
				return false;
			}
		
			(get(posCible)).bougerVers(dir);
			System.out.println("bouge caisse");

			
		}
		System.out.println("bouge");

		joueur.histo.add(dir);
		joueur.bougerVers(dir);
		//incrémenter le nombre des coups
		joueur.nbCoups++;
		System.out.println("FIN bougerJoueurVers");
		System.out.println(toString());
		return true;
	}

	public boolean victoire() {
		System.out.println("DEBUT victoire");
		System.out.println("taille de caisse " + caisse.size());
		for(Caisse c:caisse) {
			if(!estCible(c.getPosition())) {
				return false;
			}
		}
		return true;

	}	

	public boolean estCaisse(Position p){
		for (Caisse c : caisse){
			if (c.getPosition().x == p.x && c.getPosition().y == p.y){
				return true;
			}
		}
	return false;
	}


	public String toString() {
		String s = "";
			for (int j = 0; j < niveau.grille[0].length ; j++) {
				for (int i = 0; i <niveau.grille.length; i++) {

				Position p = new Position(i, j);
				if (get(p) instanceof Mur) {
					s = s + "#";
				}
				else if (i == joueur.position.x && j== joueur.position.y && niveau.estCible(p)){
					s = s + "+";
				}
				else if (i == joueur.position.x && j== joueur.position.y) {
					s = s + "@";
				}
				else if (niveau.estCible(p) && estCaisse(p)) {
						s = s + "*";
				}
				else if (estCaisse(p))
				{
					s = s + "$";
				}
				else if (estCible(p)) {
					s = s + ".";
				} else {
					s = s + " ";
				}
			}
			s = s + "\n";
		}
		return s;
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

}

public class Solver implements SolverInterface{
    public Configuration aResoudre;
    public void set(Configuration config){
        aResoudre = config;
    }

    public Configuration getConfiguration(){
        return aResoudre;
    }

    public boolean stop(){//A optimiser
        if (aResoudre.victoire()){return true;}
        else{
		    for(Caisse c : aResoudre.caisse){
                Element haut = aResoudre.niveau.grille[c.position.x][c.position.add(Direction.HAUT).y];
                Element bas = aResoudre.niveau.grille[c.position.x][c.position.add(Direction.BAS).y];
                Element droite = aResoudre.niveau.grille[c.position.add(Direction.DROITE).x][c.position.y];
                Element gauche = aResoudre.niveau.grille[c.position.add(Direction.GAUCHE).x][c.position.y];
                
                if((haut instanceof Mur) || (haut instanceof Caisse) || (bas instanceof Mur) || (bas instanceof Caisse)){
                    if((droite instanceof Mur) || (droite instanceof Caisse) || (gauche instanceof Mur) || (gauche instanceof Caisse)){
                        return true;
                    }
                }
		}
		}
		return false;
    }

    public int getTotalSteps(){
        return getConfiguration().getJoueur().getNbCoups();

    }

    public void step(){
        Direction dir = null;
        //while(aResoudre.bougerJoueurVers(dir)==false){
        int rand = (int)(Math.random() * ((4 - 1) + 1)) + 1;
        System.out.println(rand);
        if(rand == 1){ dir = Direction.HAUT;}
        if(rand == 2){ dir = Direction.GAUCHE;}
        if(rand == 3){ dir = Direction.BAS;}
        if(rand == 4){ dir = Direction.DROITE;}
        aResoudre.bougerJoueurVers(dir);
        //}
    }

}
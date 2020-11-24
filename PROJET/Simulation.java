/** Classe de la Simulation.
 */
public class Simulation
{
    private Terrain terrain;
    private Agents a;
    private Stockage r;
    private final int goal=150;

    public Simulation(Terrain terrain, Agents a, Stockage r)
    {
        this.terrain = terrain;
        this.a = a;
        this.r = r;
    }
    /** Methode qui initialise le terrain avec les ressources, ici avec des grains de blé.
     * @return void
     */
    public void initialiser()
    {
        for(int i=0; i<terrain.nbLignes; i++)
        {
            for(int j=0; j<terrain.nbColonnes; j++)
            {
                a.getFarmier().seDeplacer(i, j);
                a.getFarmier().planter(terrain, r);
            }
        }
    }
    /** Methode qui effectue la recolte du blé, ainsi que la replantation des grains lorsqu'on recupere du blé, ou des mésanges l'ont mangé.
     * @return void
     */
    public void recolte()
    {
        int rand4;
        int jour=0;
        int randm;
        int tempBle=0;
        int cpt=0;
        double tempC = goal;

        while(r.getBle().getQuantite()<goal)
        {
            rand4 = (int)(Math.random()*((6 - 1) + 1)) + 1;
            randm = (int)(Math.random()*(terrain.nbColonnes - 1));

            jour++;
            System.out.println("Jour: "+jour);
            System.out.println("Quantité de blé: "+r.getBle().getQuantite()+"/"+goal+" +("+tempBle+")");
            System.out.println("Quantité de grain: "+r.getGrain().getQuantite());
            
            double tempA = r.getBle().getQuantite();
            double tempB = tempBle;

            Loading((int)(((tempA+tempB)/tempC)*10));
            System.out.println("");

            terrain.affiche();
            int rand2 = (int)(Math.random() * ((terrain.nbLignes)));
            int rand3 = (int)(Math.random() * ((terrain.nbColonnes)));
            
            for(int t = 0;t<rand4; t++)
            {
                rand2 = (int)(Math.random() * ((terrain.nbLignes)));
                rand3 = (int)(Math.random() * ((terrain.nbColonnes)));
                if(!(estBle(terrain.getCase(rand2,rand3))))
                {
                    terrain.setCase(rand2,rand3,r.getBle());
                    tempBle++;
                }
            }

            if((tempBle > 20) || (r.getGrain().getQuantite()<1))
            {
                for(int i=0; i<terrain.nbLignes; i++)
                {
                    for(int j=0; j<terrain.nbColonnes; j++)
                    {
                        if(estBle(terrain.getCase(i,j)))
                        {
                            if(j == randm)
                            {
                                a.getMesange().seDeplacer(i, j);
                                a.getMesange().manger(terrain,r);
                                cpt++;
                            }
                            a.getFarmier().seDeplacer(i, j);
                            a.getFarmier().Frecolte(terrain, r);
                            tempBle=0;
                        }
                    }
                }
            }
            waits();
            clearScreen();

        }
        a.getFarmier().faireFarine(r);
        System.out.println();
        System.out.println("Vous etes près pour l'hivers!");
        System.out.println("Cela a pris "+jour+" jour(s)!");
        System.out.println("Vous avez perdu "+cpt*100+"g de blé a cause des Mésanges! 🐦");
    }

    /** Methode static qui sert à freiner l'affichage du terrain, pour voir l'animation dans le terminal.
     * @return void
    */
    public static void waits()
    {
        try
        {
            Thread.sleep(600);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    } 
    /** Methode qui sert à espacer les affichages, donnant l'aspect qu'il s'agit d'une animation.
     * @return void
     */
    public static void clearScreen()
    {
        System.out.print("\03[H\033[2J");
        System.out.flush();
    }
    /** Methode qui sert a afficher une barre de progression.
     * @param c Un entier qui represent la quantité de blé.
     * @return void
     */
    public void Loading(int c)
    {
        System.out.println("");
        String[] tab = new String[12];
        switch(c)
        {
            case 0:
                System.out.println("[----------]");
                break;
            case 1:
                System.out.println("[#---------]");
                break;
            case 2:
                System.out.println("[##--------]");
                break;
            case 3:
                System.out.println("[###-------]");
                break;
            case 4:
                System.out.println("[####------]");
                break;
            case 5:
                System.out.println("[#####-----]");
                break;
            case 6:
                System.out.println("[######----]");
                break;
            case 7:
                System.out.println("[#######---]");
                break;
            case 8:
                System.out.println("[########--]");
                break;
            case 9:
                System.out.println("[#########-]");
                break;
            case 10:
                System.out.println("[##########]");
                break;
            default:
                System.out.println("[En train de finir]");
                break;
        }
        
    }
    /**Methode qui verifie qu'une ressource est le blé.
     * @return boolean - Renvoie true ou false si la ressource donné en argument est un  blé ou non.
     * @param Ressource Ressource sur une case du terrain.
     */
    public boolean estBle(Ressource c)
    {
        if(c.type == " 🌾")
        {
            return true;
        }return false;
    }
    /**Methode qui verifie qu'une ressource est le grain.
     * @return boolean - Renvoie true ou false si la ressource donné en argument est un grain de blé ou non.
     * @param Ressource Ressource sur une case du terrain.
     */
    public boolean estGrain(Ressource c)
    {
        if(c.type == " 🌱")
        {
            return true;
        }return false;
    }
    /**Une methode qui renvoie le terrain.
     * @return Terrain - Terrain de la simulation.
     */
    public Terrain getTerrain()
    {
        return terrain;
    }

}
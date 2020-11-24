/** Classe TestSimulation
 */
public class TestSimulation 
{
    public static void main(String[] args)
    {
        //Creation d'un terrain 8*8
        Terrain terrain = new Terrain(8,8);
        //Creation d'une liste d'agents.
        Agents a = new Agents();
        //Creation d'une liste de Ressources.
        Stockage r = new Stockage(150);
        r.getGrain().getQuantite();

        Simulation s = new Simulation(terrain, a, r);
        s.initialiser();
        s.recolte();
        //Methodes statiques pour voir les statistiques finales.
        Informations.Display.farineDis(r);
        Informations.Display.bleDis(r);
        Informations.Display.grainDis(r);

    }
}

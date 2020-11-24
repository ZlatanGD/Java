/** Classe Mesange. */
public class Mesange extends Agent
{   
    /** Constructeur mesange.
     * @param int Position x.
     * @param int Position y.
     * @return Mesange.
     */
    public Mesange(int posx, int posy)
    {
        super(posx, posy);
    }
    /** Methode qui sert a deplacer la mésange.
     * @param int Position x d'arrivée.
     * @param int Posotion y d'arrivée.
     * @return void 
     */
    public void seDeplacer(int xnew, int ynew)
    {
        super.seDeplacer(xnew, ynew);
    }

    /** Methode qui renvoie la distance entre la mésange et une position sur le terrain.
     * @param int Position x du terrain.
     * @param int Position y du terrain.
     * @return double - Distance entre la mésange et la case du terrain donné en argument.
     */
    public double distance(int x, int y)
    {
        return super.distance(x, y);
    }

    /** Methode qui efface le contenu du terrain.
     * @param Terrain Terrain de la simulation.
     * @return void
    */
    public void effacer(Terrain t)
    {
        t.videCase(posx, posy);
    }
    /** Methode utilisé par la mésange pour manger le blé.
     * @param Terrain Terrain de la simulation.
     * @param Stockage Le stock utilisé dans la simulation.
     * @return void
    */
    public void manger(Terrain t, Stockage c)
    {
        super.manger(t,c);
    }
}

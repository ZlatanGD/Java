/**Classe Farmier. */
public class Farmier extends Agent
{
    /**Constructeur Farmier. 
     * @param int Position x.
     * @param int Position y.
     * @return Farmier.
    */
    public Farmier(int posx, int posy)
    {
        super(posx,posy);
    }

     /** Methode qui renvoie la distance entre le farmier et une position sur le terrain.
     * @param int  Position x du terrain.
     * @param int  Position y du terrain.
     * @return double
     */
    public double distance(int x, int y)
    {
        return super.distance(x, y);
    }

    /** Methode qui sert a deplacer le farmier.
     * @param int Position x d'arrivée.
     * @param int Posotion y d'arrivée.
     * @return void 
     */
    public void seDeplacer(int xnew, int ynew)
    {
        super.seDeplacer(xnew, ynew);
    }
    /** Methode qui recolte le blé sur cette case, et plante un grain.
     * @param Terrain Terrain de la simulation.
     * @param Stockage Le stock utilisé dans la simulation.
     * @return void
     */
    public void Frecolte(Terrain t,Stockage r)
    {
        super.Frecolte(t, r);
    }
    /** Methode qui sert a planter un grain de blé sur cette case.
     * @param Terrain Terrain de la simulation. 
     * @param Stockage Le stock utilisé dans la simulation.
     */
    public void planter(Terrain t, Stockage r)
    {
        super.planter(t, r);
    }
    /** Methode qui efface le contenu du terrain.
     * @param Terrain Terrain de la simulation. 
     * @return void
    */
    public void effacer(Terrain t)
    {
        super.effacer(t);
    }
    /** Methode qui transfrome le blé en farine (5kg de blé = 1kg de farine)
     * @param Stockage Le stock utilisé dans la simulation.
     * @return void 
    */
    public void faireFarine(Stockage s)
    {
        super.faireFarine(s);
    }


}
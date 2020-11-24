/**Classe Agent. */
public class Agent 
{
    /**Variable d'instance de la postion x d'un Agent. */
    protected int posx;
    /**Variable d'instance de la postion y d'un Agent. */
    protected int posy;

    /** Le contstructeur Agent.
     * @param int Position x de l'agent.
     * @param int Position y de l'agent.
     * @return Agent.
     */
    public Agent(int posx, int posy)
    {
        this.posx = posx;
        this.posy = posy;
    }
    /** Methode qui sert à deplacer l'agent.
     * @param int Position x de la case d'arrivée.
     * @param int Position y de la case d'arrivée.
     * @return void 
     */
    public void seDeplacer(int xnew, int ynew)
    {
        this.posx = xnew;
        this.posy = ynew;
    }
    /** Methode qui renvoie la distance entre l'agent et une position sur le terrain.
     * @param int  Position x du terrain.
     * @param int  Position y du terrain.
     * @return double - Distance entre la position actuelle de l'agent et les coordonées données en argument
     */
    public double distance(int x, int y)
    {
        return Math.sqrt(Math.pow((y - posy),2) + Math.pow((x - posx),2));
    }
    /** Methode qui efface le contenu de la case du terrain.
     * @param Terrain Terrain de la simulation.
     * @return void
    */
    public void effacer(Terrain t)
    {
        t.videCase(posx, posy);
    }
    /** Methode qui recolte le blé sur cette case, et plante un grain.
     * @param Terrain Terrain de la simulation.
     * @param Stockage Le stock utilisé dans la simulation.
     * @return void
     */
    public void Frecolte(Terrain t,Stockage r)
    {
        t.setCase(posx,posy,r.getGrain());
        r.addBle();
        r.addGrain();
    }
    /** Methode qui sert a planter un grain de blé sur cette case.
     * @param Terrain Terrain de la simulation.
     * @param Stockage Le stock utilisé dans la simulation.
     */
    public void planter(Terrain t, Stockage r)
    {
        t.setCase(posx,posy,r.getGrain());
        r.subGrain();
    }
    /** Methode qui transfrome le blé en farine (5kg de blé = 1kg de farine).
     * @param Stockage Le stock utilisé dans la simulation.
     * @return void 
    */
    public void faireFarine(Stockage s)
    {
        int temp = s.getBle().getQuantite();
        temp /= 5;
        s.getFarine().setQuantite(temp);
        s.getBle().setQuantite(s.getBle().getQuantite()-(temp*5));
    }
    /** Methode utilisé par la mésange pour manger le blé.
     * @param Terrain Terrain de la simulation.
     * @param Stockage Le stock utilisé dans la simulation.
     * @return void
    */
    public void manger(Terrain t, Stockage c)
    {
        t.setCase(posx,posy,c.getGrain());
    }
        
}

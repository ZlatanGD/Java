/** Classe Stockage. */
public class Stockage
{
    private Ressource[] tab;
    /** Constructeur Stockage.
     * @param int Quantité de grains.
     * @return Stockage - Stockage utilisable dans une simulation.
     */
    public Stockage(int qtG)
    {
        tab = new Ressource[20];
        tab[0] = new Ressource(" 🌱", qtG);
        tab[1] = new Ressource(" 🌾", 0);
        tab[2] = new Ressource("Farine",0);
    }
    /** Constructeur par copy.
     * @param Stockage - Stockage utilisable dans une simulation.
     * @return Stockage - Stockage utilisable dans une simulation.
     */
    public Stockage(Stockage s)
    {
        this.tab = s.tab;
    }
    /** Methode qui renvoie un grain.
     * @return Ressource - Renvoie un grain.
     */
    public Ressource getGrain()
    {
        return tab[0];
    }
    /** Methode qui renvoie un blé.
     * @return Ressource - Renvoie un blé.
    */
    public Ressource getBle()
    {
        return tab[1];
    }
    /** Methode qui renvoie la farine.
     * @return Ressource - Renvoie un kg de farine.
     */
    public Ressource getFarine()
    {
        return tab[2];
    }
    /** Methode qui rajoute la farine dans le stock.
     * @return void
     */
    public void addFarine()
    {
        tab[2].setQuantite(tab[2].getQuantite()+1);
    }
    /** Methode qui rajoute du grain dans le stock.
     * @return void
     */
    public void addGrain()
    {
        tab[0].setQuantite(tab[0].getQuantite()+1);
    }
    /** Methode qui rajoute du blé dans le stock.
     * @return void
     */
    public void addBle()
    {
        tab[1].setQuantite(tab[1].getQuantite()+1);
    }
    /** Methode qui enlève un grain du stock.
     * @return void
     */
    public void subGrain()
    {
        tab[0].setQuantite(tab[0].getQuantite()-1);
    }
    
}
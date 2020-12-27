public class WMarchandise extends Wagon
{
    protected int poids;
    public WMarchandise(String marque, int nbPortes, int poids)
    {
        super(marque,nbPortes);
        this.poids = poids;
        num = cpt;
    }    
    public int getPoids()
    {
        return poids;
    }
    public String toString()
    {
        return "Wagon Marchandise "+"("+super.marque+") "+super.num+ " - ";
    }

}

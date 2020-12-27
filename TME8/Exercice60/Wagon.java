public abstract class Wagon extends ElemTrain
{
    protected int nbPortes;
    
    public Wagon(String marque, int nbPortes)
    {
        super(marque);
        this.nbPortes = nbPortes;
    }
    public abstract String toString();
}

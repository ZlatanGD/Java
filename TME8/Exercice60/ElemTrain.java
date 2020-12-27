public abstract class ElemTrain
{
    protected int num;
    protected String marque;
    protected static int cpt=1000;

    public ElemTrain(String marque)
    {
        this.marque = marque;
        cpt++;
        num = cpt;
    }
    public abstract String toString();
    
}

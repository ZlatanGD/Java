public class Motrice extends ElemTrain
{
    protected int puissance;
    
    public Motrice(String marque, int puissance)
    {
        super(marque);
        this.puissance = puissance;
    }

    public String toString()
    {
        return "Motrice "+"("+marque+") "+super.num+" - ";
    }
}

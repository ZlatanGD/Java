public class Vehicule
{
    public static int cpt;
    protected int id;
    protected double distance;

    public Vehicule()
    {
        cpt++;
        this.id = cpt;
        this.distance = 0;
    }
    
    public void rouler(double distance)
    {
        this.distance +=distance;
    }
    public String toString()
    {
        return "L'identifiant est "+id+", et sa distance est "+distance+".";
    }
}
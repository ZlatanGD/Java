public class Tracteur
{
    private Roue g1, g2, p1, p2;
    private Cabine c1;

    public Tracteur(Roue g1, Roue g2, Roue p1, Roue p2, Cabine c1)
    {
        this.g1 = g1;
        this.g2 = g2;
        this.p1 = p1;
        this.p2 = p2;
        this.c1 = c1;
    }
    public void peindre(String couleur)
    {
        c1.setCouleur(couleur);
    }
    public String toString()
    {
        return(c1.toString()+" |"+g1.toString()+" |"+g2.toString()+" |"+p1.toString()+" |"+p2.toString());
    }
}
public class Instrument
{
    protected double prix;
    protected double poids;

    public Instrument(double prix, double poids)
    {
        this.prix = prix;
        this.poids = poids;
    }

    public String toString()
    {
        return "Le poids est: "+poids+", et le prix est: "+prix+".";
    }

    public void jouer()
    {
        System.out.println("Un instrument joue");
    }
}
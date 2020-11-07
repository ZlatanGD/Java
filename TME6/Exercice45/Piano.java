public class Piano extends Instrument
{
    public Piano(double prix, double poids)
    {
        super(prix, poids);
    }

    public void jouer()
    {
        System.out.println("Le piano jouer");
    }
}
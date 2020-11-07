public class Guitare extends Instrument
{
    public Guitare(double prix, double poids)
    {
        super(prix, poids);
    }

    public void jouer()
    {
        System.out.println("La guitare jouer");
    }
}
public class Carre extends Rectangle
{
    public Carre(double longueur, double largeur)
    {
        super(longueur, largeur);
        if (longueur != largeur)
        {
            System.out.println("Les deux variables d'oivent etre egale!");
        }
    }

    public double perimetre()
    {
        return longueuer*2 + 2*largeur;
    }
    
    public double surface()
    {
        return longueuer*largeur;
    }

}

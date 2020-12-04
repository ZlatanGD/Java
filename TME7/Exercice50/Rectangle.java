public class Rectangle extends Figure2D
{
    protected double longueuer;
    protected double largeur;

    public Rectangle(double longueuer, double largeur)
    {
        this.longueuer = longueuer;
        this.largeur = largeur;
    }
    
    public double surface()
    {
        return longueuer*largeur;
    }

    public double perimetre()
    {
        return longueuer*2 + largeur*2; 
    }
}

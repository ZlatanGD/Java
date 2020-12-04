public class Cercle extends Ellipse 
{
    public Cercle(double a, double b)
    {
        super(a,b);
    }    

    public double surface()
    {
        return Math.PI*Math.pow(a, 2);
    }

    public double perimetre()
    {
        return 2*Math.PI*a;
    }
}


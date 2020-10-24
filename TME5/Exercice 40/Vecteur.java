public class Vecteur
{
    private double x, y, z;

    public Vecteur(double c1, double c2, double c3)
    {
        x = c1;
        y = c2;
        z = c3;
    }
    public Vecteur()
    {
        this(Math.random()*10, Math.random()*10, Math.random()*10);
    }

    public Vecteur add(Vecteur v)
    {
        return new Vecteur(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public static Vecteur add(Vecteur v, Vecteur c)
    {
        return new Vecteur(c.x + v.x, c.y + v.y, c.z + v.z);
    }

    public String toString()
    {
        return "("+x+", "+y+", "+z+")";
    }
}
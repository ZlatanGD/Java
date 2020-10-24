public class Cone
{
    private double r;
    private double h;
    private final double PI=3.14159;
    private static int nbCones=0;

    public Cone(double r, double h)
    {
        this.r = r;
        this.h = h;
        nbCones++;
    }
    public Cone()
    {
        this(Math.random()*11,Math.random()*11);
    }
    public double getVolume()
    {
        return ((((double)1/3))*h*r*r*PI);
    }
    public String toString()
    {
        return ("Cone r="+r+" h="+h+" V="+getVolume());
    }
    public static int getnbCones()
    {
        return nbCones;
    }
}
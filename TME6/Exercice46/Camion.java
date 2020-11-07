public class Camion extends AMoteur
{
    private double volume;
    
    public Camion(double volume, double capacite)
    {
        super(capacite);
        this.volume = volume;
    }

    public String toString()
    {
        return super.toString()+" Le volume transporté est: "+volume+".";
    }


    public void transporter(int n, int km)
    {
        if(super.essence < km*0.08)
        {
            System.out.println("Plus d'essence!");
        }
        distance += km;
        essence -= km*0.8;
        System.out.println("Le camion n°"+super.id+" a transporté des tuiles sur "+km+" km.");
    }
    
}

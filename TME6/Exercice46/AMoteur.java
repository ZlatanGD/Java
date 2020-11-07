public class AMoteur extends Vehicule
{
    protected double essence;
    protected double capacite;

    public AMoteur(double capacite)
    {
        super();
        this.essence = 0;
        this.capacite = capacite;
    }

    public void approvisionner(double nbLitres)
    {
        if (nbLitres > capacite)
        {
            this.essence = capacite;
        }
        else
        {
            this.essence += nbLitres;
        }
    }

    public boolean enPanne()
    {
        if(this.essence <= 0)
        {
            return true;
        }
        return false;
    }

    public void rouler(double distance)
    {
        super.rouler(distance);
        this.essence -= distance*0.08;
        if(this.essence <= 0)
        {
            System.out.println("Il n'y a plus d'essence!");
            this.essence = 0;
        }
    }


    public String toString()
    {
        return super.toString()+ " La capacité est: "+this.capacite
        +" et il reste "+this.essence+" litres d'essence. ";
    }
}

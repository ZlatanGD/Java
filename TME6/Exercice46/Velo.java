public class Velo extends SansMoteur
{
    private int vitesse;

    public Velo(int vitesse)
    {
        super();
        this.vitesse = vitesse;
    }

    public String toString()
    {
        return "L'identifiant est n°"+super.id+". Le nombre de vitesse est: "+this.vitesse+".";
    }

    public void transporter(String depart, String arrivee)
    {
        System.out.println("Le vélo n°"+super.id+" a roulé de "+depart+" à "+arrivee+".");
    }
}

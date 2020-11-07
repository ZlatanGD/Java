public class Voiture extends AMoteur
{
    private int nbPlaces;

    public Voiture(int nbPlaces, double capacite)
    {
        super(capacite);
        this.nbPlaces = nbPlaces;
    }

    public String toString()
    {
        return super.toString()+" Il y a "+this.nbPlaces+" places dans la voiture.";
    }

    public void transporter(int n, int km)
    {
        distance += km;
        essence -= km*0.08;
        System.out.println("La voiture n°"+super.id+" a transporté "+n+" personne(s) sur "+km+" km");
        
    }

}
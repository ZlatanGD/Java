public class Machin
{
    private String nom;
    private int valeur;

    public Machin(String nom, int valeur)
    {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String toString()
    {
        return this.nom + " " + this.valeur; 
    }
}
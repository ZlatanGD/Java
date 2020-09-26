public class Villageois
{
    private String nom;
    private double poids;
    private boolean malade;
    public Villageois(String Villageois)
    {
        nom = Villageois;
        int min = 50;
        int max = 150;
        double random_double = Math.random() * (max - min + 1) + min;
        poids = random_double;
        int random_int = (int)(Math.random() * (5 - 1 + 1) + 1);
        if(random_int == 1)
        {
            malade = true;
        }
        else
        {
            malade = false;
        }
    }
    public String toString()
    {
        System.out.println("Je pese: "+this.poids+"kg");
        System.out.println("Et je suis malade: "+this.malade);
        System.out.println("Je peux soulver: "+this.poidsSoulever()+"kg");
        return("Mon nom est: "+this.nom);
    }

    public double poidsSoulever()
    {
        return(this.poids/3);
    }

}
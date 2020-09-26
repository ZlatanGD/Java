public class Coureur
{
    private int nuDossard;
    private double tempsAu100;
    private boolean aLeTemoin;
    public Coureur(int nuDossard)
    {
        double vreme = Math.random() * (15 - 11 + 1) + 11;
        this.tempsAu100 = vreme;
        this.aLeTemoin = false;
        this.nuDossard = nuDossard;
    }
    public Coureur()
    {
        this(((int)(Math.random() * (1000 - 1 + 1) + 1)));
    }
    public int getNuDossard()
    {
        return this.nuDossard;
    }
    public double getTempsAu100()
    {
        return this.tempsAu100;
    }
    public boolean getALeTemoin()
    {
        return this.aLeTemoin;
    }
    public void setAletemoin(boolean b)
    {
        this.aLeTemoin = b;
    }
    public String toString()
    {
        return("Coureur "+this.nuDossard+" temps au 100m: "+this.tempsAu100+", a le temoin: "+this.aLeTemoin);
    }
    public void passeTemoin(Coureur c)
    {
        System.out.println("Moi, coureur "+this.nuDossard+", je pass le temoin au coureur "+c.nuDossard);
        c.aLeTemoin = false;
    }
    public void courir()
    {
        System.out.println("Je suis le coureur "+this.nuDossard+" et je cours");
    }
}
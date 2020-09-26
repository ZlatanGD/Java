public class TestVillageois
{
    public static void main(String[] args)
    {
        Villageois Zlatan = new Villageois("Zlatan");
        Villageois Stefan = new Villageois("Stefan");
        Villageois Ivan = new Villageois("Ivan");
        Villageois Milena = new Villageois("Milena");
        String test = Zlatan.toString();
        //System.out.println(test);

        double total = Zlatan.poidsSoulever() + Stefan.poidsSoulever() + Milena.poidsSoulever() + Ivan.poidsSoulever();
        if(total > 100.0)
        {
            System.out.println("La roche est soulve!");
        }
        else
        {
            System.out.println("La roche reste immobile");
        }
        
    }
}
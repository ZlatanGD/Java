public class TestOrchestre
{
    public static void main(String[] args)
    {
        Orchestre o = new Orchestre();

        Piano p =  new Piano(10.2, 2.0);
        Trompette t = new Trompette(15.2, 2.2);
        Guitare g = new Guitare(25.3, 2.6);

        o.ajouterInstrument(p);
        o.ajouterInstrument(t);
        o.ajouterInstrument(g);

        System.out.println("\nIl y a "+o.getCpt()+" instruments \n");

        o.jouer();
        
    }
}
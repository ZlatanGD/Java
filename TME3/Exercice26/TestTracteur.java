public class TestTracteur
{
    public static void main(String[] args)
    {
        Roue g1 = new Roue(120);
        Roue g2 = new Roue(120);
        Roue p1 = new Roue();
        Roue p2 = new Roue();

        Roue g3 = new Roue(53);
        Roue g4 = new Roue(53);
        Roue p3 = new Roue(73);
        Roue p4 = new Roue(73);

        Cabine c1 = new Cabine(2, "Bleu");
        Cabine c2 = new Cabine(3, "Rouge");

        Tracteur t1 = new Tracteur(g1, g2, p1, p2, c1);
        Tracteur t2 = t1;
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        t2.peindre("Jaune");

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        //Il faut creer le tracteur t2 comme un nouveau tracteur.

        
    }
}
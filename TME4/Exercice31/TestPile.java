public class TestPile
{
    public static void main(String[] args)
    {
        Machin m1 = new Machin("Zlatan", 20);
        Machin m2 = new Machin("Martin", 20);
        Machin m3 = new Machin("Ivan", 20);
        Machin m4 = new Machin("Stefan", 20);
        Pile tab = new Pile();

        tab.empiler(m1);
        tab.empiler(m2);
        tab.empiler(m3);
        tab.empiler(m4);

        tab.depiler();

        System.out.println(tab.estVide());
        System.out.println(tab.toString());

    }
}
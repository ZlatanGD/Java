public class TestPile
{
    public static void main(String[] args)
    {
        Machin m1 = new Machin("Zlatan", 20);
        Machin m2 = new Machin("Stefan", 21);
        Machin m3 = new Machin("Martin", 22);

        Pile p1 = new Pile(10);

        System.out.println(p1.estVide());
        System.out.println(p1.estPleine());
        

        p1.empiler(m1);
        p1.empiler(m2);
        p1.empiler(m3);
        
        System.out.println(p1.toString());

        p1.depiler();
        p1.depiler();

        System.out.println(p1.toString());

        p1.empiler(m3);

        System.out.println(p1.toString());
        

        
        
    }
}
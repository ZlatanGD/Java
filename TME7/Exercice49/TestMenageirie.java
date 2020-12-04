public class TestMenageirie 
{
    public static void main(String[] args)
    {
        Menagerie m = new Menagerie();

        Vache v1 = new Vache("Stephanie", 5, 4);
        Vache v2 = new Vache("Raphael", 15, 4);
        Vache v3 = new Vache("DonDon", 11, 4);

        Boas b1 = new Boas("Roger", 6);
        Boas b2 = new Boas("Bico", 6);
        Boas b3 = new Boas("Lauren", 6);

        Canards c = new Canards("Martin", 2, 2);

        Saumons s = new Saumons("Stephan", 1);

        Millepattes m1 = new Millepattes("Lista", 1);

        m.ajouter(v1);
        m.ajouter(v2);
        m.ajouter(v3);
        m.ajouter(b1);
        m.ajouter(b2);
        m.ajouter(b3);
        m.ajouter(c);
        m.ajouter(s);
        m.ajouter(m1);

        System.out.println(m.toString());
        m.midi();
        
        m.vieillirTous();

        System.out.println(m.toString());
        
        


        
    }    
}

public class TestTableauInt
{
    public static void main(String[] args)
    {
        TableauInt t1 = new TableauInt();
        System.out.println(t1.rangMax());
        System.out.println(t1.somme());

        TableauInt t2 = new TableauInt(5);
        System.out.println(t1.egal(t2));
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
    }
}
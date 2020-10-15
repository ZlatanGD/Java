public class TestTrianglePascal
{
    public static void main(String[] args)
    {
        TrianglePascal t1 = new TrianglePascal(5);
        t1.remplirTriangle();
        System.out.println(t1.toString());


        TrianglePascal t2 = new TrianglePascal(15);
        t2.remplirTriangle();
        System.out.println(t2.toString());

        TrianglePascal t3 = new TrianglePascal(8);
        t3.remplirTriangle();
        System.out.println(t3.toString());

        TrianglePascal t4 = new TrianglePascal(9);
        t4.remplirTriangle();
        System.out.println(t4.toString());
    }
}
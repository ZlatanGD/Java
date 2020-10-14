public class TestTriangle
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);

        Point p4 = new Point(1,1);
        Point p5 = new Point(2,2);
        Point p6 = new Point(3,3);
        
        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p4, p5, p6);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.equals(t2));
        

    }
}
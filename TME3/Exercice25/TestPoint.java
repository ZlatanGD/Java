public class TestPoint
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1,2);
        Point p2 = new Point(12,8);
        System.out.println(p1.distance(p2));

        p1.deplaceToi(5,6);
        System.out.println(p1.distance(p2));

    }
}
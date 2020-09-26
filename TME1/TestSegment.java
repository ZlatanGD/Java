public class TestSegment
{
    public static void main(String[] args)
    {
        Segment s1 = new Segment(6,8);
        Segment s2 = new Segment(12,5);

        int longr = s1.longueur();
        System.out.println(longr);

        int lang = s2.longueur();
        System.out.println(lang);


        if(longr > lang)
        {
            System.out.println("Le premier segment est plus grand");
        }
        else if(longr < lang)
        {
            System.out.println("Le premier segment est plus petit");
        }
        else
        {
            System.out.println("Les deux segments sont egaux");
        }
        


    }
}
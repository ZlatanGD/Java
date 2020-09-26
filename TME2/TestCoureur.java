public class TestCoureur
{
    public static void main(String[] args)
    {
        Coureur c1 = new Coureur();
        Coureur c2 = new Coureur();
        Coureur c3 = new Coureur();
        Coureur c4 = new Coureur();

        int test1 = c1.getNuDossard();
        //System.out.println(test1);

        double test2 = c1.getTempsAu100();
        System.out.println(test2);


        c1.setAletemoin(true);
        boolean test3 = c1.getALeTemoin();
        System.out.println(test3);

        int test = c1.getNuDossard();
        System.out.println(test);
        double time1 = 0;
        double time2 = 0;
        double time3 = 0;
        double time4 = 0;
        double time = 0;

        for(int j = 0; j<4; j++)
        {
            Coureur loop = new Coureur();
            for(int i = 0; i<4; i++)
            {
                time += loop.getTempsAu100();

            }
            System.out.println("Le temps du coureur "+j+" est "+time);
            time = 0;
        }
   
    }
}
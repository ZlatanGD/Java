public class Nom
{
    private static char[] voyelles={'a','e','i','o','u','y'};
    private static char[] consonnes={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};

    public static int rendAlea(int inf, int sup)
    {
        return (int)(Math.random() * ((sup - inf) + 1)) + inf;
    }

    public static boolean estPair(int n)
    {
        if(n%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static char rendVoyelle()
    {
        return voyelles[rendAlea(0,5)];
    }
    public static char rendConsonne()
    {
        return consonnes[rendAlea(0,19)];
    }
    public static String genererNom()
    {
        int taille = rendAlea(3,6);
        String res="";
        for(int i = 0; i<taille; i++)
        {
            if(estPair(i))
            {
                res+=rendVoyelle();
            }
            else
            {
                res +=rendConsonne();
            }
            
        }return res;
    }

}
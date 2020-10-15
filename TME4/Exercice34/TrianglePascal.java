public class TrianglePascal
{
    private int[][] tab;

    public TrianglePascal(int taille)
    {
        tab = new int[taille][taille];
    }


    public void remplirTriangle()
    {
        for(int i=0; i<tab.length; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(j==0 || j==i)
                {
                    tab[i][j] = 1;
                }
                else
                {
                    tab[i][j] = tab[i-1][j-1]+tab[i-1][j];
                }
            }
        }
    }

    public String toString()
    {
        String res="";
        for(int i=0; i<tab.length; i++)
        {
            for(int j=0; j<=i; j++)
            {
                res+=" "+tab[i][j];
            }res+="\n";
        }return res;
    }
}
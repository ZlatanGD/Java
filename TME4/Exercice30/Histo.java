public class Histo
{
    private int[] hist;

    public Histo()
    {
        hist = new int[21];
    }

    public void ajouter(int a)
    {
        hist[a]++;
    }

    public Histo(int[] tab)
    {
        this();
        for(int i=0; i<tab.length; i++)
        {
            ajouter(tab[i]);
            
        }
    }

    public void affichageHistTab()
    {
        for(int i=0; i<hist.length; i++)
        {
            System.out.print(hist[i]+" ");
        }
    }
    public void affichageHist()
    {
        String temp="";
        for(int i=0; i<hist.length; i++)
        {   if(i<10)
            {
                for(int j=0; j<hist[i]; j++){temp+="*";}
                System.out.println(i+"  | "+temp);
                temp="";
            }else
            {
                for(int p=0; p<hist[i]; p++){temp+="*";}
                System.out.println(i+" | "+temp);
                temp="";
            }
        }
    }

}